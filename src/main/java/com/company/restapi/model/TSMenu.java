package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_s_menu")
public class TSMenu {
    @Id
    @Column(name = "menu_id")
    private Integer menuId;

    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "menu_desc")
    private String menuDesc;

    @Column(name = "menu_url")
    private String menuUrl;

    @Column(name = "menu_pid")
    private Integer menuPid;

    /**
     * 资源类型，1：文件夹菜单，2：功能菜单，3：功能按钮
     */
    @Column(name = "menu_type")
    private Integer menuType;

    @Column(name = "menu_status")
    private Integer menuStatus;

    @Column(name = "menu_level")
    private Integer menuLevel;

    @Column(name = "menu_icon")
    private String menuIcon;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "menu_order")
    private Integer menuOrder;

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

    /**
     * @return menu_name
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * @param menuName
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * @return menu_desc
     */
    public String getMenuDesc() {
        return menuDesc;
    }

    /**
     * @param menuDesc
     */
    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
    }

    /**
     * @return menu_url
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * @param menuUrl
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     * @return menu_pid
     */
    public Integer getMenuPid() {
        return menuPid;
    }

    /**
     * @param menuPid
     */
    public void setMenuPid(Integer menuPid) {
        this.menuPid = menuPid;
    }

    /**
     * 获取资源类型，1：文件夹菜单，2：功能菜单，3：功能按钮
     *
     * @return menu_type - 资源类型，1：文件夹菜单，2：功能菜单，3：功能按钮
     */
    public Integer getMenuType() {
        return menuType;
    }

    /**
     * 设置资源类型，1：文件夹菜单，2：功能菜单，3：功能按钮
     *
     * @param menuType 资源类型，1：文件夹菜单，2：功能菜单，3：功能按钮
     */
    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    /**
     * @return menu_status
     */
    public Integer getMenuStatus() {
        return menuStatus;
    }

    /**
     * @param menuStatus
     */
    public void setMenuStatus(Integer menuStatus) {
        this.menuStatus = menuStatus;
    }

    /**
     * @return menu_level
     */
    public Integer getMenuLevel() {
        return menuLevel;
    }

    /**
     * @param menuLevel
     */
    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    /**
     * @return menu_icon
     */
    public String getMenuIcon() {
        return menuIcon;
    }

    /**
     * @param menuIcon
     */
    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
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
     * @return menu_order
     */
    public Integer getMenuOrder() {
        return menuOrder;
    }

    /**
     * @param menuOrder
     */
    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }
}