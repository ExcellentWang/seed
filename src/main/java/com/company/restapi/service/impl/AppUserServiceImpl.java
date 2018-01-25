package com.company.restapi.service.impl;

import com.company.common.constant.BaseConstant;
import com.company.common.util.Md5Util;
import com.company.common.util.StringUtilsCommon;
import com.company.common.util.UploadUtil;
import com.company.restapi.core.ResultGenerator;
import com.company.restapi.dao.IntelAccountMapper;
import com.company.restapi.dao.UserInfoMapper;
import com.company.restapi.model.IntelAccount;
import com.company.restapi.model.UserInfo;
import com.company.restapi.service.AppUserService;
import com.company.restapi.service.SmsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import java.util.Date;
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
@SuppressWarnings("all")
public class AppUserServiceImpl implements AppUserService {
    private final static Logger logger = LoggerFactory.getLogger(AppUserServiceImpl.class);

    //短信服务
    @Resource
    private SmsService smsService;
    //dao服务
    @Resource
    private IntelAccountMapper intelAccountMapper;
    @Resource
    private UserInfoMapper userInfoMapper;

    //redis服务
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public Map<Object, Object> sendVerfiyCode(String phone) {
        String verification = StringUtilsCommon.getRandNum(6);
        Map<Object, Object> objectObjectMap = smsService.sendVerificationCode(phone, verification);
        //验证码存入redis
        stringRedisTemplate.opsForValue().set(phone, verification, 100, TimeUnit.MINUTES);
        logger.info(verification);
        return objectObjectMap;
    }

    @Override
    public Map<Object, Object> userRegist(IntelAccount intelAccount, String code) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        //redis取数据
        String verifyCode = stringRedisTemplate.opsForValue().get(intelAccount.getPhoneNo());
        //验证码校验
        if (!verifyCode.equals(code)) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "用户的验证码错误...");
            return objectObjectHashMap;
        }
        //查询当前注册用户
        List<IntelAccount> select = intelAccountMapper.select(intelAccount);
        if (!select.isEmpty()) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "该用户名已经注册过...");
            return objectObjectHashMap;
        }
        //插入当前用户
        intelAccount.setPassword(Md5Util.getMD5String(intelAccount.getPassword()));
        intelAccount.setCreateBy(Long.valueOf(intelAccount.getPhoneNo()));
        intelAccount.setCreateDatetime(new Date());
        intelAccount.setUpdateBy(Long.valueOf(intelAccount.getPhoneNo()));
        intelAccount.setUpdateDatetime(new Date());
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
        intelAccount.setPassword(Md5Util.getMD5String(intelAccount.getPassword()));
        IntelAccount intelAccount1 = intelAccountMapper.selectOne(intelAccount);
        if (intelAccount1.equals(null)) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "当前用户未注册...");
            return objectObjectHashMap;
        }
        //生成token存redis
        String token = StringUtilsCommon.getToken();
        stringRedisTemplate.opsForValue().set(intelAccount1.getUserId().toString(), token, 30, TimeUnit.MINUTES);
        objectObjectHashMap.put("token", token);
        objectObjectHashMap.put("user", intelAccount1);
        return objectObjectHashMap;
    }

    @Override
    public Map<Object, Object> refreshPassword(IntelAccount intelAccount, String newPassword, String code) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        //校验当前验证码
        String verifyCode = stringRedisTemplate.opsForValue().get(intelAccount.getPhoneNo());
        if (!verifyCode.equals(code)) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "验证码错误...");
            return objectObjectHashMap;
        }
        //查询当前用户
        IntelAccount intelAccount1 = intelAccountMapper.selectOne(intelAccount);
        if (intelAccount1.equals(null)) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "当前用户不存在...");
        }
        //更新当前用户密码
        intelAccount1.setPassword(Md5Util.getMD5String(newPassword));
        intelAccount1.setUpdateDatetime(new Date());
        int updateByPrimaryKeySelective = intelAccountMapper.updateByPrimaryKey(intelAccount1);
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
    public Map<Object, Object> updatePassword(IntelAccount intelAccount, String newPassword) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        //查询当前用户
        intelAccount.setPassword(Md5Util.getMD5String(intelAccount.getPassword()));
        System.out.println(intelAccount.toString());
        IntelAccount intelAccount1 = intelAccountMapper.selectOne(intelAccount);
        if (intelAccount1.equals(null)) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "用户登陆信息错误...");
        }
        //更新当前用户
        intelAccount1.setUpdateDatetime(new Date());
        intelAccount1.setPassword(Md5Util.getMD5String(newPassword));
        int updateByPrimaryKeySelective = intelAccountMapper.updateByPrimaryKey(intelAccount1);
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
    public Map<Object, Object> updatePhoneNum(IntelAccount intelAccount, String newPhone, String code) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();

        //检验验证码
        String verifyCode = stringRedisTemplate.opsForValue().get(intelAccount.getPhoneNo());
        if (!verifyCode.equals(code)) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "验证码有误...");
            return objectObjectHashMap;
        }
        //查询当前用户
        IntelAccount intelAccount1 = intelAccountMapper.selectOne(intelAccount);
        if (intelAccount1.getPhoneNo().equals(newPhone)) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "新号码不能与原号码一致...");
            return objectObjectHashMap;
        }
        //更新手机号
        intelAccount.setPhoneNo(newPhone);
        int updateByPrimaryKeySelective = intelAccountMapper.updateByPrimaryKey(intelAccount);
        logger.info(Integer.toString(updateByPrimaryKeySelective));
        System.out.println(intelAccountMapper.selectOne(intelAccount));
        if (updateByPrimaryKeySelective < 1) {
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "更新号码失败...");
            return objectObjectHashMap;
        }
        objectObjectHashMap.put("code", BaseConstant.appUserSuccessStatus);
        objectObjectHashMap.put("msg", "更新号码成功...");
        return objectObjectHashMap;
    }

    @Override
    public Map<Object, Object> appUserUpdateData(UserInfo userInfo, MultipartHttpServletRequest request) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        //文件上传
        String headPortrait = "" ;
        MultipartFile file = request.getFile("file1");
        if(file!=null){
            headPortrait= UploadUtil.save(file, request);
        }
        if(headPortrait != null && !headPortrait.equals("")){
            userInfo.setHeadImgUrl(headPortrait);
        }
        //用户资料保存
        UserInfo userInfo1 = userInfoMapper.selectOne(userInfo);
        if (userInfo1 == null) {
            //插入用户信息
            int insert = userInfoMapper.insert(userInfo1);
            logger.info("插入的用户信息标识",insert);
            objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg", "更新用户资料成功...");
            return objectObjectHashMap;
        }
        //更新用户信息
        int i = userInfoMapper.updateByPrimaryKey(userInfo1);
        logger.info("更新的用户信息",i);
        objectObjectHashMap.put("code", BaseConstant.appUserFaileStatus);
        objectObjectHashMap.put("msg", "更新用户资料成功...");
        return objectObjectHashMap;
    }

    @Override
    public Map<Object, Object> getUserInfo(UserInfo userInfo) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        //获取用户资料
        UserInfo userInfo1 = userInfoMapper.selectOne(userInfo);
        if (userInfo1 == null) {
            objectObjectHashMap.put("code",BaseConstant.appUserFaileStatus);
            objectObjectHashMap.put("msg","获取用户失败...");
            return objectObjectHashMap;
        }
        objectObjectHashMap.put("code",BaseConstant.appUserSuccessStatus);
        objectObjectHashMap.put("msg","获取用户成功...");
        objectObjectHashMap.put("userIfo",userInfo1);
        return objectObjectHashMap;
    }
}



















