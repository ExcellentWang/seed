package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_device")
public class UserDevice {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户ID
     */
    @Column(name = "share_user_id")
    private String shareUserId;

    /**
     * 设备id
     */
    @Column(name = "equipment_id")
    private String equipmentId;

    /**
     * 权限 0查看 1查看并控制
     */
    private Short authority;

    /**
     * 备注
     */
    private String remark;

    /**
     * 拥有状态 0绑定 1共享
     */
    private Short status;

    @Column(name = "share_time")
    private Date shareTime;

    /**
     * 获取ID
     *
     * @return id - ID
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
     * @return share_user_id - 用户ID
     */
    public String getShareUserId() {
        return shareUserId;
    }

    /**
     * 设置用户ID
     *
     * @param shareUserId 用户ID
     */
    public void setShareUserId(String shareUserId) {
        this.shareUserId = shareUserId;
    }

    /**
     * 获取设备id
     *
     * @return equipment_id - 设备id
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /**
     * 设置设备id
     *
     * @param equipmentId 设备id
     */
    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    /**
     * 获取权限 0查看 1查看并控制
     *
     * @return authority - 权限 0查看 1查看并控制
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
     * @return remark - 备注
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
     * @return status - 拥有状态 0绑定 1共享
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
     * @return share_time
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