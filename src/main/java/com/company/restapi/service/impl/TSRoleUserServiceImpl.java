package com.company.restapi.service.impl;

import com.company.restapi.dao.TSRoleUserMapper;
import com.company.restapi.model.TSRoleUser;
import com.company.restapi.service.TSRoleUserService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TSRoleUserServiceImpl extends AbstractService<TSRoleUser> implements TSRoleUserService {
    @Resource
    private TSRoleUserMapper tSRoleUserMapper;

}
