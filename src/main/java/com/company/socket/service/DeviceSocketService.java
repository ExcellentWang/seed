package com.company.socket.service;

import com.company.restapi.core.Service;
import com.company.restapi.model.DeviceRuntimeInfo;
import org.apache.ibatis.exceptions.TooManyResultsException;
import tk.mybatis.mapper.entity.Condition;

import java.util.HashMap;
import java.util.List;

/**
 * com.company.socket.service
 *
 * @author Wang
 * @create 2018-01-31 下午12:24
 * @description:
 **/
public interface DeviceSocketService  {
    //以上是tcp/ip通信的业务逻辑
    boolean handHeartbeat(HashMap<Object, Object> objectObjectHashMap);
}
