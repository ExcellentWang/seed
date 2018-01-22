package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_guarantee")
public class TbGuarantee {
    /**
     * 主键
     */
    @Id
    @Column(name = "guarantee_id")
    private Integer guaranteeId;

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
     * 设备型号
     */
    private String model;

    /**
     * 产品编号
     */
    @Column(name = "productNumber")
    private String productnumber;

    /**
     * 购买日期
     */
    @Column(name = "buyTime")
    private Date buytime;

    /**
     * 保修期（年）
     */
    @Column(name = "guaranteeTime")
    private String guaranteetime;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 服务地区
     */
    private String area;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 发票
     */
    private String invoice;

    /**
     * 保修卡状态 0待完善 1以完善 2审核中 3审核通过 4未通过
     */
    private Integer status;

    /**
     * 备注（原因）
     */
    private String remark;

    /**
     * 提交审核时间
     */
    @Column(name = "submit_time")
    private Date submitTime;

    /**
     * 审核时间
     */
    @Column(name = "audit_time")
    private Date auditTime;

    /**
     * 获取主键
     *
     * @return guarantee_id - 主键
     */
    public Integer getGuaranteeId() {
        return guaranteeId;
    }

    /**
     * 设置主键
     *
     * @param guaranteeId 主键
     */
    public void setGuaranteeId(Integer guaranteeId) {
        this.guaranteeId = guaranteeId;
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
     * 获取设备型号
     *
     * @return model - 设备型号
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置设备型号
     *
     * @param model 设备型号
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 获取产品编号
     *
     * @return productNumber - 产品编号
     */
    public String getProductnumber() {
        return productnumber;
    }

    /**
     * 设置产品编号
     *
     * @param productnumber 产品编号
     */
    public void setProductnumber(String productnumber) {
        this.productnumber = productnumber;
    }

    /**
     * 获取购买日期
     *
     * @return buyTime - 购买日期
     */
    public Date getBuytime() {
        return buytime;
    }

    /**
     * 设置购买日期
     *
     * @param buytime 购买日期
     */
    public void setBuytime(Date buytime) {
        this.buytime = buytime;
    }

    /**
     * 获取保修期（年）
     *
     * @return guaranteeTime - 保修期（年）
     */
    public String getGuaranteetime() {
        return guaranteetime;
    }

    /**
     * 设置保修期（年）
     *
     * @param guaranteetime 保修期（年）
     */
    public void setGuaranteetime(String guaranteetime) {
        this.guaranteetime = guaranteetime;
    }

    /**
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取服务地区
     *
     * @return area - 服务地区
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置服务地区
     *
     * @param area 服务地区
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取详细地址
     *
     * @return address - 详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置详细地址
     *
     * @param address 详细地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取发票
     *
     * @return invoice - 发票
     */
    public String getInvoice() {
        return invoice;
    }

    /**
     * 设置发票
     *
     * @param invoice 发票
     */
    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    /**
     * 获取保修卡状态 0待完善 1以完善 2审核中 3审核通过 4未通过
     *
     * @return status - 保修卡状态 0待完善 1以完善 2审核中 3审核通过 4未通过
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置保修卡状态 0待完善 1以完善 2审核中 3审核通过 4未通过
     *
     * @param status 保修卡状态 0待完善 1以完善 2审核中 3审核通过 4未通过
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取备注（原因）
     *
     * @return remark - 备注（原因）
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注（原因）
     *
     * @param remark 备注（原因）
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取提交审核时间
     *
     * @return submit_time - 提交审核时间
     */
    public Date getSubmitTime() {
        return submitTime;
    }

    /**
     * 设置提交审核时间
     *
     * @param submitTime 提交审核时间
     */
    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * 获取审核时间
     *
     * @return audit_time - 审核时间
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * 设置审核时间
     *
     * @param auditTime 审核时间
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }
}