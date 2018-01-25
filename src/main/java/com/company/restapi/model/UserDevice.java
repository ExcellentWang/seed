package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_device")
public class UserDevice {
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
    @Column(name = "EQUIPMENT_ID")
    private String equipmentId;

    /**
     * 权限 0查看 1查看并控制
     */
    @Column(name = "AUTHORITY")
    private Short authority;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 拥有状态 0绑定 1共享
     */
    @Column(name = "STATUS")
    private Short status;

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
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取设备ID
     *
     * @return EQUIPMENT_ID - 设备ID
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /**
     * 设置设备ID
     *
     * @param equipmentId 设备ID
     */
    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    /**
     * 获取权限 0查看 1查看并控制
     *
     * @return AUTHORITY - 权限 0查看 1查看并控制
     */
    public Short getAuthority() {
        return authority;
    }

    /**
     * 设置权限 0查看 1查看并控制
     *
     * @param authority 权限 0查看 1查看并控制
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
     * 获取拥有状态 0绑定 1共享
     *
     * @return STATUS - 拥有状态 0绑定 1共享
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置拥有状态 0绑定 1共享
     *
     * @param status 拥有状态 0绑定 1共享
     */
    public void setStatus(Short status) {
        this.status = status;
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