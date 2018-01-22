package com.company.restapi.service.impl;

import com.company.restapi.dao.StaffMapper;
import com.company.restapi.model.Staff;
import com.company.restapi.service.StaffService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class StaffServiceImpl extends AbstractService<Staff> implements StaffService {
    @Resource
    private StaffMapper staffMapper;

}
