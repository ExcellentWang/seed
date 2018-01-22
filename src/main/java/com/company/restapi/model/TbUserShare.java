package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user_share")
public class TbUserShare {
    /**
     * ID
     */
    @Id
    @Column(name = "share_id")
    private Integer shareId;

    /**
     * 用户ID
     */
    @Column(name = "share_user_id")
    private Integer shareUserId;

    /**
     * 设备id
     */
    @Column(name = "equipment_id")
    private Integer equipmentId;

    /**
     * 权限 0查看 1查看并控制
     */
    private Integer authority;

    /**
     * 备注
     */
    private String remark;

    /**
     * 拥有状态 0绑定 1共享
     */
    private Integer status;

    @Column(name = "share_time")
    private Date shareTime;

    /**
     * 获取ID
     *
     * @return share_id - ID
     */
    public Integer getShareId() {
        return shareId;
    }

    /**
     * 设置ID
     *
     * @param shareId ID
     */
    public void setShareId(Integer shareId) {
        this.shareId = shareId;
    }

    /**
     * 获取用户ID
     *
     * @return share_user_id - 用户ID
     */
    public Integer getShareUserId() {
        return shareUserId;
    }

    /**
     * 设置用户ID
     *
     * @param shareUserId 用户ID
     */
    public void setShareUserId(Integer shareUserId) {
        this.shareUserId = shareUserId;
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

    /**
     * 获取权限 0查看 1查看并控制
     *
     * @return authority - 权限 0查看 1查看并控制
     */
    public Integer getAuthority() {
        return authority;
    }

    /**
     * 设置权限 0查看 1查看并控制
     *
     * @param authority 权限 0查看 1查看并控制
     */
    public void setAuthority(Integer authority) {
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
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置拥有状态 0绑定 1共享
     *
     * @param status 拥有状态 0绑定 1共享
     */
    public void setStatus(Integer status) {
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