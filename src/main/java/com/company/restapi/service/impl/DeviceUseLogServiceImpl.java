package com.company.restapi.service.impl;

import com.company.restapi.dao.DeviceUseLogMapper;
import com.company.restapi.model.DeviceUseLog;
import com.company.restapi.service.DeviceUseLogService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class DeviceUseLogServiceImpl extends AbstractService<DeviceUseLog> implements DeviceUseLogService {
    @Resource
    private DeviceUseLogMapper deviceUseLogMapper;

}
