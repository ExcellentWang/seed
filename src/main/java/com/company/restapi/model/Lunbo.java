package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

public class Lunbo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 轮播标题
     */
    private String title;

    /**
     * 排序
     */
    @Column(name = "lunbo_order")
    private Long lunboOrder;

    /**
     * 是否显示
     */
    @Column(name = "is_show")
    private Integer isShow;

    private Date ctime;

    /**
     * 地址
     */
    private String address;

    /**
     * 缩略图地址
     */
    @Column(name = "s_img")
    private String sImg;

    /**
     * 编辑器内容
     */
    private String content;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取轮播标题
     *
     * @return title - 轮播标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置轮播标题
     *
     * @param title 轮播标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取排序
     *
     * @return lunbo_order - 排序
     */
    public Long getLunboOrder() {
        return lunboOrder;
    }

    /**
     * 设置排序
     *
     * @param lunboOrder 排序
     */
    public void setLunboOrder(Long lunboOrder) {
        this.lunboOrder = lunboOrder;
    }

    /**
     * 获取是否显示
     *
     * @return is_show - 是否显示
     */
    public Integer getIsShow() {
        return isShow;
    }

    /**
     * 设置是否显示
     *
     * @param isShow 是否显示
     */
    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    /**
     * @return ctime
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * @param ctime
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取缩略图地址
     *
     * @return s_img - 缩略图地址
     */
    public String getsImg() {
        return sImg;
    }

    /**
     * 设置缩略图地址
     *
     * @param sImg 缩略图地址
     */
    public void setsImg(String sImg) {
        this.sImg = sImg;
    }

    /**
     * 获取编辑器内容
     *
     * @return content - 编辑器内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置编辑器内容
     *
     * @param content 编辑器内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}