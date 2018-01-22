package com.company.restapi.service.impl;

import com.company.restapi.dao.TbAlarmMapper;
import com.company.restapi.model.TbAlarm;
import com.company.restapi.service.TbAlarmService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbAlarmServiceImpl extends AbstractService<TbAlarm> implements TbAlarmService {
    @Resource
    private TbAlarmMapper tbAlarmMapper;

}
