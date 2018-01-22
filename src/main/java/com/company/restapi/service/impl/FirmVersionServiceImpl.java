package com.company.restapi.service.impl;

import com.company.restapi.dao.FirmVersionMapper;
import com.company.restapi.model.FirmVersion;
import com.company.restapi.service.FirmVersionService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class FirmVersionServiceImpl extends AbstractService<FirmVersion> implements FirmVersionService {
    @Resource
    private FirmVersionMapper firmVersionMapper;

}
