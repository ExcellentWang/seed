package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "intel_account")
public class IntelAccount {
    /**
     * id自增长
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 昵称
     */
    @Column(name = "NICK_NAME")
    private String nickName;

    /**
     * 登录名
     */
    @Column(name = "ACCOUNT_NAME")
    private String accountName;

    /**
     * 邮箱地址
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * 登录密码
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * 联系电话
     */
    @Column(name = "PHONE_NO")
    private String phoneNo;

    /**
     * 是否激活，1激动，2关闭或注销
     */
    @Column(name = "ENABLE")
    private Integer enable;

    /**
     * 创建人
     */
    @Column(name = "CREATE_BY")
    private Long createBy;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_DATETIME")
    private Date createDatetime;

    /**
     * 最后操作人
     */
    @Column(name = "UPDATE_BY")
    private Long updateBy;

    /**
     * 最后操作时间
     */
    @Column(name = "UPDATE_DATETIME")
    private Date updateDatetime;

    /**
     * 获取id自增长
     *
     * @return ID - id自增长
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id自增长
     *
     * @param id id自增长
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return NAME - 用户名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户名
     *
     * @param name 用户名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取昵称
     *
     * @return NICK_NAME - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取登录名
     *
     * @return ACCOUNT_NAME - 登录名
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 设置登录名
     *
     * @param accountName 登录名
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 获取邮箱地址
     *
     * @return EMAIL - 邮箱地址
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱地址
     *
     * @param email 邮箱地址
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取登录密码
     *
     * @return PASSWORD - 登录密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置登录密码
     *
     * @param password 登录密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取联系电话
     *
     * @return PHONE_NO - 联系电话
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * 设置联系电话
     *
     * @param phoneNo 联系电话
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * 获取是否激活，1激动，2关闭或注销
     *
     * @return ENABLE - 是否激活，1激动，2关闭或注销
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * 设置是否激活，1激动，2关闭或注销
     *
     * @param enable 是否激活，1激动，2关闭或注销
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * 获取创建人
     *
     * @return CREATE_BY - 创建人
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_DATETIME - 创建时间
     */
    public Date getCreateDatetime() {
        return createDatetime;
    }

    /**
     * 设置创建时间
     *
     * @param createDatetime 创建时间
     */
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    /**
     * 获取最后操作人
     *
     * @return UPDATE_BY - 最后操作人
     */
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置最后操作人
     *
     * @param updateBy 最后操作人
     */
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取最后操作时间
     *
     * @return UPDATE_DATETIME - 最后操作时间
     */
    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    /**
     * 设置最后操作时间
     *
     * @param updateDatetime 最后操作时间
     */
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}