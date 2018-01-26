package com.company.restapi.service.impl;

import com.company.restapi.dao.IntelDeviceMapper;
import com.company.restapi.model.IntelDevice;
import com.company.restapi.service.IntelDeviceService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/26.
 */
@Service
@Transactional
public class IntelDeviceServiceImpl extends AbstractService<IntelDevice> implements IntelDeviceService {
    @Resource
    private IntelDeviceMapper intelDeviceMapper;

}
