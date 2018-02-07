package com.company.socket.service.impl;

import com.company.restapi.model.DeviceMsg;
import com.conpany.project.Tester;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * com.company.socket.service.impl
 *
 * @author Wang
 * @create 2018-02-05 下午8:42
 * @description:
 **/
public class DeviceSocketServiceImplTest {
    @Test
    public void handleDeviceType() throws Exception {
        DeviceSocketServiceImpl deviceSocketService = new DeviceSocketServiceImpl();
        deviceSocketService.handleDeviceType("LDCT01201704230001:xtpc,032,99,00,uuu,ooo,yyy,OR");
    }
    @Test
    public void toStringTest(){
        DeviceMsg deviceMsg = new DeviceMsg();
//        deviceMsg.se
        System.out.println(deviceMsg.toString());
    }

}