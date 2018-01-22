package com.company.restapi.model;

import javax.persistence.*;

@Table(name = "tb_debugging")
public class TbDebugging {
    /**
     * 调试ID
     */
    @Id
    @Column(name = "debugging_id")
    private Integer debuggingId;

    /**
     * 设备ID
     */
    @Column(name = "equipment_id")
    private Integer equipmentId;

    /**
     * 水箱
     */
    @Column(name = "waterTank")
    private String watertank;

    /**
     * 进水冷水传感器
     */
    @Column(name = "coldSensor")
    private String coldsensor;

    /**
     * 热水传感器
     */
    @Column(name = "hotSensor")
    private String hotsensor;

    /**
     * 混水阀温度
     */
    @Column(name = "mixTemperature")
    private String mixtemperature;

    /**
     * 混水阀通讯
     */
    @Column(name = "mixCommunication")
    private String mixcommunication;

    /**
     * 缓冲进水传感器
     */
    @Column(name = "bufferSensor")
    private String buffersensor;

    /**
     * 出水传感器
     */
    @Column(name = "effluentSensor")
    private String effluentsensor;

    /**
     * 泵状态
     */
    @Column(name = "pumpStatus")
    private String pumpstatus;

    /**
     * 获取调试ID
     *
     * @return debugging_id - 调试ID
     */
    public Integer getDebuggingId() {
        return debuggingId;
    }

    /**
     * 设置调试ID
     *
     * @param debuggingId 调试ID
     */
    public void setDebuggingId(Integer debuggingId) {
        this.debuggingId = debuggingId;
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
     * 获取水箱
     *
     * @return waterTank - 水箱
     */
    public String getWatertank() {
        return watertank;
    }

    /**
     * 设置水箱
     *
     * @param watertank 水箱
     */
    public void setWatertank(String watertank) {
        this.watertank = watertank;
    }

    /**
     * 获取进水冷水传感器
     *
     * @return coldSensor - 进水冷水传感器
     */
    public String getColdsensor() {
        return coldsensor;
    }

    /**
     * 设置进水冷水传感器
     *
     * @param coldsensor 进水冷水传感器
     */
    public void setColdsensor(String coldsensor) {
        this.coldsensor = coldsensor;
    }

    /**
     * 获取热水传感器
     *
     * @return hotSensor - 热水传感器
     */
    public String getHotsensor() {
        return hotsensor;
    }

    /**
     * 设置热水传感器
     *
     * @param hotsensor 热水传感器
     */
    public void setHotsensor(String hotsensor) {
        this.hotsensor = hotsensor;
    }

    /**
     * 获取混水阀温度
     *
     * @return mixTemperature - 混水阀温度
     */
    public String getMixtemperature() {
        return mixtemperature;
    }

    /**
     * 设置混水阀温度
     *
     * @param mixtemperature 混水阀温度
     */
    public void setMixtemperature(String mixtemperature) {
        this.mixtemperature = mixtemperature;
    }

    /**
     * 获取混水阀通讯
     *
     * @return mixCommunication - 混水阀通讯
     */
    public String getMixcommunication() {
        return mixcommunication;
    }

    /**
     * 设置混水阀通讯
     *
     * @param mixcommunication 混水阀通讯
     */
    public void setMixcommunication(String mixcommunication) {
        this.mixcommunication = mixcommunication;
    }

    /**
     * 获取缓冲进水传感器
     *
     * @return bufferSensor - 缓冲进水传感器
     */
    public String getBuffersensor() {
        return buffersensor;
    }

    /**
     * 设置缓冲进水传感器
     *
     * @param buffersensor 缓冲进水传感器
     */
    public void setBuffersensor(String buffersensor) {
        this.buffersensor = buffersensor;
    }

    /**
     * 获取出水传感器
     *
     * @return effluentSensor - 出水传感器
     */
    public String getEffluentsensor() {
        return effluentsensor;
    }

    /**
     * 设置出水传感器
     *
     * @param effluentsensor 出水传感器
     */
    public void setEffluentsensor(String effluentsensor) {
        this.effluentsensor = effluentsensor;
    }

    /**
     * 获取泵状态
     *
     * @return pumpStatus - 泵状态
     */
    public String getPumpstatus() {
        return pumpstatus;
    }

    /**
     * 设置泵状态
     *
     * @param pumpstatus 泵状态
     */
    public void setPumpstatus(String pumpstatus) {
        this.pumpstatus = pumpstatus;
    }
}