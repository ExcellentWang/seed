package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "guarantee_type")
public class GuaranteeType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 设备类型
     */
    @Column(name = "device_type")
    private String deviceType;

    /**
     * 报修类型名
     */
    @Column(name = "type_name")
    private String typeName;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "motify_time")
    private Date motifyTime;

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
     * 获取设备类型
     *
     * @return device_type - 设备类型
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * 设置设备类型
     *
     * @param deviceType 设备类型
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * 获取报修类型名
     *
     * @return type_name - 报修类型名
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置报修类型名
     *
     * @param typeName 报修类型名
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
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

    /**
     * @return motify_time
     */
    public Date getMotifyTime() {
        return motifyTime;
    }

    /**
     * @param motifyTime
     */
    public void setMotifyTime(Date motifyTime) {
        this.motifyTime = motifyTime;
    }
}