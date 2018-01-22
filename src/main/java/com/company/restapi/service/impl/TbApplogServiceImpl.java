package com.company.restapi.service.impl;

import com.company.restapi.dao.TbApplogMapper;
import com.company.restapi.model.TbApplog;
import com.company.restapi.service.TbApplogService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbApplogServiceImpl extends AbstractService<TbApplog> implements TbApplogService {
    @Resource
    private TbApplogMapper tbApplogMapper;

}
