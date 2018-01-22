package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_alarm")
public class TbAlarm {
    /**
     * 预警ID
     */
    @Id
    @Column(name = "alarm_id")
    private Integer alarmId;

    /**
     * 预警类型
     */
    @Column(name = "alarm_type")
    private String alarmType;

    /**
     * 预警时间
     */
    @Column(name = "alarm_time")
    private Date alarmTime;

    /**
     * 备注说明
     */
    @Column(name = "alarm_remark")
    private String alarmRemark;

    /**
     * 获取预警ID
     *
     * @return alarm_id - 预警ID
     */
    public Integer getAlarmId() {
        return alarmId;
    }

    /**
     * 设置预警ID
     *
     * @param alarmId 预警ID
     */
    public void setAlarmId(Integer alarmId) {
        this.alarmId = alarmId;
    }

    /**
     * 获取预警类型
     *
     * @return alarm_type - 预警类型
     */
    public String getAlarmType() {
        return alarmType;
    }

    /**
     * 设置预警类型
     *
     * @param alarmType 预警类型
     */
    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    /**
     * 获取预警时间
     *
     * @return alarm_time - 预警时间
     */
    public Date getAlarmTime() {
        return alarmTime;
    }

    /**
     * 设置预警时间
     *
     * @param alarmTime 预警时间
     */
    public void setAlarmTime(Date alarmTime) {
        this.alarmTime = alarmTime;
    }

    /**
     * 获取备注说明
     *
     * @return alarm_remark - 备注说明
     */
    public String getAlarmRemark() {
        return alarmRemark;
    }

    /**
     * 设置备注说明
     *
     * @param alarmRemark 备注说明
     */
    public void setAlarmRemark(String alarmRemark) {
        this.alarmRemark = alarmRemark;
    }
}