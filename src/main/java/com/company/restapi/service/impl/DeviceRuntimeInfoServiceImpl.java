package com.company.restapi.service.impl;

import com.company.restapi.dao.DeviceRuntimeInfoMapper;
import com.company.restapi.model.DeviceRuntimeInfo;
import com.company.restapi.service.DeviceRuntimeInfoService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/02/07.
 */
@Service
@Transactional
public class DeviceRuntimeInfoServiceImpl extends AbstractService<DeviceRuntimeInfo> implements DeviceRuntimeInfoService {
    @Resource
    private DeviceRuntimeInfoMapper deviceRuntimeInfoMapper;

}
