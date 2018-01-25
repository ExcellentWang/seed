package com.company.restapi.service.impl;

import com.company.restapi.dao.UserDeviceMapper;
import com.company.restapi.model.UserDevice;
import com.company.restapi.service.UserDeviceService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/25.
 */
@Service
@Transactional
public class UserDeviceServiceImpl extends AbstractService<UserDevice> implements UserDeviceService {
    @Resource
    private UserDeviceMapper userDeviceMapper;

}
