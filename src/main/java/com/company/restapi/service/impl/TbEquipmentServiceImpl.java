package com.company.restapi.service.impl;

import com.company.restapi.dao.TbEquipmentMapper;
import com.company.restapi.model.TbEquipment;
import com.company.restapi.service.TbEquipmentService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbEquipmentServiceImpl extends AbstractService<TbEquipment> implements TbEquipmentService {
    @Resource
    private TbEquipmentMapper tbEquipmentMapper;

}
