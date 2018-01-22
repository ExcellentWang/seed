package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_s_role")
public class TSRole {
    @Id
    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_desc")
    private String roleDesc;

    @Column(name = "role_order")
    private Integer roleOrder;

    @Column(name = "role_type")
    private Integer roleType;

    @Column(name = "role_status")
    private Integer roleStatus;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    private String province;

    private String bz;

    private String ext1;

    private String ext2;

    /**
     * @return role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @return role_name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @return role_desc
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * @param roleDesc
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    /**
     * @return role_order
     */
    public Integer getRoleOrder() {
        return roleOrder;
    }

    /**
     * @param roleOrder
     */
    public void setRoleOrder(Integer roleOrder) {
        this.roleOrder = roleOrder;
    }

    /**
     * @return role_type
     */
    public Integer getRoleType() {
        return roleType;
    }

    /**
     * @param roleType
     */
    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    /**
     * @return role_status
     */
    public Integer getRoleStatus() {
        return roleStatus;
    }

    /**
     * @param roleStatus
     */
    public void setRoleStatus(Integer roleStatus) {
        this.roleStatus = roleStatus;
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
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return bz
     */
    public String getBz() {
        return bz;
    }

    /**
     * @param bz
     */
    public void setBz(String bz) {
        this.bz = bz;
    }

    /**
     * @return ext1
     */
    public String getExt1() {
        return ext1;
    }

    /**
     * @param ext1
     */
    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    /**
     * @return ext2
     */
    public String getExt2() {
        return ext2;
    }

    /**
     * @param ext2
     */
    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }
}