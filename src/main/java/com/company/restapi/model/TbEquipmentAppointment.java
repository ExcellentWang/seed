package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_equipment_appointment")
public class TbEquipmentAppointment {
    @Id
    @Column(name = "appointment_id")
    private Integer appointmentId;

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
     * 出水速度 0慢 1中等 2快
     */
    @Column(name = "effluent_speed")
    private String effluentSpeed;

    /**
     * 预约时间
     */
    private Date time;

    /**
     * 儿童模式 0关 1开
     */
    @Column(name = "children_status")
    private String childrenStatus;

    /**
     * 预约温度
     */
    @Column(name = "appointment_temperature")
    private String appointmentTemperature;

    /**
     * 出水模式 0定量出水 1定时出水
     */
    @Column(name = "effluent_type")
    private String effluentType;

    /**
     * 出水量
     */
    @Column(name = "effluent_amount")
    private String effluentAmount;

    /**
     * 出水时长
     */
    @Column(name = "effluent_time")
    private String effluentTime;

    /**
     * 出水方式 0花洒 1顶喷
     */
    @Column(name = "effluent_way")
    private String effluentWay;

    private Boolean valid;

    @Column(name = "updated_at")
    private Date updatedAt;

    /**
     * @return appointment_id
     */
    public Integer getAppointmentId() {
        return appointmentId;
    }

    /**
     * @param appointmentId
     */
    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
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
     * 获取出水速度 0慢 1中等 2快
     *
     * @return effluent_speed - 出水速度 0慢 1中等 2快
     */
    public String getEffluentSpeed() {
        return effluentSpeed;
    }

    /**
     * 设置出水速度 0慢 1中等 2快
     *
     * @param effluentSpeed 出水速度 0慢 1中等 2快
     */
    public void setEffluentSpeed(String effluentSpeed) {
        this.effluentSpeed = effluentSpeed;
    }

    /**
     * 获取预约时间
     *
     * @return time - 预约时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置预约时间
     *
     * @param time 预约时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取儿童模式 0关 1开
     *
     * @return children_status - 儿童模式 0关 1开
     */
    public String getChildrenStatus() {
        return childrenStatus;
    }

    /**
     * 设置儿童模式 0关 1开
     *
     * @param childrenStatus 儿童模式 0关 1开
     */
    public void setChildrenStatus(String childrenStatus) {
        this.childrenStatus = childrenStatus;
    }

    /**
     * 获取预约温度
     *
     * @return appointment_temperature - 预约温度
     */
    public String getAppointmentTemperature() {
        return appointmentTemperature;
    }

    /**
     * 设置预约温度
     *
     * @param appointmentTemperature 预约温度
     */
    public void setAppointmentTemperature(String appointmentTemperature) {
        this.appointmentTemperature = appointmentTemperature;
    }

    /**
     * 获取出水模式 0定量出水 1定时出水
     *
     * @return effluent_type - 出水模式 0定量出水 1定时出水
     */
    public String getEffluentType() {
        return effluentType;
    }

    /**
     * 设置出水模式 0定量出水 1定时出水
     *
     * @param effluentType 出水模式 0定量出水 1定时出水
     */
    public void setEffluentType(String effluentType) {
        this.effluentType = effluentType;
    }

    /**
     * 获取出水量
     *
     * @return effluent_amount - 出水量
     */
    public String getEffluentAmount() {
        return effluentAmount;
    }

    /**
     * 设置出水量
     *
     * @param effluentAmount 出水量
     */
    public void setEffluentAmount(String effluentAmount) {
        this.effluentAmount = effluentAmount;
    }

    /**
     * 获取出水时长
     *
     * @return effluent_time - 出水时长
     */
    public String getEffluentTime() {
        return effluentTime;
    }

    /**
     * 设置出水时长
     *
     * @param effluentTime 出水时长
     */
    public void setEffluentTime(String effluentTime) {
        this.effluentTime = effluentTime;
    }

    /**
     * 获取出水方式 0花洒 1顶喷
     *
     * @return effluent_way - 出水方式 0花洒 1顶喷
     */
    public String getEffluentWay() {
        return effluentWay;
    }

    /**
     * 设置出水方式 0花洒 1顶喷
     *
     * @param effluentWay 出水方式 0花洒 1顶喷
     */
    public void setEffluentWay(String effluentWay) {
        this.effluentWay = effluentWay;
    }

    /**
     * @return valid
     */
    public Boolean getValid() {
        return valid;
    }

    /**
     * @param valid
     */
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    /**
     * @return updated_at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}