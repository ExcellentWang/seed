package com.company.restapi.service.impl;

import com.company.restapi.dao.TSRoleMenuMapper;
import com.company.restapi.model.TSRoleMenu;
import com.company.restapi.service.TSRoleMenuService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TSRoleMenuServiceImpl extends AbstractService<TSRoleMenu> implements TSRoleMenuService {
    @Resource
    private TSRoleMenuMapper tSRoleMenuMapper;

}
