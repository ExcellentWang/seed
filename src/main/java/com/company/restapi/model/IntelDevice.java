package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "intel_device")
public class IntelDevice {
    /**
     * 设备ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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

    /**
     * 创建时间
     */
    @Column(name = "created_at")
    private Date createdAt;

    /**
     * 绑定时间
     */
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
     * @return id - 设备ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置设备ID
     *
     * @param id 设备ID
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 获取创建时间
     *
     * @return created_at - 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取绑定时间
     *
     * @return binded_at - 绑定时间
     */
    public Date getBindedAt() {
        return bindedAt;
    }

    /**
     * 设置绑定时间
     *
     * @param bindedAt 绑定时间
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