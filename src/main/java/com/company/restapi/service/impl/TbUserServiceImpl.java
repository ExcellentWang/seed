package com.company.restapi.service.impl;

import com.company.restapi.dao.TbUserMapper;
import com.company.restapi.model.TbUser;
import com.company.restapi.service.TbUserService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbUserServiceImpl extends AbstractService<TbUser> implements TbUserService {
    @Resource
    private TbUserMapper tbUserMapper;

}
