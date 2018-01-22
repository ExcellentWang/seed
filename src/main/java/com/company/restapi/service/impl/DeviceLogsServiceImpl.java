package com.company.restapi.service.impl;

import com.company.restapi.dao.DeviceLogsMapper;
import com.company.restapi.model.DeviceLogs;
import com.company.restapi.service.DeviceLogsService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class DeviceLogsServiceImpl extends AbstractService<DeviceLogs> implements DeviceLogsService {
    @Resource
    private DeviceLogsMapper deviceLogsMapper;

}
