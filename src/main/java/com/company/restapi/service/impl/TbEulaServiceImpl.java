package com.company.restapi.service.impl;

import com.company.restapi.dao.TbEulaMapper;
import com.company.restapi.model.TbEula;
import com.company.restapi.service.TbEulaService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbEulaServiceImpl extends AbstractService<TbEula> implements TbEulaService {
    @Resource
    private TbEulaMapper tbEulaMapper;

}
