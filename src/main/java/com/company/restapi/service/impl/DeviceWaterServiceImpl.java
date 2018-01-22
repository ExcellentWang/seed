package com.company.restapi.service.impl;

import com.company.restapi.dao.DeviceWaterMapper;
import com.company.restapi.model.DeviceWater;
import com.company.restapi.service.DeviceWaterService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class DeviceWaterServiceImpl extends AbstractService<DeviceWater> implements DeviceWaterService {
    @Resource
    private DeviceWaterMapper deviceWaterMapper;

}
