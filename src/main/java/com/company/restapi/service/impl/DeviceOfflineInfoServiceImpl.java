package com.company.restapi.service.impl;

import com.company.restapi.dao.DeviceOfflineInfoMapper;
import com.company.restapi.model.DeviceOfflineInfo;
import com.company.restapi.service.DeviceOfflineInfoService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/30.
 */
@Service
@Transactional
public class DeviceOfflineInfoServiceImpl extends AbstractService<DeviceOfflineInfo> implements DeviceOfflineInfoService {
    @Resource
    private DeviceOfflineInfoMapper deviceOfflineInfoMapper;

}
