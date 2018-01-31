package com.company.restapi.service;

import com.company.restapi.model.IntelAccount;
import com.company.restapi.model.IntelDevice;
import com.company.restapi.model.ShareDevice;
import com.company.restapi.model.UserDevice;

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

    Map<Object,Object> getDeviceInfo(UserDevice userDevice);

    Map<Object,Object> unshareDevice();
}
