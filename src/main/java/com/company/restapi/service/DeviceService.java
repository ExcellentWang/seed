package com.company.restapi.service;

import com.company.restapi.model.*;

import java.util.HashMap;
import java.util.Map;

/**
 * com.company.restapi.service
 *
 * @author Wang
 * @create 2018-01-25 下午4:08
 * @description:
 **/
public interface DeviceService {
    Map<Object,Object> bindingDevice(IntelDevice intelDevice, UserDevice userDevice);

    Map<Object,Object> shareDevice(ShareDevice shareDevice);

    Map<Object,Object> findSharedDeivce(UserDevice userDevice);

    Map<Object,Object> findBindedDevice(UserDevice userDevice);

    Map<Object,Object> getDeviceInfo(DeviceRuntimeInfo deviceRuntimeInfo);

    Map<Object,Object> unshareDevice(UserDevice userDevice);

    Map<Object,Object> setDeviceRemind(DeviceRemind deviceRemind);

    Map<Object,Object> findDeviceRemind(DeviceRemind deviceRemind);

    Map<Object,Object> makeAppointment(DeviceAppointment deviceAppointment);
}
