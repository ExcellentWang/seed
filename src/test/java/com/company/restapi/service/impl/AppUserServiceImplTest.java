package com.company.restapi.service.impl;

import com.company.common.util.StringUtilsCommon;
import com.company.restapi.service.SmsService;
import com.conpany.project.Tester;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.util.Map;

import static java.util.concurrent.TimeUnit.MINUTES;
import static java.util.concurrent.TimeUnit.SECONDS;


/**
 * com.company.restapi.service.impl
 *
 * @author Wang
 * @create 2018-01-21 下午9:24
 * @description:
 **/
public class AppUserServiceImplTest extends Tester {


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Resource
    private SmsService smsService;
    /**
     * @author wang 2018/1/21 下午9:49
     * @param
     * @return
     * 测试redis 写入延时的方法.
    **/
    @Test
    public void sendVerfiyCode() throws InterruptedException {
        Logger logger = LoggerFactory.getLogger(AppUserServiceImplTest.class);
        String verification = StringUtilsCommon.getRandNum(6);

//        Map<Object, Object> objectObjectMap = smsService.sendVerificationCode(phone,verification);
        //验证码存入redis
        stringRedisTemplate.opsForValue().set("1111", "2222",10,SECONDS);
        Thread.sleep(10000);
        logger.info("存入成功");
        System.out.println(stringRedisTemplate.opsForValue().get("1111"));


    }

}