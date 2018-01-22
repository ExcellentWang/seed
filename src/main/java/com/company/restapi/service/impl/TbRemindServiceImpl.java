package com.company.restapi.service.impl;

import com.company.restapi.dao.TbRemindMapper;
import com.company.restapi.model.TbRemind;
import com.company.restapi.service.TbRemindService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbRemindServiceImpl extends AbstractService<TbRemind> implements TbRemindService {
    @Resource
    private TbRemindMapper tbRemindMapper;

}
