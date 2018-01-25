package com.company.restapi.service;

import com.company.restapi.model.IntelAccount;
import com.company.restapi.model.UserInfo;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.Map;

public interface AppUserService {

	//发送验证码
	Map<Object,Object> sendVerfiyCode(String phone);

	Map<Object,Object> userRegist(IntelAccount intelAccount, String code);

	Map<Object,Object> userLogin(IntelAccount intelAccount);

    Map<Object,Object> refreshPassword(IntelAccount intelAccount, String newPassword, String code);

	Map<Object,Object> updatePassword(IntelAccount intelAccount, String newPassword);

	Map<Object,Object> updatePhoneNum(IntelAccount intelAccount,  String newPhone, String code);

	Map<Object,Object> appUserUpdateData(UserInfo userInfo, MultipartHttpServletRequest request);

	Map<Object,Object> getUserInfo(UserInfo userInfo);
}