package com.company.restapi.service.impl;

import com.company.restapi.dao.LunboMapper;
import com.company.restapi.model.Lunbo;
import com.company.restapi.service.LunboService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class LunboServiceImpl extends AbstractService<Lunbo> implements LunboService {
    @Resource
    private LunboMapper lunboMapper;

}
