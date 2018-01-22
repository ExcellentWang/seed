package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_deviceinformation")
public class TbDeviceinformation {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 时间
     */
    private Date time;

    /**
     * 内容
     */
    private String content;

    /**
     * 设备id
     */
    @Column(name = "equipment_id")
    private Integer equipmentId;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取时间
     *
     * @return time - 时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置时间
     *
     * @param time 时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取设备id
     *
     * @return equipment_id - 设备id
     */
    public Integer getEquipmentId() {
        return equipmentId;
    }

    /**
     * 设置设备id
     *
     * @param equipmentId 设备id
     */
    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }
}