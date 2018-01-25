package com.company.restapi.web;


import com.company.common.constant.BaseConstant;
import com.company.restapi.core.Result;
import com.company.restapi.core.ResultGenerator;
import com.company.restapi.model.IntelAccount;
import com.company.restapi.model.UserInfo;
import com.company.restapi.service.AppUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import java.util.*;

@RestController
@SuppressWarnings("all")
public class AppUserController extends BaseConstant {
    private final static Logger logger = LoggerFactory.getLogger(AppUserController.class);

    @Resource
    private AppUserService appUserService;

    /**
     * @param
     * @return 发送短信获取验证码
     * @author wang 2018/1/20 下午8:12
     **/
    @RequestMapping(value = "app/user/appUserGetVerificationCode")
    public Result appUserGetVerificationCode(IntelAccount intelAccount) {
        try {
            Map<Object, Object> objectObjectMap = appUserService.sendVerfiyCode(intelAccount.getPhoneNo());
            return ResultGenerator.genSuccessResult(objectObjectMap);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(BaseConstant.controllerErrorMsg);
        }
    }

    /**
     * @param code
     * @return 用户注册
     * @author wang 2018/1/21 下午10:11
     **/
    @RequestMapping(value = "app/user/appUserRegister", method = RequestMethod.POST)
    public Result regist(IntelAccount intelAccount, String code) {
        try {
            Map<Object, Object> objectObjectMap = appUserService.userRegist(intelAccount, code);
            return ResultGenerator.genSuccessResult(objectObjectMap);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(BaseConstant.controllerErrorMsg);
        }
    }

    /**
     * @param
     * @return 用户登录
     * @author wang 2018/1/22 下午10:04
     **/
    @RequestMapping(value = "app/user/appUserLogin", method = RequestMethod.POST)
    public Result login(IntelAccount intelAccount) {
        try {
            Map<Object, Object> objectObjectMap = appUserService.userLogin(intelAccount);
            return ResultGenerator.genSuccessResult(objectObjectMap);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(BaseConstant.controllerErrorMsg);
        }

    }

    /**
     * @param
     * @return 重置密码
     * @author wang 2018/1/23 下午9:13
     **/
    @RequestMapping(value = "/app/user/appUserForgetPassword", method = RequestMethod.POST)
    public Result forgetPassword(IntelAccount intelAccount, String newPassword, String code) {
        try {
            Map<Object, Object> objectObjectMap = appUserService.refreshPassword(intelAccount, newPassword, code);
            return ResultGenerator.genSuccessResult(objectObjectMap);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(BaseConstant.controllerErrorMsg);
        }

    }

    /**
     * @param
     * @return 修改密码
     * @author wang 2018/1/23 下午9:13
     **/
    @RequestMapping(value = "app/user/appUserUpdatePassword", method = RequestMethod.POST)
    public Result updatePassword(IntelAccount intelAccount, String newPassword) {
        try {
            Map<Object, Object> objectObjectMap = appUserService.updatePassword(intelAccount, newPassword);
            return ResultGenerator.genSuccessResult(objectObjectMap);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(BaseConstant.controllerErrorMsg);
        }
    }

    /**
     * @param
     * @return 修改用户手机号
     * @author wang 2018/1/23 下午11:09
     **/
    @RequestMapping(value = "app/user/appUserUpdatePhone", method = RequestMethod.POST)
    public Result updatePhoneNum(IntelAccount intelAccount, String newPhone, String code) {
        try {
            Map<Object, Object> objectObjectMap = appUserService.updatePhoneNum(intelAccount, newPhone, code);
            return ResultGenerator.genSuccessResult(objectObjectMap);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(BaseConstant.controllerErrorMsg);
        }
    }

    /**
     * @param
     * @return 编辑用户资料
     * @author wang 2018/1/25 上午9:19
     **/

    @RequestMapping(value = "app/user/appUserUpdateData", method = RequestMethod.POST)
    public Result appUserUpdateData(UserInfo userInfo, MultipartHttpServletRequest request, String token) {
        try {
            Map<Object, Object> objectObjectMap = appUserService.appUserUpdateData(userInfo, request);
            return ResultGenerator.genSuccessResult(objectObjectMap);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(BaseConstant.controllerErrorMsg);
        }
    }

    /**
     * @return 获取单个用户资料
     * @author wang 2018/1/25 下午1:55
     * @param: 用户id
     **/
    @RequestMapping(value = "/app/user/getUserDetail", method = RequestMethod.GET)
    public Result getUserIfo(UserInfo userInfo, String token) {
        try {
            Map<Object, Object> objectObjectMap = appUserService.getUserInfo(userInfo);
            return ResultGenerator.genSuccessResult(objectObjectMap);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(BaseConstant.controllerErrorMsg);
        }
    }


}








