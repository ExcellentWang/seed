package com.company.socket.service;

/**
 * com.company.socket.service
 *
 * @author Wang
 * @create 2018-01-31 下午12:24
 * @description:
 **/
public interface DeviceSocketService  {
    //以上是tcp/ip通信的业务逻辑
    boolean handHeartbeat(String o);

    String handleDeviceType(String s);

    String handleFlowType(String s);
}
