package com.company.restapi.service.impl;

import com.company.restapi.dao.TbDeviceinformationMapper;
import com.company.restapi.model.TbDeviceinformation;
import com.company.restapi.service.TbDeviceinformationService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbDeviceinformationServiceImpl extends AbstractService<TbDeviceinformation> implements TbDeviceinformationService {
    @Resource
    private TbDeviceinformationMapper tbDeviceinformationMapper;

}
