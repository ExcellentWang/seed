package com.company.restapi.service.impl;

import com.company.restapi.dao.TbGuaranteeMapper;
import com.company.restapi.model.TbGuarantee;
import com.company.restapi.service.TbGuaranteeService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbGuaranteeServiceImpl extends AbstractService<TbGuarantee> implements TbGuaranteeService {
    @Resource
    private TbGuaranteeMapper tbGuaranteeMapper;

}
