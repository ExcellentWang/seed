package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_customerservice")
public class TbCustomerservice {
    /**
     * 保修ID
     */
    @Id
    @Column(name = "customer_id")
    private Integer customerId;

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
     * 设备编号
     */
    @Column(name = "equipmentNum")
    private String equipmentnum;

    /**
     * 报修类型
     */
    @Column(name = "repairType")
    private String repairtype;

    /**
     * 故障现象
     */
    private String phenomenon;

    /**
     * 预约时间
     */
    @Column(name = "appointmentTime")
    private Date appointmenttime;

    /**
     * 服务地区
     */
    private String area;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 状态 0待处理 1已受理 2完成
     */
    private Integer status;

    /**
     * 填写时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 报修单号
     */
    @Column(name = "orderNum")
    private String ordernum;

    /**
     * 获取保修ID
     *
     * @return customer_id - 保修ID
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * 设置保修ID
     *
     * @param customerId 保修ID
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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
     * 获取设备编号
     *
     * @return equipmentNum - 设备编号
     */
    public String getEquipmentnum() {
        return equipmentnum;
    }

    /**
     * 设置设备编号
     *
     * @param equipmentnum 设备编号
     */
    public void setEquipmentnum(String equipmentnum) {
        this.equipmentnum = equipmentnum;
    }

    /**
     * 获取报修类型
     *
     * @return repairType - 报修类型
     */
    public String getRepairtype() {
        return repairtype;
    }

    /**
     * 设置报修类型
     *
     * @param repairtype 报修类型
     */
    public void setRepairtype(String repairtype) {
        this.repairtype = repairtype;
    }

    /**
     * 获取故障现象
     *
     * @return phenomenon - 故障现象
     */
    public String getPhenomenon() {
        return phenomenon;
    }

    /**
     * 设置故障现象
     *
     * @param phenomenon 故障现象
     */
    public void setPhenomenon(String phenomenon) {
        this.phenomenon = phenomenon;
    }

    /**
     * 获取预约时间
     *
     * @return appointmentTime - 预约时间
     */
    public Date getAppointmenttime() {
        return appointmenttime;
    }

    /**
     * 设置预约时间
     *
     * @param appointmenttime 预约时间
     */
    public void setAppointmenttime(Date appointmenttime) {
        this.appointmenttime = appointmenttime;
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
     * 获取状态 0待处理 1已受理 2完成
     *
     * @return status - 状态 0待处理 1已受理 2完成
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 0待处理 1已受理 2完成
     *
     * @param status 状态 0待处理 1已受理 2完成
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取填写时间
     *
     * @return createTime - 填写时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置填写时间
     *
     * @param createtime 填写时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取报修单号
     *
     * @return orderNum - 报修单号
     */
    public String getOrdernum() {
        return ordernum;
    }

    /**
     * 设置报修单号
     *
     * @param ordernum 报修单号
     */
    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }
}