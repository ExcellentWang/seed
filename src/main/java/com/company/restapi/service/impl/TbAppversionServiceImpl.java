package com.company.restapi.service.impl;

import com.company.restapi.dao.TbAppversionMapper;
import com.company.restapi.model.TbAppversion;
import com.company.restapi.service.TbAppversionService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbAppversionServiceImpl extends AbstractService<TbAppversion> implements TbAppversionService {
    @Resource
    private TbAppversionMapper tbAppversionMapper;

}
