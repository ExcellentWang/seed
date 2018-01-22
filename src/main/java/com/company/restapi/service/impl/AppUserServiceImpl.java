package com.company.restapi.service.impl;

import com.company.common.constant.BaseConstant;
import com.company.common.util.StringUtilsCommon;
import com.company.restapi.dao.IntelAccountMapper;
import com.company.restapi.model.IntelAccount;
import com.company.restapi.service.AppUserService;
import com.company.restapi.service.SmsService;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
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
    //短信服务
    @Resource
    private SmsService smsService;
    //dao服务
    @Resource
    private IntelAccountMapper intelAccountMapper;
    //redis服务
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
    public Map<Object, Object> addNewUser(IntelAccount intelAccount, String code) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        //redis取数据
        String verifyCode = stringRedisTemplate.opsForValue().get(intelAccount.getPhoneNo());
        //验证码校验
        if(verifyCode !=code){
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "用户的验证码错误...");
            return objectObjectHashMap;
        }
        //查询当前注册用户
        IntelAccount intelAccount1 = intelAccountMapper.selectOne(intelAccount);
        if (intelAccount1.getPhoneNo()==intelAccount.getPhoneNo()) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "该用户名已经注册过...");
            return  objectObjectHashMap;
        }
        //插入当前用户
        int insert = intelAccountMapper.insert(intelAccount);
        if (insert == 0) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "新建用户失败...");
            return  objectObjectHashMap;
        }

        objectObjectHashMap.put("code", BaseConstant.appUserSuccessStatus);
        objectObjectHashMap.put("msg", "用户注册成功...");
        return objectObjectHashMap;
    }
}
