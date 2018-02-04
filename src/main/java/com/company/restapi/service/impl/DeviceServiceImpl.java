package com.company.restapi.service.impl;

import com.company.common.constant.BaseConstant;
import com.company.restapi.dao.*;
import com.company.restapi.model.*;
import com.company.restapi.service.DeviceService;
import com.sun.org.apache.bcel.internal.generic.GOTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisKeyValueTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * com.company.restapi.service.impl
 *
 * @author Wang
 * @create 2018-01-26 上午9:34
 * @description:
 **/
@Service
@Transactional
@SuppressWarnings("all")
public class DeviceServiceImpl implements DeviceService {
    private final static Logger logger = LoggerFactory.getLogger(AppUserServiceImpl.class);
    @Resource
    private IntelAccountMapper intelAccountMapper;
    @Resource
    private IntelDeviceMapper intelDeviceMapper;
    @Resource
    private UserDeviceMapper userDeviceMapper;
    @Resource
    private ShareDeviceMapper shareDeviceMapper;
    @Resource
    private DeviceRuntimeInfoMapper deviceRuntimeInfoMapper;
    @Resource
    private  DeviceRemindMapper deviceRemindMapper;
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Resource
    private RedisTemplate redisTemplate;

    @Override
    public Map<Object, Object> bindingDevice(IntelDevice intelDevice, UserDevice userDevice) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        //查询当前设备
        IntelDevice intelDevice1 = intelDeviceMapper.selectOne(intelDevice);
        if (intelDevice1 == null) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "当前绑定设备不正确...");
            return objectObjectHashMap;
        }
        //查询当前绑定状态
        userDevice.setDeviceId(Long.toString(intelDevice1.getId()));
        userDevice.setDeviceStatus(Short.parseShort("1"));//绑定状态
        List<UserDevice> select = userDeviceMapper.select(userDevice);
        if (!select.isEmpty()) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "当前用户已绑定该设备...");
            return objectObjectHashMap;
        }
        //插入user_device(绑定)
        int insert = userDeviceMapper.insertSelective(userDevice);
        if (insert == 0) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "设备绑定失败...");
            return objectObjectHashMap;
        }
        objectObjectHashMap.put("code", BaseConstant.appUserSuccessStatus);
        objectObjectHashMap.put("msg", "绑定设备成功...");
        return objectObjectHashMap;
    }

    @Override
    public Map<Object, Object> shareDevice(ShareDevice shareDevice) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        //查询当前分享人
        IntelAccount intelAccount = shareDeviceMapper.selectIntelAccountById(shareDevice.getPhoneNo());
        if (intelAccount.getUserId() == 0 || intelAccount.getUserId() == Long.valueOf(shareDevice.getUserId())) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "分享人不存在或与绑定人相同...");
            return objectObjectHashMap;
        }
        //
        int insert = userDeviceMapper.insert(new UserDevice()
                .setUserId(shareDevice.getUserId())
                .setDeviceStatus(Short.parseShort("2"))
        );
        if (insert == 0) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "分享设备失败...");
            return objectObjectHashMap;
        }
        objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
        objectObjectHashMap.put("msg", "设备分享成功...");
        return objectObjectHashMap;
    }

    @Override
    public Map<Object, Object> findSharedDeivce(UserDevice userDevice) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        userDevice.setDeviceStatus(Short.parseShort("2"));
        List<UserDevice> select = userDeviceMapper.select(userDevice);
        if (select.isEmpty()) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "获取分享设备失败...");
            return objectObjectHashMap;
        }
        objectObjectHashMap.put("code", BaseConstant.appUserSuccessStatus);
        objectObjectHashMap.put("msg", "获取分享设备成功...");
        objectObjectHashMap.put("resultmap", select);
        return objectObjectHashMap;
    }

    @Override
    public Map<Object, Object> findBindedDevice(UserDevice userDevice) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        userDevice.setDeviceStatus(Short.parseShort("1"));
        List<UserDevice> select = userDeviceMapper.select(userDevice);
        if (select.isEmpty()) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "获取绑定设备失败...");
            return objectObjectHashMap;
        }
        objectObjectHashMap.put("code", BaseConstant.appUserSuccessStatus);
        objectObjectHashMap.put("msg", "获取绑定设备成功...");
        objectObjectHashMap.put("resultmap", select);
        return objectObjectHashMap;
    }

    /**
     * @param
     * @return 获取设备信息接口没有写完善!
     * @author wang 2018/1/26 下午5:57
     **/
    @Override
    public Map<Object, Object> getDeviceInfo(DeviceRuntimeInfo deviceRuntimeInfo) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        DeviceRuntimeInfo deviceRuntimeInfo1 = deviceRuntimeInfoMapper.selectOne(deviceRuntimeInfo);
        if (deviceRuntimeInfo1.getDeviceId().equals("")) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "获取设备详情失败...");
            return objectObjectHashMap;
        }
        objectObjectHashMap.put("code", BaseConstant.appUserSuccessStatus);
        objectObjectHashMap.put("msg", "获取设备详情成功...");
        return objectObjectHashMap;
    }

    @Override
    public Map<Object, Object> unshareDevice(UserDevice userDevice) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        int i = userDeviceMapper.delete(userDevice);
        if (i == 0) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "删除设备失败...");
            return objectObjectHashMap;
        }
        objectObjectHashMap.put("code", BaseConstant.appUserSuccessStatus);
        objectObjectHashMap.put("msg", "删除分享设备成功...");
        return objectObjectHashMap;
    }

    @Override
    public Map<Object, Object> setDeviceRemind(DeviceRemind deviceRemind) {
        //返回主键接收
        int key;
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        DeviceRemind deviceRemind1 = deviceRemindMapper.selectOne(deviceRemind);
        if (deviceRemind1.getEquipmentId().equals("")) {
            key = deviceRemindMapper.insert(deviceRemind);
        }else {
            key  = deviceRemindMapper.updateByPrimaryKeySelective(deviceRemind);
        }

        if (key == 0) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "删除设备失败...");
            return objectObjectHashMap;
        }
        objectObjectHashMap.put("code", BaseConstant.appUserSuccessStatus);
        objectObjectHashMap.put("msg", "删除分享设备成功...");
        return objectObjectHashMap;
    }

    @Override
    public Map<Object, Object> findDeviceRemind(DeviceRemind deviceRemind) {


        return null;
    }


}
