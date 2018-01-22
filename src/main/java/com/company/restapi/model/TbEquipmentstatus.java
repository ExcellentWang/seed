package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_equipmentstatus")
public class TbEquipmentstatus {
    @Id
    @Column(name = "status_id")
    private Integer statusId;

    /**
     * 设备ID
     */
    @Column(name = "equipment_id")
    private Integer equipmentId;

    /**
     * 工作状态 0待机中、1加热中、2预约中、3使用中、4离线
     */
    @Column(name = "workStatus")
    private String workstatus;

    /**
     * 语音播报开关状态 0关 1开
     */
    private String voicebroadcast;

    /**
     * 语音播报音量
     */
    private String volume;

    /**
     * 当前水温
     */
    private String temperature;

    /**
     * 设备ip
     */
    private String ip;

    /**
     * 端口
     */
    private String port;

    /**
     * 更新时间
     */
    @Column(name = "last_active_at")
    private Date lastActiveAt;

    /**
     * 固件版本
     */
    @Column(name = "firmware_version")
    private String firmwareVersion;

    /**
     * 背光
     */
    private String backlight;

    /**
     * 出水方式
     */
    @Column(name = "effluent_way")
    private String effluentWay;

    /**
     * 出水模式
     */
    @Column(name = "effluent_type")
    private String effluentType;

    /**
     * app禁用（1：开，0关）
     */
    @Column(name = "app_enabled")
    private String appEnabled;

    /**
     * 月用水量
     */
    @Column(name = "m_use_water")
    private String mUseWater;

    /**
     * 月节水量
     */
    @Column(name = "m_jie_water")
    private String mJieWater;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 设定温度
     */
    private String settemperature;

    /**
     * 1开始出水, 2暂停出水
     */
    private String started;

    /**
     * 剩余水量
     */
    @Column(name = "sur_water")
    private String surWater;

    /**
     * 剩余时间
     */
    @Column(name = "sur_time")
    private String surTime;

    /**
     * 出水模式01 表示定量，02 表示定时 00普通模式
     */
    @Column(name = "effluent_type2")
    private String effluentType2;

    /**
     * 月用水量推送时间
     */
    @Column(name = "m_send_time")
    private Date mSendTime;

    /**
     * 预约推送时间
     */
    @Column(name = "a_send_time")
    private Date aSendTime;

    /**
     * 流速等级
     */
    @Column(name = "current_flow_grade")
    private String currentFlowGrade;

    /**
     * 热水温度高推送时间
     */
    @Column(name = "rw_send_time")
    private Date rwSendTime;

    /**
     * 出水温度高推送时间
     */
    @Column(name = "cw_send_time")
    private Date cwSendTime;

    /**
     * 异常推送时间
     */
    @Column(name = "scyc_send_time")
    private Date scycSendTime;

    /**
     * @return status_id
     */
    public Integer getStatusId() {
        return statusId;
    }

    /**
     * @param statusId
     */
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
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
     * 获取工作状态 0待机中、1加热中、2预约中、3使用中、4离线
     *
     * @return workStatus - 工作状态 0待机中、1加热中、2预约中、3使用中、4离线
     */
    public String getWorkstatus() {
        return workstatus;
    }

    /**
     * 设置工作状态 0待机中、1加热中、2预约中、3使用中、4离线
     *
     * @param workstatus 工作状态 0待机中、1加热中、2预约中、3使用中、4离线
     */
    public void setWorkstatus(String workstatus) {
        this.workstatus = workstatus;
    }

    /**
     * 获取语音播报开关状态 0关 1开
     *
     * @return voicebroadcast - 语音播报开关状态 0关 1开
     */
    public String getVoicebroadcast() {
        return voicebroadcast;
    }

    /**
     * 设置语音播报开关状态 0关 1开
     *
     * @param voicebroadcast 语音播报开关状态 0关 1开
     */
    public void setVoicebroadcast(String voicebroadcast) {
        this.voicebroadcast = voicebroadcast;
    }

    /**
     * 获取语音播报音量
     *
     * @return volume - 语音播报音量
     */
    public String getVolume() {
        return volume;
    }

    /**
     * 设置语音播报音量
     *
     * @param volume 语音播报音量
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /**
     * 获取当前水温
     *
     * @return temperature - 当前水温
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * 设置当前水温
     *
     * @param temperature 当前水温
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    /**
     * 获取设备ip
     *
     * @return ip - 设备ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置设备ip
     *
     * @param ip 设备ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取端口
     *
     * @return port - 端口
     */
    public String getPort() {
        return port;
    }

    /**
     * 设置端口
     *
     * @param port 端口
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * 获取更新时间
     *
     * @return last_active_at - 更新时间
     */
    public Date getLastActiveAt() {
        return lastActiveAt;
    }

    /**
     * 设置更新时间
     *
     * @param lastActiveAt 更新时间
     */
    public void setLastActiveAt(Date lastActiveAt) {
        this.lastActiveAt = lastActiveAt;
    }

    /**
     * 获取固件版本
     *
     * @return firmware_version - 固件版本
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * 设置固件版本
     *
     * @param firmwareVersion 固件版本
     */
    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    /**
     * 获取背光
     *
     * @return backlight - 背光
     */
    public String getBacklight() {
        return backlight;
    }

    /**
     * 设置背光
     *
     * @param backlight 背光
     */
    public void setBacklight(String backlight) {
        this.backlight = backlight;
    }

    /**
     * 获取出水方式
     *
     * @return effluent_way - 出水方式
     */
    public String getEffluentWay() {
        return effluentWay;
    }

    /**
     * 设置出水方式
     *
     * @param effluentWay 出水方式
     */
    public void setEffluentWay(String effluentWay) {
        this.effluentWay = effluentWay;
    }

    /**
     * 获取出水模式
     *
     * @return effluent_type - 出水模式
     */
    public String getEffluentType() {
        return effluentType;
    }

    /**
     * 设置出水模式
     *
     * @param effluentType 出水模式
     */
    public void setEffluentType(String effluentType) {
        this.effluentType = effluentType;
    }

    /**
     * 获取app禁用（1：开，0关）
     *
     * @return app_enabled - app禁用（1：开，0关）
     */
    public String getAppEnabled() {
        return appEnabled;
    }

    /**
     * 设置app禁用（1：开，0关）
     *
     * @param appEnabled app禁用（1：开，0关）
     */
    public void setAppEnabled(String appEnabled) {
        this.appEnabled = appEnabled;
    }

    /**
     * 获取月用水量
     *
     * @return m_use_water - 月用水量
     */
    public String getmUseWater() {
        return mUseWater;
    }

    /**
     * 设置月用水量
     *
     * @param mUseWater 月用水量
     */
    public void setmUseWater(String mUseWater) {
        this.mUseWater = mUseWater;
    }

    /**
     * 获取月节水量
     *
     * @return m_jie_water - 月节水量
     */
    public String getmJieWater() {
        return mJieWater;
    }

    /**
     * 设置月节水量
     *
     * @param mJieWater 月节水量
     */
    public void setmJieWater(String mJieWater) {
        this.mJieWater = mJieWater;
    }

    /**
     * 获取省
     *
     * @return province - 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省
     *
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取设定温度
     *
     * @return settemperature - 设定温度
     */
    public String getSettemperature() {
        return settemperature;
    }

    /**
     * 设置设定温度
     *
     * @param settemperature 设定温度
     */
    public void setSettemperature(String settemperature) {
        this.settemperature = settemperature;
    }

    /**
     * 获取1开始出水, 2暂停出水
     *
     * @return started - 1开始出水, 2暂停出水
     */
    public String getStarted() {
        return started;
    }

    /**
     * 设置1开始出水, 2暂停出水
     *
     * @param started 1开始出水, 2暂停出水
     */
    public void setStarted(String started) {
        this.started = started;
    }

    /**
     * 获取剩余水量
     *
     * @return sur_water - 剩余水量
     */
    public String getSurWater() {
        return surWater;
    }

    /**
     * 设置剩余水量
     *
     * @param surWater 剩余水量
     */
    public void setSurWater(String surWater) {
        this.surWater = surWater;
    }

    /**
     * 获取剩余时间
     *
     * @return sur_time - 剩余时间
     */
    public String getSurTime() {
        return surTime;
    }

    /**
     * 设置剩余时间
     *
     * @param surTime 剩余时间
     */
    public void setSurTime(String surTime) {
        this.surTime = surTime;
    }

    /**
     * 获取出水模式01 表示定量，02 表示定时 00普通模式
     *
     * @return effluent_type2 - 出水模式01 表示定量，02 表示定时 00普通模式
     */
    public String getEffluentType2() {
        return effluentType2;
    }

    /**
     * 设置出水模式01 表示定量，02 表示定时 00普通模式
     *
     * @param effluentType2 出水模式01 表示定量，02 表示定时 00普通模式
     */
    public void setEffluentType2(String effluentType2) {
        this.effluentType2 = effluentType2;
    }

    /**
     * 获取月用水量推送时间
     *
     * @return m_send_time - 月用水量推送时间
     */
    public Date getmSendTime() {
        return mSendTime;
    }

    /**
     * 设置月用水量推送时间
     *
     * @param mSendTime 月用水量推送时间
     */
    public void setmSendTime(Date mSendTime) {
        this.mSendTime = mSendTime;
    }

    /**
     * 获取预约推送时间
     *
     * @return a_send_time - 预约推送时间
     */
    public Date getaSendTime() {
        return aSendTime;
    }

    /**
     * 设置预约推送时间
     *
     * @param aSendTime 预约推送时间
     */
    public void setaSendTime(Date aSendTime) {
        this.aSendTime = aSendTime;
    }

    /**
     * 获取流速等级
     *
     * @return current_flow_grade - 流速等级
     */
    public String getCurrentFlowGrade() {
        return currentFlowGrade;
    }

    /**
     * 设置流速等级
     *
     * @param currentFlowGrade 流速等级
     */
    public void setCurrentFlowGrade(String currentFlowGrade) {
        this.currentFlowGrade = currentFlowGrade;
    }

    /**
     * 获取热水温度高推送时间
     *
     * @return rw_send_time - 热水温度高推送时间
     */
    public Date getRwSendTime() {
        return rwSendTime;
    }

    /**
     * 设置热水温度高推送时间
     *
     * @param rwSendTime 热水温度高推送时间
     */
    public void setRwSendTime(Date rwSendTime) {
        this.rwSendTime = rwSendTime;
    }

    /**
     * 获取出水温度高推送时间
     *
     * @return cw_send_time - 出水温度高推送时间
     */
    public Date getCwSendTime() {
        return cwSendTime;
    }

    /**
     * 设置出水温度高推送时间
     *
     * @param cwSendTime 出水温度高推送时间
     */
    public void setCwSendTime(Date cwSendTime) {
        this.cwSendTime = cwSendTime;
    }

    /**
     * 获取异常推送时间
     *
     * @return scyc_send_time - 异常推送时间
     */
    public Date getScycSendTime() {
        return scycSendTime;
    }

    /**
     * 设置异常推送时间
     *
     * @param scycSendTime 异常推送时间
     */
    public void setScycSendTime(Date scycSendTime) {
        this.scycSendTime = scycSendTime;
    }
}