package com.company.restapi.service.impl;

import com.company.restapi.dao.TbAppupdateMapper;
import com.company.restapi.model.TbAppupdate;
import com.company.restapi.service.TbAppupdateService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbAppupdateServiceImpl extends AbstractService<TbAppupdate> implements TbAppupdateService {
    @Resource
    private TbAppupdateMapper tbAppupdateMapper;

}
