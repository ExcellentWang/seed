package com.company.restapi.service.impl;

import com.company.restapi.dao.TSMenuMapper;
import com.company.restapi.model.TSMenu;
import com.company.restapi.service.TSMenuService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TSMenuServiceImpl extends AbstractService<TSMenu> implements TSMenuService {
    @Resource
    private TSMenuMapper tSMenuMapper;

}
