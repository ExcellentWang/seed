package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "device_runtime_info")
public class DeviceRuntimeInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 设备ID
     */
    @Column(name = "device_id")
    private Integer deviceId;

    /**
     * 设备状态 01：待机   02：准备中（包括预约倒计时） 03：使用中  04：离线
     */
    @Column(name = "uploadStatus")
    private String uploadstatus;

    /**
     * 模式 01:成人模式 02:儿童模式
     */
    @Column(name = "useType")
    private String usetype;

    /**
     * 混水温度
     */
    @Column(name = "valveOutTemperature")
    private String valveouttemperature;

    /**
     * 设定温度
     */
    @Column(name = "setTemperature")
    private String settemperature;

    /**
     * 缓冲温度
     */
    @Column(name = "bufferTemperature")
    private String buffertemperature;

    /**
     * 出水温度
     */
    @Column(name = "outTemperature")
    private String outtemperature;

    /**
     * 设定流量
     */
    @Column(name = "flowGrade")
    private String flowgrade;

    /**
     * 实时流量
     */
    @Column(name = "flowSpeed")
    private String flowspeed;

    /**
     * 电池电压
     */
    @Column(name = "batteryVoltage")
    private String batteryvoltage;

    /**
     * 电池温度
     */
    @Column(name = "batteryTemperature")
    private String batterytemperature;

    /**
     * 时间戳由sql自动补全
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 热水温度
     */
    @Column(name = "hot_water_temp")
    private String hotWaterTemp;

    /**
     * 冷水温度
     */
    @Column(name = "code_water_temp")
    private String codeWaterTemp;

    /**
     * 定时定量普通模式
     */
    @Column(name = "time_type")
    private String timeType;

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
     * 获取设备ID
     *
     * @return device_id - 设备ID
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    /**
     * 设置设备ID
     *
     * @param deviceId 设备ID
     */
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 获取设备状态 01：待机   02：准备中（包括预约倒计时） 03：使用中  04：离线
     *
     * @return uploadStatus - 设备状态 01：待机   02：准备中（包括预约倒计时） 03：使用中  04：离线
     */
    public String getUploadstatus() {
        return uploadstatus;
    }

    /**
     * 设置设备状态 01：待机   02：准备中（包括预约倒计时） 03：使用中  04：离线
     *
     * @param uploadstatus 设备状态 01：待机   02：准备中（包括预约倒计时） 03：使用中  04：离线
     */
    public void setUploadstatus(String uploadstatus) {
        this.uploadstatus = uploadstatus;
    }

    /**
     * 获取模式 01:成人模式 02:儿童模式
     *
     * @return useType - 模式 01:成人模式 02:儿童模式
     */
    public String getUsetype() {
        return usetype;
    }

    /**
     * 设置模式 01:成人模式 02:儿童模式
     *
     * @param usetype 模式 01:成人模式 02:儿童模式
     */
    public void setUsetype(String usetype) {
        this.usetype = usetype;
    }

    /**
     * 获取混水温度
     *
     * @return valveOutTemperature - 混水温度
     */
    public String getValveouttemperature() {
        return valveouttemperature;
    }

    /**
     * 设置混水温度
     *
     * @param valveouttemperature 混水温度
     */
    public void setValveouttemperature(String valveouttemperature) {
        this.valveouttemperature = valveouttemperature;
    }

    /**
     * 获取设定温度
     *
     * @return setTemperature - 设定温度
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
     * 获取缓冲温度
     *
     * @return bufferTemperature - 缓冲温度
     */
    public String getBuffertemperature() {
        return buffertemperature;
    }

    /**
     * 设置缓冲温度
     *
     * @param buffertemperature 缓冲温度
     */
    public void setBuffertemperature(String buffertemperature) {
        this.buffertemperature = buffertemperature;
    }

    /**
     * 获取出水温度
     *
     * @return outTemperature - 出水温度
     */
    public String getOuttemperature() {
        return outtemperature;
    }

    /**
     * 设置出水温度
     *
     * @param outtemperature 出水温度
     */
    public void setOuttemperature(String outtemperature) {
        this.outtemperature = outtemperature;
    }

    /**
     * 获取设定流量
     *
     * @return flowGrade - 设定流量
     */
    public String getFlowgrade() {
        return flowgrade;
    }

    /**
     * 设置设定流量
     *
     * @param flowgrade 设定流量
     */
    public void setFlowgrade(String flowgrade) {
        this.flowgrade = flowgrade;
    }

    /**
     * 获取实时流量
     *
     * @return flowSpeed - 实时流量
     */
    public String getFlowspeed() {
        return flowspeed;
    }

    /**
     * 设置实时流量
     *
     * @param flowspeed 实时流量
     */
    public void setFlowspeed(String flowspeed) {
        this.flowspeed = flowspeed;
    }

    /**
     * 获取电池电压
     *
     * @return batteryVoltage - 电池电压
     */
    public String getBatteryvoltage() {
        return batteryvoltage;
    }

    /**
     * 设置电池电压
     *
     * @param batteryvoltage 电池电压
     */
    public void setBatteryvoltage(String batteryvoltage) {
        this.batteryvoltage = batteryvoltage;
    }

    /**
     * 获取电池温度
     *
     * @return batteryTemperature - 电池温度
     */
    public String getBatterytemperature() {
        return batterytemperature;
    }

    /**
     * 设置电池温度
     *
     * @param batterytemperature 电池温度
     */
    public void setBatterytemperature(String batterytemperature) {
        this.batterytemperature = batterytemperature;
    }

    /**
     * 获取时间戳由sql自动补全
     *
     * @return create_time - 时间戳由sql自动补全
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置时间戳由sql自动补全
     *
     * @param createTime 时间戳由sql自动补全
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取热水温度
     *
     * @return hot_water_temp - 热水温度
     */
    public String getHotWaterTemp() {
        return hotWaterTemp;
    }

    /**
     * 设置热水温度
     *
     * @param hotWaterTemp 热水温度
     */
    public void setHotWaterTemp(String hotWaterTemp) {
        this.hotWaterTemp = hotWaterTemp;
    }

    /**
     * 获取冷水温度
     *
     * @return code_water_temp - 冷水温度
     */
    public String getCodeWaterTemp() {
        return codeWaterTemp;
    }

    /**
     * 设置冷水温度
     *
     * @param codeWaterTemp 冷水温度
     */
    public void setCodeWaterTemp(String codeWaterTemp) {
        this.codeWaterTemp = codeWaterTemp;
    }

    /**
     * 获取定时定量普通模式
     *
     * @return time_type - 定时定量普通模式
     */
    public String getTimeType() {
        return timeType;
    }

    /**
     * 设置定时定量普通模式
     *
     * @param timeType 定时定量普通模式
     */
    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }
}