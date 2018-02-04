package com.company.restapi.service.impl;

import com.company.restapi.dao.NewsInfoMapper;
import com.company.restapi.model.NewsInfo;
import com.company.restapi.service.NewsInfoService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/02/03.
 */
@Service
@Transactional
public class NewsInfoServiceImpl extends AbstractService<NewsInfo> implements NewsInfoService {
    @Resource
    private NewsInfoMapper newsInfoMapper;

}
