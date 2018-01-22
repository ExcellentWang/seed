package com.company.restapi.service.impl;

import com.company.restapi.dao.TbWcalMapper;
import com.company.restapi.model.TbWcal;
import com.company.restapi.service.TbWcalService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbWcalServiceImpl extends AbstractService<TbWcal> implements TbWcalService {
    @Resource
    private TbWcalMapper tbWcalMapper;

}
