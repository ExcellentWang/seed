package com.company.restapi.service.impl;

import com.company.restapi.dao.TbCustomerserviceMapper;
import com.company.restapi.model.TbCustomerservice;
import com.company.restapi.service.TbCustomerserviceService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbCustomerserviceServiceImpl extends AbstractService<TbCustomerservice> implements TbCustomerserviceService {
    @Resource
    private TbCustomerserviceMapper tbCustomerserviceMapper;

}
