package com.company.restapi.service.impl;

import com.company.restapi.dao.TbNewsinformationMapper;
import com.company.restapi.model.TbNewsinformation;
import com.company.restapi.service.TbNewsinformationService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbNewsinformationServiceImpl extends AbstractService<TbNewsinformation> implements TbNewsinformationService {
    @Resource
    private TbNewsinformationMapper tbNewsinformationMapper;

}
