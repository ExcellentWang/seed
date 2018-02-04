package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_device")
public class                                                                                          UserDevice {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户ID
     */
    @Column(name = "USER_ID")
    private String userId;

    /**
     * 设备ID
     */
    @Column(name = "DEVICE_ID")
    private String deviceId;

    /**
     * 权限 1查看 2查看并控制
     */
    @Column(name = "AUTHORITY")
    private Short authority;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 拥有状态 1绑定 2共享
     */
    @Column(name = "DEVICE_STATUS")
    private Short deviceStatus;

    @Column(name = "SHARE_TIME")
    private Date shareTime;

    /**
     * 获取ID
     *
     * @return ID - ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户ID
     *
     * @return USER_ID - 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public UserDevice setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 获取设备ID
     *
     * @return DEVICE_ID - 设备ID
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 设置设备ID
     *
     * @param deviceId 设备ID
     */
    public UserDevice setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 获取权限 1查看 2查看并控制
     *
     * @return AUTHORITY - 权限 1查看 2查看并控制
     */
    public Short getAuthority() {
        return authority;
    }

    /**
     * 设置权限 1查看 2查看并控制
     *
     * @param authority 权限 1查看 2查看并控制
     */
    public void setAuthority(Short authority) {
        this.authority = authority;
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取拥有状态 1绑定 2共享
     *
     * @return DEVICE_STATUS - 拥有状态 1绑定 2共享
     */
    public Short getDeviceStatus() {
        return deviceStatus;
    }

    /**
     * 设置拥有状态 1绑定 2共享
     *
     * @param deviceStatus 拥有状态 1绑定 2共享
     */
    public UserDevice setDeviceStatus(Short deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }

    /**
     * @return SHARE_TIME
     */
    public Date getShareTime() {
        return shareTime;
    }

    /**
     * @param shareTime
     */
    public void setShareTime(Date shareTime) {
        this.shareTime = shareTime;
    }
}