package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_slideshow")
public class TbSlideshow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Boolean show;

    private Integer order;

    private String title;

    @Column(name = "createTime")
    private Date createtime;

    private String summary;

    private String picture;

    private String address;

    private String content;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return show
     */
    public Boolean getShow() {
        return show;
    }

    /**
     * @param show
     */
    public void setShow(Boolean show) {
        this.show = show;
    }

    /**
     * @return order
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * @param order
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return createTime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     * @param picture
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
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