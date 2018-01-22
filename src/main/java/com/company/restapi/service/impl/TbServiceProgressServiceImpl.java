package com.company.restapi.service.impl;

import com.company.restapi.dao.TbServiceProgressMapper;
import com.company.restapi.model.TbServiceProgress;
import com.company.restapi.service.TbServiceProgressService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbServiceProgressServiceImpl extends AbstractService<TbServiceProgress> implements TbServiceProgressService {
    @Resource
    private TbServiceProgressMapper tbServiceProgressMapper;

}
