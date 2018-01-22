package com.company.restapi.service.impl;

import com.company.restapi.dao.TbFeedbackMapper;
import com.company.restapi.model.TbFeedback;
import com.company.restapi.service.TbFeedbackService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbFeedbackServiceImpl extends AbstractService<TbFeedback> implements TbFeedbackService {
    @Resource
    private TbFeedbackMapper tbFeedbackMapper;

}
