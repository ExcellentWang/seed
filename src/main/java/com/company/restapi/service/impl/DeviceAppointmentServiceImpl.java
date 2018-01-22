package com.company.restapi.service.impl;

import com.company.restapi.dao.DeviceAppointmentMapper;
import com.company.restapi.model.DeviceAppointment;
import com.company.restapi.service.DeviceAppointmentService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/22.
 */
@Service
@Transactional
public class DeviceAppointmentServiceImpl extends AbstractService<DeviceAppointment> implements DeviceAppointmentService {
    @Resource
    private DeviceAppointmentMapper deviceAppointmentMapper;

}
