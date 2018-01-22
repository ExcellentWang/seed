package com.company.restapi.service.impl;

import com.company.restapi.dao.InformationUserMapper;
import com.company.restapi.model.InformationUser;
import com.company.restapi.service.InformationUserService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class InformationUserServiceImpl extends AbstractService<InformationUser> implements InformationUserService {
    @Resource
    private InformationUserMapper informationUserMapper;

}
