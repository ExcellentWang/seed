package com.company.restapi.service.impl;

import com.company.restapi.dao.TbInformationMapper;
import com.company.restapi.model.TbInformation;
import com.company.restapi.service.TbInformationService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbInformationServiceImpl extends AbstractService<TbInformation> implements TbInformationService {
    @Resource
    private TbInformationMapper tbInformationMapper;

}
