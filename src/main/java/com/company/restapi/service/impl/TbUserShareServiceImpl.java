package com.company.restapi.service.impl;

import com.company.restapi.dao.TbUserShareMapper;
import com.company.restapi.model.TbUserShare;
import com.company.restapi.service.TbUserShareService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbUserShareServiceImpl extends AbstractService<TbUserShare> implements TbUserShareService {
    @Resource
    private TbUserShareMapper tbUserShareMapper;

}
