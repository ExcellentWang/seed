package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_customerservicedetails")
public class TbCustomerservicedetails {
    /**
     * 保修详情ID
     */
    @Id
    @Column(name = "serviceDetail_id")
    private Integer servicedetailId;

    /**
     * 设备ID
     */
    @Column(name = "equipment_id")
    private Integer equipmentId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 处理时间
     */
    private Date time;

    /**
     * 处理人名称
     */
    @Column(name = "personName")
    private String personname;

    /**
     * 处理人电话
     */
    @Column(name = "personPhone")
    private String personphone;

    /**
     * 提示内容
     */
    private String content;

    /**
     * 处理类型
     */
    @Column(name = "log_type")
    private Long logType;

    /**
     * 报修id
     */
    @Column(name = "customer_id")
    private Long customerId;

    /**
     * 获取保修详情ID
     *
     * @return serviceDetail_id - 保修详情ID
     */
    public Integer getServicedetailId() {
        return servicedetailId;
    }

    /**
     * 设置保修详情ID
     *
     * @param servicedetailId 保修详情ID
     */
    public void setServicedetailId(Integer servicedetailId) {
        this.servicedetailId = servicedetailId;
    }

    /**
     * 获取设备ID
     *
     * @return equipment_id - 设备ID
     */
    public Integer getEquipmentId() {
        return equipmentId;
    }

    /**
     * 设置设备ID
     *
     * @param equipmentId 设备ID
     */
    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取处理时间
     *
     * @return time - 处理时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置处理时间
     *
     * @param time 处理时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取处理人名称
     *
     * @return personName - 处理人名称
     */
    public String getPersonname() {
        return personname;
    }

    /**
     * 设置处理人名称
     *
     * @param personname 处理人名称
     */
    public void setPersonname(String personname) {
        this.personname = personname;
    }

    /**
     * 获取处理人电话
     *
     * @return personPhone - 处理人电话
     */
    public String getPersonphone() {
        return personphone;
    }

    /**
     * 设置处理人电话
     *
     * @param personphone 处理人电话
     */
    public void setPersonphone(String personphone) {
        this.personphone = personphone;
    }

    /**
     * 获取提示内容
     *
     * @return content - 提示内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置提示内容
     *
     * @param content 提示内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取处理类型
     *
     * @return log_type - 处理类型
     */
    public Long getLogType() {
        return logType;
    }

    /**
     * 设置处理类型
     *
     * @param logType 处理类型
     */
    public void setLogType(Long logType) {
        this.logType = logType;
    }

    /**
     * 获取报修id
     *
     * @return customer_id - 报修id
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * 设置报修id
     *
     * @param customerId 报修id
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}