package com.company.restapi.service.impl;

import com.company.restapi.dao.TSRoleMapper;
import com.company.restapi.model.TSRole;
import com.company.restapi.service.TSRoleService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TSRoleServiceImpl extends AbstractService<TSRole> implements TSRoleService {
    @Resource
    private TSRoleMapper tSRoleMapper;

}
