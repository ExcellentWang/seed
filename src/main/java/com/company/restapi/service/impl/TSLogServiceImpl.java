package com.company.restapi.service.impl;

import com.company.restapi.dao.TSLogMapper;
import com.company.restapi.model.TSLog;
import com.company.restapi.service.TSLogService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TSLogServiceImpl extends AbstractService<TSLog> implements TSLogService {
    @Resource
    private TSLogMapper tSLogMapper;

}
