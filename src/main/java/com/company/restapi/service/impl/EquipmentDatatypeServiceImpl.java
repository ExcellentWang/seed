package com.company.restapi.service.impl;

import com.company.restapi.dao.EquipmentDatatypeMapper;
import com.company.restapi.model.EquipmentDatatype;
import com.company.restapi.service.EquipmentDatatypeService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class EquipmentDatatypeServiceImpl extends AbstractService<EquipmentDatatype> implements EquipmentDatatypeService {
    @Resource
    private EquipmentDatatypeMapper equipmentDatatypeMapper;

}
