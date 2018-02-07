package com.company.restapi.web;

import com.company.common.constant.BaseConstant;
import com.company.restapi.core.Result;
import com.company.restapi.core.ResultGenerator;
import com.company.restapi.dao.UserDeviceMapper;
import com.company.restapi.model.*;
import com.company.restapi.service.DeviceService;
import com.company.restapi.service.UserDeviceService;
import com.company.restapi.service.impl.UserDeviceServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

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
    @Resource
    private DeviceService deviceService;
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    /**
     * @param
     * @return 用户与设备的绑定
     * @author wang 2018/1/25 下午3:59
     **/
    @PostMapping(value = "device/bindingDevice")
    public Result bindingDevice(IntelDevice intelDevice, UserDevice userDevice) {
        try {
            Map<Object, Object> objectObjectMap = deviceService.bindingDevice(intelDevice, userDevice);
            return ResultGenerator.genSuccessResult(objectObjectMap);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(BaseConstant.controllerErrorMsg);
        }
    }

    /**
     * @param
     * @return 用户分享设备
     * @author wang 2018/1/26 上午10:36
     **/
    @PostMapping(value = "/device/shareDevice")
    public Result shareDevice(ShareDevice shareDevice) {
        try {
            Map<Object, Object> objectObjectMap = deviceService.shareDevice(shareDevice);
            return ResultGenerator.genSuccessResult(objectObjectMap);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(BaseConstant.controllerErrorMsg);
        }
    }

    /**
     * @param
     * @return 获取绑定设备列表
     * @author wang 2018/1/26 下午5:30
     **/
    @PostMapping(value = "/device/deviceList")
    public Result findDviceBinded(UserDevice userDevice) {

        try {
            Map<Object, Object> objectObjectMap = deviceService.findBindedDevice(userDevice);
            return ResultGenerator.genSuccessResult(objectObjectMap);

        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(BaseConstant.controllerErrorMsg);
        }
    }

    /**
     * @param
     * @return 获取分享列表
     * @author wang 2018/1/26 下午5:07
     **/
    @PostMapping(value = "/device/findDeviceShares")
    public Result findDeviceShares(UserDevice userDevice) {
        try {
            Map<Object, Object> objectObjectMap = deviceService.findSharedDeivce(userDevice);
            return ResultGenerator.genSuccessResult(objectObjectMap);

        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(BaseConstant.controllerErrorMsg);

        }
    }

    /**
     * @param
     * @return 获取单个设备详情
     * @author wang 2018/1/26 下午5:38
     **/
    @PostMapping(value = "/device/getDeviceDetail")
    public Result getDeivceInfo(DeviceRuntimeInfo deviceRuntimeInfo) {
        try {
            Map<Object, Object> objectObjectMap = deviceService.getDeviceInfo(deviceRuntimeInfo);
            return ResultGenerator.genSuccessResult(objectObjectMap);

        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(BaseConstant.controllerErrorMsg);

        }
    }

    /**
     * @param
     * @return 删除绑定设备
     * @author wang 2018/1/31 下午12:00
     **/
    @PostMapping(value = "/device/deleteDeviceShare")
    public Result deletDevice(UserDevice userDevice) {
        try {
            Map<Object, Object> objectObjectMap = deviceService.unshareDevice(userDevice);
            return ResultGenerator.genSuccessResult(objectObjectMap);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(BaseConstant.controllerErrorMsg);
        }
    }

    /**
     * @param
     * @return 设备提醒设置
     * @author wang 2018/2/3 下午8:41
     **/
    @PostMapping(value = "/device/deviceRemind")

    public Result setDeviceRemind(DeviceRemind deviceRemind) {
        try {
            Map<Object, Object> objectObjectMap = deviceService.setDeviceRemind(deviceRemind);
            return ResultGenerator.genSuccessResult(objectObjectMap);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(BaseConstant.controllerErrorMsg);
        }
    }

    /**
     * @param
     * @return
     * @author wang 2018/2/3 下午9:59
     * 发现提醒设置
     **/

    @PostMapping("device/findDeviceRemind")

    public Result findDeviceRemind(DeviceRemind deviceRemind) {
        try {
            Map<Object, Object> objectObjectMap = deviceService.findDeviceRemind(deviceRemind);
            return ResultGenerator.genSuccessResult(objectObjectMap);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(BaseConstant.controllerErrorMsg);
        }
    }
/**
 * @author wang 2018/2/7 下午3:57
 * @param
 * @return
 * 设备预约
**/
    public Result makeAppointment(DeviceAppointment deviceAppointment) {
        try {
            Map<Object, Object> objectObjectMap = deviceService.makeAppointment(deviceAppointment);
            return ResultGenerator.genSuccessResult(objectObjectMap);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(BaseConstant.controllerErrorMsg);
        }
    }
}
