package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_newsinformation")
public class TbNewsinformation {
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
     * 概述
     */
    private String summary;

    /**
     * 图片
     */
    private String picture;

    /**
     * html地址
     */
    private String address;

    /**
     * 0:未审核，1：已审核，2：已推送
     */
    private Integer status;

    /**
     * 1:资讯，2系统消息
     */
    private Integer type;

    /**
     * 内容
     */
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
     * 获取图片
     *
     * @return picture - 图片
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 设置图片
     *
     * @param picture 图片
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * 获取html地址
     *
     * @return address - html地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置html地址
     *
     * @param address html地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取0:未审核，1：已审核，2：已推送
     *
     * @return status - 0:未审核，1：已审核，2：已推送
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0:未审核，1：已审核，2：已推送
     *
     * @param status 0:未审核，1：已审核，2：已推送
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取1:资讯，2系统消息
     *
     * @return type - 1:资讯，2系统消息
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置1:资讯，2系统消息
     *
     * @param type 1:资讯，2系统消息
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}