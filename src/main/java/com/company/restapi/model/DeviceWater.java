package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "device_water")
public class DeviceWater {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 设备id
     */
    @Column(name = "device_id")
    private Long deviceId;

    /**
     * 用水量/L
     */
    @Column(name = "use_water")
    private String useWater;

    /**
     * 节水量/L
     */
    @Column(name = "jie_water")
    private String jieWater;

    /**
     * 单位秒
     */
    @Column(name = "bath_time")
    private String bathTime;

    /**
     * 设定温度
     */
    @Column(name = "set_temperature")
    private String setTemperature;

    /**
     * 设定流速等级
     */
    @Column(name = "flow_grade")
    private String flowGrade;

    /**
     * 实际流速
     */
    private String grade;

    @Column(name = "create_time")
    private Date createTime;

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
     * 获取设备id
     *
     * @return device_id - 设备id
     */
    public Long getDeviceId() {
        return deviceId;
    }

    /**
     * 设置设备id
     *
     * @param deviceId 设备id
     */
    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 获取用水量/L
     *
     * @return use_water - 用水量/L
     */
    public String getUseWater() {
        return useWater;
    }

    /**
     * 设置用水量/L
     *
     * @param useWater 用水量/L
     */
    public void setUseWater(String useWater) {
        this.useWater = useWater;
    }

    /**
     * 获取节水量/L
     *
     * @return jie_water - 节水量/L
     */
    public String getJieWater() {
        return jieWater;
    }

    /**
     * 设置节水量/L
     *
     * @param jieWater 节水量/L
     */
    public void setJieWater(String jieWater) {
        this.jieWater = jieWater;
    }

    /**
     * 获取单位秒
     *
     * @return bath_time - 单位秒
     */
    public String getBathTime() {
        return bathTime;
    }

    /**
     * 设置单位秒
     *
     * @param bathTime 单位秒
     */
    public void setBathTime(String bathTime) {
        this.bathTime = bathTime;
    }

    /**
     * 获取设定温度
     *
     * @return set_temperature - 设定温度
     */
    public String getSetTemperature() {
        return setTemperature;
    }

    /**
     * 设置设定温度
     *
     * @param setTemperature 设定温度
     */
    public void setSetTemperature(String setTemperature) {
        this.setTemperature = setTemperature;
    }

    /**
     * 获取设定流速等级
     *
     * @return flow_grade - 设定流速等级
     */
    public String getFlowGrade() {
        return flowGrade;
    }

    /**
     * 设置设定流速等级
     *
     * @param flowGrade 设定流速等级
     */
    public void setFlowGrade(String flowGrade) {
        this.flowGrade = flowGrade;
    }

    /**
     * 获取实际流速
     *
     * @return grade - 实际流速
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置实际流速
     *
     * @param grade 实际流速
     */
    public void setGrade(String grade) {
        this.grade = grade;
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
}