package com.company.restapi.service.impl;

import com.company.restapi.dao.AdminsMapper;
import com.company.restapi.model.Admins;
import com.company.restapi.service.AdminsService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class AdminsServiceImpl extends AbstractService<Admins> implements AdminsService {
    @Resource
    private AdminsMapper adminsMapper;

}
