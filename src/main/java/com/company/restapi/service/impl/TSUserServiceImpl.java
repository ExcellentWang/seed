package com.company.restapi.service.impl;

import com.company.restapi.dao.TSUserMapper;
import com.company.restapi.model.TSUser;
import com.company.restapi.service.TSUserService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TSUserServiceImpl extends AbstractService<TSUser> implements TSUserService {
    @Resource
    private TSUserMapper tSUserMapper;

}
