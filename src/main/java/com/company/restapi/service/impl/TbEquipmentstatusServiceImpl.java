package com.company.restapi.service.impl;

import com.company.restapi.dao.TbEquipmentstatusMapper;
import com.company.restapi.model.TbEquipmentstatus;
import com.company.restapi.service.TbEquipmentstatusService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbEquipmentstatusServiceImpl extends AbstractService<TbEquipmentstatus> implements TbEquipmentstatusService {
    @Resource
    private TbEquipmentstatusMapper tbEquipmentstatusMapper;

}
