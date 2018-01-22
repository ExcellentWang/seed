package com.company.restapi.service.impl;

import com.company.restapi.dao.InformationUserDelMapper;
import com.company.restapi.model.InformationUserDel;
import com.company.restapi.service.InformationUserDelService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class InformationUserDelServiceImpl extends AbstractService<InformationUserDel> implements InformationUserDelService {
    @Resource
    private InformationUserDelMapper informationUserDelMapper;

}
