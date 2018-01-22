package com.company.restapi.service.impl;

import com.company.common.util.StringUtilsCommon;
import com.company.restapi.model.TbUser;
import com.company.restapi.service.AppUserService;
import com.company.restapi.service.SmsService;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * com.company.restapi.service.impl
 *
 * @author Wang
 * @create 2018-01-20 下午9:37
 * @description:
 **/

@Service
@Transactional
public class AppUserServiceImpl implements AppUserService {

    @Resource
    private SmsService smsService;
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Override
    public Map<Object, Object> sendVerfiyCode(String phone) {
        String verification = StringUtilsCommon.getRandNum(6);
        Map<Object, Object> objectObjectMap = smsService.sendVerificationCode(phone,verification);
        //验证码存入redis
        stringRedisTemplate.opsForValue().set(phone,verification,10, TimeUnit.SECONDS);
        return objectObjectMap;
    }

    @Override
    public Map<Object, Object> addNewUser(TbUser user, String code) {


        return null;
    }
}
