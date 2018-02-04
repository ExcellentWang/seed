package com.company.restapi.service.impl;

import com.company.restapi.dao.NewsInfoMapper;
import com.company.restapi.model.NewsInfo;
import com.company.restapi.service.MessageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;

/**
 * com.company.restapi.service.impl
 *
 * @author Wang
 * @create 2018-02-03 上午11:34
 * @description:
 **/
@Service
@Transactional
public class MessageServiceImpl implements MessageService{

    @Resource
    private NewsInfoMapper newsInfoMapper;
    @Override
    public Map<Object, Object> getMsgList() {
        List<NewsInfo> newsInfos = newsInfoMapper.selectAll();
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("newlist",newsInfos);
        return objectObjectHashMap;
    }

}
