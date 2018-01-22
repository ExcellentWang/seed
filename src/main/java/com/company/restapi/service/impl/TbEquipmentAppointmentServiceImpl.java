package com.company.restapi.service.impl;

import com.company.restapi.dao.TbEquipmentAppointmentMapper;
import com.company.restapi.model.TbEquipmentAppointment;
import com.company.restapi.service.TbEquipmentAppointmentService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbEquipmentAppointmentServiceImpl extends AbstractService<TbEquipmentAppointment> implements TbEquipmentAppointmentService {
    @Resource
    private TbEquipmentAppointmentMapper tbEquipmentAppointmentMapper;

}
