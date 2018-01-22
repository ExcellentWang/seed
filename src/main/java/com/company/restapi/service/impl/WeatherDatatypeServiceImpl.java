package com.company.restapi.service.impl;

import com.company.restapi.dao.WeatherDatatypeMapper;
import com.company.restapi.model.WeatherDatatype;
import com.company.restapi.service.WeatherDatatypeService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class WeatherDatatypeServiceImpl extends AbstractService<WeatherDatatype> implements WeatherDatatypeService {
    @Resource
    private WeatherDatatypeMapper weatherDatatypeMapper;

}
