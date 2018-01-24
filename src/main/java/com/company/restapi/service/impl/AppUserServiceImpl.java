package com.company.restapi.service.impl;

import com.company.common.constant.BaseConstant;
import com.company.common.util.StringUtilsCommon;
import com.company.restapi.dao.IntelAccountMapper;
import com.company.restapi.model.IntelAccount;
import com.company.restapi.service.AppUserService;
import com.company.restapi.service.SmsService;
import com.company.restapi.web.AppUserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private final static Logger logger = LoggerFactory.getLogger(AppUserServiceImpl.class);

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
        Map<Object, Object> objectObjectMap = smsService.sendVerificationCode(phone, verification);
        //验证码存入redis
        stringRedisTemplate.opsForValue().set(phone, verification, 10, TimeUnit.SECONDS);
        logger.info(verification);
        return objectObjectMap;
    }

    @Override
    public Map<Object, Object> userRegist(IntelAccount intelAccount, String code) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        //redis取数据
        String verifyCode = stringRedisTemplate.opsForValue().get(intelAccount.getPhoneNo());
        //验证码校验
        if (!verifyCode.equals(code) ) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "用户的验证码错误...");
            return objectObjectHashMap;
        }
        //查询当前注册用户
        IntelAccount intelAccount1 = intelAccountMapper.selectOne(intelAccount);
        if (intelAccount1.getPhoneNo().equals(intelAccount.getPhoneNo()) ) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "该用户名已经注册过...");
            return objectObjectHashMap;
        }
        //插入当前用户
        int insert = intelAccountMapper.insert(intelAccount);
        if (insert == 0) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "新建用户失败...");
            return objectObjectHashMap;
        }

        objectObjectHashMap.put("code", BaseConstant.appUserSuccessStatus);
        objectObjectHashMap.put("msg", "用户注册成功...");
        return objectObjectHashMap;
    }

    @Override
    public Map<Object, Object> userLogin(IntelAccount intelAccount) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        //查询当前登陆用户
        IntelAccount intelAccount1 = intelAccountMapper.selectOne(intelAccount);
        if (intelAccount1.getId() == 0) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "当前用户未注册...");
            return objectObjectHashMap;
        }
        //生成token存redis
        String token = StringUtilsCommon.getToken();
        stringRedisTemplate.opsForValue().set(intelAccount1.getId().toString(), token, 30, TimeUnit.MINUTES);
        objectObjectHashMap.put("token", token);
        objectObjectHashMap.put("user", intelAccount1);
        return objectObjectHashMap;
    }

    @Override
    public Map<Object, Object> refreshPassword(IntelAccount intelAccount, String newPassword, String code) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        //校验当前验证码
        String verifyCode = stringRedisTemplate.opsForValue().get(intelAccount.getPhoneNo());
        if (!verifyCode.equals(code) ) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "验证码错误...");
            return objectObjectHashMap;
        }
        //更新当前用户密码
        int updateByPrimaryKeySelective = intelAccountMapper.updateByPrimaryKeySelective(intelAccount);
        if (updateByPrimaryKeySelective == 0) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "更新用户失败...");
            return objectObjectHashMap;
        }
        objectObjectHashMap.put("code", BaseConstant.appUserSuccessStatus);
        objectObjectHashMap.put("msg", "更新操作成功...");
        return objectObjectHashMap;
    }

    @Override
    public Map<Object, Object> updatePassword(IntelAccount intelAccount, String newPassword, String oldpassword) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        //查询当前用户
        IntelAccount intelAccount1 = intelAccountMapper.selectOne(intelAccount);
        if (!intelAccount1.getPassword().equals(oldpassword) ) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "用户名或密码错误...");
            return objectObjectHashMap;
        }
        //更新当前用户
        int updateByPrimaryKeySelective = intelAccountMapper.updateByPrimaryKeySelective(intelAccount);
        if (updateByPrimaryKeySelective == 0) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "更新用户失败...");
            return objectObjectHashMap;
        }
        objectObjectHashMap.put("code", BaseConstant.appUserSuccessStatus);
        objectObjectHashMap.put("msg", "更新操作成功...");
        return objectObjectHashMap;
    }

    @Override
    public Map<Object, Object> updatePhoneNum(IntelAccount intelAccount, String token, String newPhone, String code) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        //校验token
        String tokenSession = stringRedisTemplate.opsForValue().get(intelAccount.getId());
        if (!tokenSession.equals(token)) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "登陆信息有误,请重新登录...");
            return objectObjectHashMap;
        }
        //检验验证码
        String verifyCode = stringRedisTemplate.opsForValue().get(intelAccount.getPhoneNo());
        if (!verifyCode.equals(code)) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "验证码有误...");
            return objectObjectHashMap;
        }
        //查询当前用户
        IntelAccount intelAccount1 = intelAccountMapper.selectOne(intelAccount);
        if (!intelAccount1.getPhoneNo().equals(newPhone)) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "新号码不能与原号码一致...");
            return objectObjectHashMap;
        }
        //更新手机号
        int updateByPrimaryKeySelective = intelAccountMapper.updateByPrimaryKeySelective(intelAccount);
        if (updateByPrimaryKeySelective  == 0) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "更新号码失败...");
            return objectObjectHashMap;
        }
        objectObjectHashMap.put("code", BaseConstant.appUserSuccessStatus);
        objectObjectHashMap.put("msg", "更新号码成功...");
        return objectObjectHashMap;
    }
}
