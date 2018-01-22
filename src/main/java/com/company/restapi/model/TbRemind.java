package com.company.restapi.model;

import javax.persistence.*;

@Table(name = "tb_remind")
public class TbRemind {
    /**
     * 提醒ID
     */
    @Id
    @Column(name = "remind_id")
    private Integer remindId;

    /**
     * 设备ID
     */
    @Column(name = "equipment_id")
    private Integer equipmentId;

    /**
     * 提醒方式 0振动 1响铃 2振铃
     */
    @Column(name = "warn_type")
    private Integer warnType;

    /**
     * 用水节水提醒开关 0关 1开
     */
    @Column(name = "water_warn_status")
    private Integer waterWarnStatus;

    /**
     * 热水温度提醒 0关 1开
     */
    @Column(name = "water_under")
    private Integer waterUnder;

    /**
     * 最低温度
     */
    @Column(name = "under_temperature")
    private String underTemperature;

    /**
     * 最低温度提醒频次
     */
    @Column(name = "under_times")
    private String underTimes;

    /**
     * 出水温度提醒 0关 1开
     */
    @Column(name = "water_hight")
    private Integer waterHight;

    /**
     * 最高温度
     */
    @Column(name = "hight_temperature")
    private String hightTemperature;

    /**
     * 高于最高温度提醒频次
     */
    @Column(name = "hight_times")
    private String hightTimes;

    /**
     * 获取提醒ID
     *
     * @return remind_id - 提醒ID
     */
    public Integer getRemindId() {
        return remindId;
    }

    /**
     * 设置提醒ID
     *
     * @param remindId 提醒ID
     */
    public void setRemindId(Integer remindId) {
        this.remindId = remindId;
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
     * 获取提醒方式 0振动 1响铃 2振铃
     *
     * @return warn_type - 提醒方式 0振动 1响铃 2振铃
     */
    public Integer getWarnType() {
        return warnType;
    }

    /**
     * 设置提醒方式 0振动 1响铃 2振铃
     *
     * @param warnType 提醒方式 0振动 1响铃 2振铃
     */
    public void setWarnType(Integer warnType) {
        this.warnType = warnType;
    }

    /**
     * 获取用水节水提醒开关 0关 1开
     *
     * @return water_warn_status - 用水节水提醒开关 0关 1开
     */
    public Integer getWaterWarnStatus() {
        return waterWarnStatus;
    }

    /**
     * 设置用水节水提醒开关 0关 1开
     *
     * @param waterWarnStatus 用水节水提醒开关 0关 1开
     */
    public void setWaterWarnStatus(Integer waterWarnStatus) {
        this.waterWarnStatus = waterWarnStatus;
    }

    /**
     * 获取热水温度提醒 0关 1开
     *
     * @return water_under - 热水温度提醒 0关 1开
     */
    public Integer getWaterUnder() {
        return waterUnder;
    }

    /**
     * 设置热水温度提醒 0关 1开
     *
     * @param waterUnder 热水温度提醒 0关 1开
     */
    public void setWaterUnder(Integer waterUnder) {
        this.waterUnder = waterUnder;
    }

    /**
     * 获取最低温度
     *
     * @return under_temperature - 最低温度
     */
    public String getUnderTemperature() {
        return underTemperature;
    }

    /**
     * 设置最低温度
     *
     * @param underTemperature 最低温度
     */
    public void setUnderTemperature(String underTemperature) {
        this.underTemperature = underTemperature;
    }

    /**
     * 获取最低温度提醒频次
     *
     * @return under_times - 最低温度提醒频次
     */
    public String getUnderTimes() {
        return underTimes;
    }

    /**
     * 设置最低温度提醒频次
     *
     * @param underTimes 最低温度提醒频次
     */
    public void setUnderTimes(String underTimes) {
        this.underTimes = underTimes;
    }

    /**
     * 获取出水温度提醒 0关 1开
     *
     * @return water_hight - 出水温度提醒 0关 1开
     */
    public Integer getWaterHight() {
        return waterHight;
    }

    /**
     * 设置出水温度提醒 0关 1开
     *
     * @param waterHight 出水温度提醒 0关 1开
     */
    public void setWaterHight(Integer waterHight) {
        this.waterHight = waterHight;
    }

    /**
     * 获取最高温度
     *
     * @return hight_temperature - 最高温度
     */
    public String getHightTemperature() {
        return hightTemperature;
    }

    /**
     * 设置最高温度
     *
     * @param hightTemperature 最高温度
     */
    public void setHightTemperature(String hightTemperature) {
        this.hightTemperature = hightTemperature;
    }

    /**
     * 获取高于最高温度提醒频次
     *
     * @return hight_times - 高于最高温度提醒频次
     */
    public String getHightTimes() {
        return hightTimes;
    }

    /**
     * 设置高于最高温度提醒频次
     *
     * @param hightTimes 高于最高温度提醒频次
     */
    public void setHightTimes(String hightTimes) {
        this.hightTimes = hightTimes;
    }
}