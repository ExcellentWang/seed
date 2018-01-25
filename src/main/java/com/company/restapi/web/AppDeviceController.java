package com.company.restapi.web;

import com.company.restapi.core.Result;
import com.company.restapi.model.UserDevice;
import com.company.restapi.service.DeviceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * com.company.restapi.web
 *
 * @author Wang
 * @create 2018-01-25 下午3:52
 * @description:
 **/
@RestController
public class AppDeviceController {
    private final static Logger logger = LoggerFactory.getLogger(AppDeviceController.class);
    /**
     * @author wang 2018/1/25 下午3:59
     * @param
     * @return
     * 用户与设备的绑定
    **/
    @Resource
    private DeviceService deviceService;
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping(value = "device/bindingDevice")
    public Result bindingDevice(UserDevice userDevice){
        deviceService.bindingDevice(userDevice);
        return null;
    }
}
