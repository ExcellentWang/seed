package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_equipment")
public class TbEquipment {
    /**
     * 设备ID
     */
    @Id
    @Column(name = "equipment_id")
    private Integer equipmentId;

    /**
     * 所属用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 设备编号
     */
    @Column(name = "equipmentNum")
    private String equipmentnum;

    /**
     * 设备类型
     */
    private String type;

    /**
     * 设备图片地址
     */
    @Column(name = "equipmentPicture")
    private String equipmentpicture;

    /**
     * 设备名称
     */
    @Column(name = "equipmentName")
    private String equipmentname;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "binded_at")
    private Date bindedAt;

    /**
     * 产品类型
     */
    private String product;

    /**
     * 固件版本
     */
    @Column(name = "firm_version")
    private String firmVersion;

    /**
     * 获取设备ID
     *
     * @return equipment_id - 设备ID
     */
    public Integer getEquipmentId() {
        return equipmentId;
    }

    /**
     * 设置设备ID
     *
     * @param equipmentId 设备ID
     */
    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    /**
     * 获取所属用户ID
     *
     * @return user_id - 所属用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置所属用户ID
     *
     * @param userId 所属用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取设备编号
     *
     * @return equipmentNum - 设备编号
     */
    public String getEquipmentnum() {
        return equipmentnum;
    }

    /**
     * 设置设备编号
     *
     * @param equipmentnum 设备编号
     */
    public void setEquipmentnum(String equipmentnum) {
        this.equipmentnum = equipmentnum;
    }

    /**
     * 获取设备类型
     *
     * @return type - 设备类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置设备类型
     *
     * @param type 设备类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取设备图片地址
     *
     * @return equipmentPicture - 设备图片地址
     */
    public String getEquipmentpicture() {
        return equipmentpicture;
    }

    /**
     * 设置设备图片地址
     *
     * @param equipmentpicture 设备图片地址
     */
    public void setEquipmentpicture(String equipmentpicture) {
        this.equipmentpicture = equipmentpicture;
    }

    /**
     * 获取设备名称
     *
     * @return equipmentName - 设备名称
     */
    public String getEquipmentname() {
        return equipmentname;
    }

    /**
     * 设置设备名称
     *
     * @param equipmentname 设备名称
     */
    public void setEquipmentname(String equipmentname) {
        this.equipmentname = equipmentname;
    }

    /**
     * @return created_at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return binded_at
     */
    public Date getBindedAt() {
        return bindedAt;
    }

    /**
     * @param bindedAt
     */
    public void setBindedAt(Date bindedAt) {
        this.bindedAt = bindedAt;
    }

    /**
     * 获取产品类型
     *
     * @return product - 产品类型
     */
    public String getProduct() {
        return product;
    }

    /**
     * 设置产品类型
     *
     * @param product 产品类型
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * 获取固件版本
     *
     * @return firm_version - 固件版本
     */
    public String getFirmVersion() {
        return firmVersion;
    }

    /**
     * 设置固件版本
     *
     * @param firmVersion 固件版本
     */
    public void setFirmVersion(String firmVersion) {
        this.firmVersion = firmVersion;
    }
}