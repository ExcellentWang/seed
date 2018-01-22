package com.company.restapi.service.impl;

import com.company.restapi.dao.TbEquipmentversionMapper;
import com.company.restapi.model.TbEquipmentversion;
import com.company.restapi.service.TbEquipmentversionService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbEquipmentversionServiceImpl extends AbstractService<TbEquipmentversion> implements TbEquipmentversionService {
    @Resource
    private TbEquipmentversionMapper tbEquipmentversionMapper;

}
