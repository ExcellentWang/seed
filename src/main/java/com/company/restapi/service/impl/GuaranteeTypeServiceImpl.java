package com.company.restapi.service.impl;

import com.company.restapi.dao.GuaranteeTypeMapper;
import com.company.restapi.model.GuaranteeType;
import com.company.restapi.service.GuaranteeTypeService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class GuaranteeTypeServiceImpl extends AbstractService<GuaranteeType> implements GuaranteeTypeService {
    @Resource
    private GuaranteeTypeMapper guaranteeTypeMapper;

}
