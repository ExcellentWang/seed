package com.company.restapi.service;

import com.company.restapi.model.IntelAccount;

import java.util.Map;

public interface AppUserService {

	//发送验证码
	Map<Object,Object> sendVerfiyCode(String phone);

	Map<Object,Object> addNewUser(IntelAccount intelAccount, String code);
}