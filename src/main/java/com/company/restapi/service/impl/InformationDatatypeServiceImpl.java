package com.company.restapi.service.impl;

import com.company.restapi.dao.InformationDatatypeMapper;
import com.company.restapi.model.InformationDatatype;
import com.company.restapi.service.InformationDatatypeService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class InformationDatatypeServiceImpl extends AbstractService<InformationDatatype> implements InformationDatatypeService {
    @Resource
    private InformationDatatypeMapper informationDatatypeMapper;

}
