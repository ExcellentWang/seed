package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user")
public class TbUser {
    /**
     * 用户id，唯一标识
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 昵称
     */
    private String username;

    /**
     * 登陆密码
     */
    private String password;

    /**
     * 性别 0男 1女
     */
    private Integer sex;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 头像地址
     */
    @Column(name = "headPortrait")
    private String headportrait;

    /**
     * 注册时间
     */
    @Column(name = "registerTime")
    private Date registertime;

    /**
     * 上次登陆时间
     */
    @Column(name = "loginTime")
    private Date logintime;

    /**
     * 手机型号
     */
    @Column(name = "phoneModel")
    private String phonemodel;

    /**
     * app版本号
     */
    @Column(name = "appVersion")
    private String appversion;

    /**
     * 获取用户id，唯一标识
     *
     * @return user_id - 用户id，唯一标识
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id，唯一标识
     *
     * @param userId 用户id，唯一标识
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取昵称
     *
     * @return username - 昵称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置昵称
     *
     * @param username 昵称
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取登陆密码
     *
     * @return password - 登陆密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置登陆密码
     *
     * @param password 登陆密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取性别 0男 1女
     *
     * @return sex - 性别 0男 1女
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别 0男 1女
     *
     * @param sex 性别 0男 1女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取头像地址
     *
     * @return headPortrait - 头像地址
     */
    public String getHeadportrait() {
        return headportrait;
    }

    /**
     * 设置头像地址
     *
     * @param headportrait 头像地址
     */
    public void setHeadportrait(String headportrait) {
        this.headportrait = headportrait;
    }

    /**
     * 获取注册时间
     *
     * @return registerTime - 注册时间
     */
    public Date getRegistertime() {
        return registertime;
    }

    /**
     * 设置注册时间
     *
     * @param registertime 注册时间
     */
    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    /**
     * 获取上次登陆时间
     *
     * @return loginTime - 上次登陆时间
     */
    public Date getLogintime() {
        return logintime;
    }

    /**
     * 设置上次登陆时间
     *
     * @param logintime 上次登陆时间
     */
    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    /**
     * 获取手机型号
     *
     * @return phoneModel - 手机型号
     */
    public String getPhonemodel() {
        return phonemodel;
    }

    /**
     * 设置手机型号
     *
     * @param phonemodel 手机型号
     */
    public void setPhonemodel(String phonemodel) {
        this.phonemodel = phonemodel;
    }

    /**
     * 获取app版本号
     *
     * @return appVersion - app版本号
     */
    public String getAppversion() {
        return appversion;
    }

    /**
     * 设置app版本号
     *
     * @param appversion app版本号
     */
    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }
}