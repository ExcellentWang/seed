package com.company.restapi.model;

/**
 * com.company.restapi.model
 *
 * @author Wang
 * @create 2018-01-26 下午2:18
 * @description: 为实现设备分享的自定义POJO
 **/
public class ShareDevice {

    //绑定设备用户ID
    private String userId;
    //设备别名
    private String remark;
    //分享设备用户的手机号码
    private String phoneNo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
