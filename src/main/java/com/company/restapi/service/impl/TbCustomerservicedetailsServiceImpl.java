package com.company.restapi.service.impl;

import com.company.restapi.dao.TbCustomerservicedetailsMapper;
import com.company.restapi.model.TbCustomerservicedetails;
import com.company.restapi.service.TbCustomerservicedetailsService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbCustomerservicedetailsServiceImpl extends AbstractService<TbCustomerservicedetails> implements TbCustomerservicedetailsService {
    @Resource
    private TbCustomerservicedetailsMapper tbCustomerservicedetailsMapper;

}
