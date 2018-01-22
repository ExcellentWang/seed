package com.company.restapi.model;

import javax.persistence.*;

@Table(name = "alarm_datatype")
public class AlarmDatatype {
    /**
     * 预警类型ID
     */
    @Id
    @Column(name = "alarm_type")
    private Integer alarmType;

    /**
     * 预警文字描述
     */
    @Column(name = "alarm_name")
    private String alarmName;

    /**
     * 获取预警类型ID
     *
     * @return alarm_type - 预警类型ID
     */
    public Integer getAlarmType() {
        return alarmType;
    }

    /**
     * 设置预警类型ID
     *
     * @param alarmType 预警类型ID
     */
    public void setAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
    }

    /**
     * 获取预警文字描述
     *
     * @return alarm_name - 预警文字描述
     */
    public String getAlarmName() {
        return alarmName;
    }

    /**
     * 设置预警文字描述
     *
     * @param alarmName 预警文字描述
     */
    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }
}