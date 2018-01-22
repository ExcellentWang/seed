package com.company.restapi.service.impl;

import com.company.restapi.dao.TSDetailMapper;
import com.company.restapi.model.TSDetail;
import com.company.restapi.service.TSDetailService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TSDetailServiceImpl extends AbstractService<TSDetail> implements TSDetailService {
    @Resource
    private TSDetailMapper tSDetailMapper;

}
