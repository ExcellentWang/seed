package com.company.restapi.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_information")
public class TbInformation {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 消息类型 1资讯 2系统 3设备 4节水量
     */
    @Column(name = "informationType")
    private Integer informationtype;

    /**
     * 是否最新
     */
    @Column(name = "isNew")
    private Boolean isnew;

    @Column(name = "equipment_id")
    private Integer equipmentId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "useWeight")
    private BigDecimal useweight;

    @Column(name = "saveWeight")
    private BigDecimal saveweight;

    /**
     * 是否删除（0未删除，1已删除）
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 图片地址
     */
    private String picture;

    /**
     * 链接地址
     */
    private String address;

    /**
     * 概述
     */
    private String summary;

    /**
     * 消息id
     */
    @Column(name = "news_id")
    private Long newsId;

    /**
     * 设备消息id
     */
    @Column(name = "device_info_id")
    private Long deviceInfoId;

    private String content;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取创建时间
     *
     * @return createTime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取创建者
     *
     * @return creator - 创建者
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator 创建者
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取消息类型 1资讯 2系统 3设备 4节水量
     *
     * @return informationType - 消息类型 1资讯 2系统 3设备 4节水量
     */
    public Integer getInformationtype() {
        return informationtype;
    }

    /**
     * 设置消息类型 1资讯 2系统 3设备 4节水量
     *
     * @param informationtype 消息类型 1资讯 2系统 3设备 4节水量
     */
    public void setInformationtype(Integer informationtype) {
        this.informationtype = informationtype;
    }

    /**
     * 获取是否最新
     *
     * @return isNew - 是否最新
     */
    public Boolean getIsnew() {
        return isnew;
    }

    /**
     * 设置是否最新
     *
     * @param isnew 是否最新
     */
    public void setIsnew(Boolean isnew) {
        this.isnew = isnew;
    }

    /**
     * @return equipment_id
     */
    public Integer getEquipmentId() {
        return equipmentId;
    }

    /**
     * @param equipmentId
     */
    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return useWeight
     */
    public BigDecimal getUseweight() {
        return useweight;
    }

    /**
     * @param useweight
     */
    public void setUseweight(BigDecimal useweight) {
        this.useweight = useweight;
    }

    /**
     * @return saveWeight
     */
    public BigDecimal getSaveweight() {
        return saveweight;
    }

    /**
     * @param saveweight
     */
    public void setSaveweight(BigDecimal saveweight) {
        this.saveweight = saveweight;
    }

    /**
     * 获取是否删除（0未删除，1已删除）
     *
     * @return is_delete - 是否删除（0未删除，1已删除）
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除（0未删除，1已删除）
     *
     * @param isDelete 是否删除（0未删除，1已删除）
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取图片地址
     *
     * @return picture - 图片地址
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 设置图片地址
     *
     * @param picture 图片地址
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * 获取链接地址
     *
     * @return address - 链接地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置链接地址
     *
     * @param address 链接地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取概述
     *
     * @return summary - 概述
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置概述
     *
     * @param summary 概述
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获取消息id
     *
     * @return news_id - 消息id
     */
    public Long getNewsId() {
        return newsId;
    }

    /**
     * 设置消息id
     *
     * @param newsId 消息id
     */
    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    /**
     * 获取设备消息id
     *
     * @return device_info_id - 设备消息id
     */
    public Long getDeviceInfoId() {
        return deviceInfoId;
    }

    /**
     * 设置设备消息id
     *
     * @param deviceInfoId 设备消息id
     */
    public void setDeviceInfoId(Long deviceInfoId) {
        this.deviceInfoId = deviceInfoId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }
}