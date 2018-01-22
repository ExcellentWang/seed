package com.company.restapi.model;

import javax.persistence.*;

@Table(name = "t_s_role_menu")
public class TSRoleMenu {
    @Id
    @Column(name = "role_menu_id")
    private Integer roleMenuId;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "menu_id")
    private Integer menuId;

    /**
     * @return role_menu_id
     */
    public Integer getRoleMenuId() {
        return roleMenuId;
    }

    /**
     * @param roleMenuId
     */
    public void setRoleMenuId(Integer roleMenuId) {
        this.roleMenuId = roleMenuId;
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

    /**
     * @return menu_id
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * @param menuId
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}