package com.company.restapi.service.impl;

import com.company.restapi.dao.TSDictMapper;
import com.company.restapi.model.TSDict;
import com.company.restapi.service.TSDictService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TSDictServiceImpl extends AbstractService<TSDict> implements TSDictService {
    @Resource
    private TSDictMapper tSDictMapper;

}
