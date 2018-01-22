package com.company.restapi.service.impl;

import com.company.restapi.dao.TbSlideshowMapper;
import com.company.restapi.model.TbSlideshow;
import com.company.restapi.service.TbSlideshowService;
import com.company.restapi.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/01/18.
 */
@Service
@Transactional
public class TbSlideshowServiceImpl extends AbstractService<TbSlideshow> implements TbSlideshowService {
    @Resource
    private TbSlideshowMapper tbSlideshowMapper;

}
