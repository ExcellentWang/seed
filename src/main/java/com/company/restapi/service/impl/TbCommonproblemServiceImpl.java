package com.company.restapi.service.impl;

import com.company.restapi.dao.TbCommonproblemMapper;
import com.company.restapi.model.TbCommonproblem;
import com.company.restapi.service.TbCommonproblemService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbCommonproblemServiceImpl extends AbstractService<TbCommonproblem> implements TbCommonproblemService {
    @Resource
    private TbCommonproblemMapper tbCommonproblemMapper;

}
