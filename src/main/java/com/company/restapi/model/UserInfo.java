package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_info")
public class UserInfo {
    /**
     * id自增长
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户id
     */
    @Column(name = "USER_ID")
    private Long userId;

    /**
     * 头像文件URL
     */
    @Column(name = "HEAD_IMG_URL")
    private String headImgUrl;

    /**
     * 头像文件名字
     */
    @Column(name = "HEAD_NAME")
    private String headName;

    /**
     * 用户姓名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 昵称
     */
    @Column(name = "NICK_NAME")
    private String nickName;

    /**
     * 性别(1男，2女，0未知)
     */
    @Column(name = "GENDER")
    private Short gender;

    /**
     * 出生日期，yyyyMMdd
     */
    @Column(name = "BIRTHDATE")
    private String birthdate;

    /**
     * 身份证号
     */
    @Column(name = "ID_CARD_INFO")
    private String idCardInfo;

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
     * 获取用户id
     *
     * @return USER_ID - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取头像文件URL
     *
     * @return HEAD_IMG_URL - 头像文件URL
     */
    public String getHeadImgUrl() {
        return headImgUrl;
    }

    /**
     * 设置头像文件URL
     *
     * @param headImgUrl 头像文件URL
     */
    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    /**
     * 获取头像文件名字
     *
     * @return HEAD_NAME - 头像文件名字
     */
    public String getHeadName() {
        return headName;
    }

    /**
     * 设置头像文件名字
     *
     * @param headName 头像文件名字
     */
    public void setHeadName(String headName) {
        this.headName = headName;
    }

    /**
     * 获取用户姓名
     *
     * @return NAME - 用户姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户姓名
     *
     * @param name 用户姓名
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
     * 获取性别(1男，2女，0未知)
     *
     * @return GENDER - 性别(1男，2女，0未知)
     */
    public Short getGender() {
        return gender;
    }

    /**
     * 设置性别(1男，2女，0未知)
     *
     * @param gender 性别(1男，2女，0未知)
     */
    public void setGender(Short gender) {
        this.gender = gender;
    }

    /**
     * 获取出生日期，yyyyMMdd
     *
     * @return BIRTHDATE - 出生日期，yyyyMMdd
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * 设置出生日期，yyyyMMdd
     *
     * @param birthdate 出生日期，yyyyMMdd
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * 获取身份证号
     *
     * @return ID_CARD_INFO - 身份证号
     */
    public String getIdCardInfo() {
        return idCardInfo;
    }

    /**
     * 设置身份证号
     *
     * @param idCardInfo 身份证号
     */
    public void setIdCardInfo(String idCardInfo) {
        this.idCardInfo = idCardInfo;
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