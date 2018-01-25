package com.company.restapi.web;

import com.company.common.util.StringUtilsCommon;
import com.company.restapi.core.ResultGenerator;
import com.company.restapi.dao.IntelAccountMapper;
import com.company.restapi.model.IntelAccount;
import com.company.restapi.service.AppUserService;
import com.conpany.project.Tester;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.TimeUnit;


/**
 * com.company.restapi.web
 *
 * @author Wang
 * @create 2018-01-24 下午5:01
 * @description:
 **/
public class AppUserControllerTest extends Tester {

    private final static Logger logger = LoggerFactory.getLogger(AppUserController.class);

    @Resource
    private AppUserService appUserService;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private IntelAccountMapper intelAccountMapper ;


    @Test
    public void updatePhoneNum() throws Exception {
        IntelAccount intelAccount = new IntelAccount();
        intelAccount.setPhoneNo("15876529397");
        IntelAccount intelAccount1 = intelAccountMapper.selectOne(intelAccount);

        String tokenForTest =  getTokenForTest(intelAccount1);
        System.out.println(tokenForTest);
        String verfiyCode =  getVerfiyCode(intelAccount1);
        System.out.println(verfiyCode);

        Map<Object,Object> objectObjectMap = appUserService.updatePhoneNum(intelAccount1,tokenForTest,"999",verfiyCode);
        System.out.println(intelAccountMapper.selectOne(intelAccount1));
        System.out.println(ResultGenerator.genSuccessResult(objectObjectMap));
    }
    /**
     * @author wang 2018/1/24 下午8:20
     * @param
     * @return
     * 通用测试工具方法
    **/
    public  String getTokenForTest(IntelAccount intelAccount) {
        String token = StringUtilsCommon.getToken();
        stringRedisTemplate.opsForValue().set(Long.toString(intelAccount.getId()), token, 30, TimeUnit.MINUTES);
        return token;
    }

    public  String getVerfiyCode(IntelAccount intelAccount) {
        String randNum = StringUtilsCommon.getRandNum(6);
        stringRedisTemplate.opsForValue().set(intelAccount.getPhoneNo(), randNum, 30, TimeUnit.MINUTES);
        return randNum;
    }
}