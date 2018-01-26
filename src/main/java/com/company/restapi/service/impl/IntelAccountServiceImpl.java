package com.company.restapi.service.impl;

import com.company.restapi.dao.IntelAccountMapper;
import com.company.restapi.model.IntelAccount;
import com.company.restapi.service.IntelAccountService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/26.
 */
@Service
@Transactional
public class IntelAccountServiceImpl extends AbstractService<IntelAccount> implements IntelAccountService {
    @Resource
    private IntelAccountMapper intelAccountMapper;

}
