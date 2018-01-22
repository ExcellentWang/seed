package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_s_user")
public class TSUser {
    /**
     * 主键
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_order")
    private Integer userOrder;

    @Column(name = "user_type")
    private Integer userType;

    /**
     * 1启用2禁止
     */
    @Column(name = "user_status")
    private Integer userStatus;

    @Column(name = "user_pwd")
    private String userPwd;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "real_name")
    private String realName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "MOBILE")
    private String mobile;

    @Column(name = "SEX")
    private Integer sex;

    /**
     * 获取主键
     *
     * @return user_id - 主键
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置主键
     *
     * @param userId 主键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return user_order
     */
    public Integer getUserOrder() {
        return userOrder;
    }

    /**
     * @param userOrder
     */
    public void setUserOrder(Integer userOrder) {
        this.userOrder = userOrder;
    }

    /**
     * @return user_type
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * @param userType
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 获取1启用2禁止
     *
     * @return user_status - 1启用2禁止
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * 设置1启用2禁止
     *
     * @param userStatus 1启用2禁止
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * @return user_pwd
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * @param userPwd
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return real_name
     */
    public String getRealName() {
        return realName;
    }

    /**
     * @param realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * @return EMAIL
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return MOBILE
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return SEX
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }
}