package com.company.restapi.service.impl;

import com.company.restapi.dao.DeviceRemindMapper;
import com.company.restapi.model.DeviceRemind;
import com.company.restapi.service.DeviceRemindService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/02/05.
 */
@Service
@Transactional
public class DeviceRemindServiceImpl extends AbstractService<DeviceRemind> implements DeviceRemindService {
    @Resource
    private DeviceRemindMapper deviceRemindMapper;

}
