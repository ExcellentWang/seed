package com.company.socket.service.impl;

import com.company.restapi.dao.DeviceRuntimeInfoMapper;
import com.company.restapi.model.DeviceRuntimeInfo;
import com.company.restapi.service.impl.AppUserServiceImpl;
import com.company.socket.service.DeviceSocketService;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.HashMap;
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
    /**
     * @param :
     * @return 处理心跳包
     * @author wang 2018/1/30 下午10:28
     **/
    @Override
    public boolean handHeartbeat(HashMap<Object, Object> objectObjectHashMap) {
        //查runtimeinfo
        if (objectObjectHashMap.isEmpty()) {
            return false;
        }
        //new 对象用于写数据库
        DeviceRuntimeInfo deviceRuntimeInfo = new DeviceRuntimeInfo().setDeviceId((int) objectObjectHashMap.get(Integer.valueOf(1)));
        List<DeviceRuntimeInfo> select = deviceRuntimeInfoMapper.select(deviceRuntimeInfo);
        if (select.isEmpty()) {
            int insert = deviceRuntimeInfoMapper.insert(deviceRuntimeInfo);
            if (insert == 0) {
                logger.info("心跳包初始化异常...");
                return  false;
            }
        } else {
            int i = deviceRuntimeInfoMapper.updateByPrimaryKey(deviceRuntimeInfo);
            if (i ==0) {
                logger.info("心跳包更新异常...");
                return  false;
            }else{
                redisTemplate.opsForValue().set(deviceRuntimeInfo.getDeviceId(),deviceRuntimeInfo);
            }
        }
        return true;
    }
}
