package com.company.restapi.service;


import java.util.Map;

public interface SmsService {
    Map<Object, Object> sendVerificationCode(String phone, String code);
}
