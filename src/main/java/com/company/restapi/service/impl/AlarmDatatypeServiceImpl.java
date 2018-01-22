package com.company.restapi.service.impl;

import com.company.restapi.dao.AlarmDatatypeMapper;
import com.company.restapi.model.AlarmDatatype;
import com.company.restapi.service.AlarmDatatypeService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class AlarmDatatypeServiceImpl extends AbstractService<AlarmDatatype> implements AlarmDatatypeService {
    @Resource
    private AlarmDatatypeMapper alarmDatatypeMapper;

}
