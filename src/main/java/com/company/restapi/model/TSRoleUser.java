package com.company.restapi.model;

import javax.persistence.*;

@Table(name = "t_s_role_user")
public class TSRoleUser {
    @Id
    @Column(name = "role_user_id")
    private Integer roleUserId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "role_id")
    private Integer roleId;

    /**
     * @return role_user_id
     */
    public Integer getRoleUserId() {
        return roleUserId;
    }

    /**
     * @param roleUserId
     */
    public void setRoleUserId(Integer roleUserId) {
        this.roleUserId = roleUserId;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

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
}