package com.company.restapi.service.impl;

import com.company.restapi.dao.TbDeviceErrorMapper;
import com.company.restapi.model.TbDeviceError;
import com.company.restapi.service.TbDeviceErrorService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbDeviceErrorServiceImpl extends AbstractService<TbDeviceError> implements TbDeviceErrorService {
    @Resource
    private TbDeviceErrorMapper tbDeviceErrorMapper;

}
