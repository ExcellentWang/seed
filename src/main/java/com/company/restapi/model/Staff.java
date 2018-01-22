package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 工号
     */
    @Column(name = "staff_num")
    private String staffNum;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "motify_time")
    private Date motifyTime;

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
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取工号
     *
     * @return staff_num - 工号
     */
    public String getStaffNum() {
        return staffNum;
    }

    /**
     * 设置工号
     *
     * @param staffNum 工号
     */
    public void setStaffNum(String staffNum) {
        this.staffNum = staffNum;
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
     * @return motify_time
     */
    public Date getMotifyTime() {
        return motifyTime;
    }

    /**
     * @param motifyTime
     */
    public void setMotifyTime(Date motifyTime) {
        this.motifyTime = motifyTime;
    }
}