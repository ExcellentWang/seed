package com.company.restapi.dao;

import com.company.restapi.model.IntelAccount;

/**
 * com.company.restapi.dao
 *
 * @author Wang
 * @create 2018-01-26 下午3:25
 * @description:
 **/
public interface ShareDeviceMapper {

    IntelAccount selectIntelAccountById(String phone);
}
