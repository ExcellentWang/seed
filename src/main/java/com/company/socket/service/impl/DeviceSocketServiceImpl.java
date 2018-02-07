package com.company.socket.service.impl;

import com.company.common.util.DeviceMsgUtils;
import com.company.restapi.dao.DeviceRuntimeInfoMapper;
import com.company.restapi.dao.IntelDeviceMapper;
import com.company.restapi.model.DeviceMsg;
import com.company.restapi.model.DeviceRuntimeInfo;
import com.company.restapi.model.IntelDevice;
import com.company.restapi.service.impl.AppUserServiceImpl;
import com.company.socket.service.DeviceSocketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * com.company.socket.service.impl
 *
 * @author Wang
 * @create 2018-01-31 下午12:27
 * @description:
 **/
@Service
@Transactional
public class DeviceSocketServiceImpl implements DeviceSocketService {
    private final static Logger logger = LoggerFactory.getLogger(AppUserServiceImpl.class);
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private DeviceRuntimeInfoMapper deviceRuntimeInfoMapper;
    @Resource
    private IntelDeviceMapper intelDeviceMapper;

    /**
     * @param :
     * @return 处理心跳包
     * @author wang 2018/1/30 下午10:28
     **/
    @Override
    public boolean handHeartbeat(String heartBeatString) {
        try {
            String[] split = heartBeatString.split("[/:/,]");
            for (String s : split) {
                System.out.println(s);
            }
            //查数据库
            IntelDevice intelDevice = new IntelDevice().setEquipmentnum(split[0]);
            IntelDevice intelDevice1 = intelDeviceMapper.selectOne(intelDevice);
            if (intelDevice1 == null) {
                return false;
            }
            DeviceRuntimeInfo deviceRuntimeInfo = new DeviceRuntimeInfo().setDeviceId(intelDevice1.getId());
            DeviceRuntimeInfo deviceRuntimeInfo1 = deviceRuntimeInfoMapper.selectOne(deviceRuntimeInfo);
            //插入或更新数据库
            if (deviceRuntimeInfo1.getUploadstatus().equals("04")) {
                deviceRuntimeInfo1.setUploadstatus("01");
            }
            if (deviceRuntimeInfo1.getDeviceId().equals("")) {
                deviceRuntimeInfoMapper.insert(deviceRuntimeInfo1);
            } else {
                deviceRuntimeInfoMapper.updateByPrimaryKey(deviceRuntimeInfo1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.info(e.getMessage());
            return false;
        }

        return true;
    }

    @Override
    public String handleDeviceType(String s) {
        //工具类,结构化字符串
        DeviceMsg deviceMsg = DeviceMsgUtils.generateDeviceMsg(s);
        List<IntelDevice> select = intelDeviceMapper.select(new IntelDevice().setEquipmentnum(deviceMsg.getDeviceNum()));
        if (select.isEmpty()) {
            return null;
        }
        int i = intelDeviceMapper.updateByPrimaryKey(select.get(0));
        if (i == 0) {
            return null;
        }
        deviceMsg.setCmdArgs(Arrays.asList(new String[]{"OK"}));
        deviceMsg.setCheckMsg("OR");
        return deviceMsg.toString();
    }

    @Override
    public String handleFlowType(String s) {
        DeviceMsg deviceMsg = DeviceMsgUtils.generateDeviceMsg(s);
        int flag = 0;
        IntelDevice intelDevice = intelDeviceMapper.selectOne(new IntelDevice().setEquipmentnum(deviceMsg.getDeviceNum()));
        DeviceRuntimeInfo deviceRuntimeInfo1 = new DeviceRuntimeInfo()
                .setDeviceId(intelDevice.getId());
        DeviceRuntimeInfo deviceRuntimeInfo = deviceRuntimeInfoMapper.selectOne(deviceRuntimeInfo1);
        if (deviceRuntimeInfo == null) {
            flag = deviceRuntimeInfoMapper.insert(deviceRuntimeInfo1.setWaterFlowType(deviceMsg.getCmdArgs().get(0)));
        }
        flag = deviceRuntimeInfoMapper.updateByPrimaryKey(deviceRuntimeInfo.setWaterFlowType(deviceMsg.getCmdArgs().get(0)));
        if (flag == 0) {
            deviceMsg.setStatus("ER");
            return deviceMsg.toString();
        }
        deviceMsg.setStatus("OK");
        return deviceMsg.toString();
    }
}
