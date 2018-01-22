package com.company.restapi.model;

import javax.persistence.*;

@Table(name = "equipment_datatype")
public class EquipmentDatatype {
    @Id
    @Column(name = "equipment_type")
    private Integer equipmentType;

    /**
     * 设备名称
     */
    @Column(name = "equipment_name")
    private String equipmentName;

    /**
     * 保修期
     */
    private Integer period;

    /**
     * 型号说明
     */
    private String remark;

    /**
     * 产品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 设备类型
     */
    private String type;

    /**
     * @return equipment_type
     */
    public Integer getEquipmentType() {
        return equipmentType;
    }

    /**
     * @param equipmentType
     */
    public void setEquipmentType(Integer equipmentType) {
        this.equipmentType = equipmentType;
    }

    /**
     * 获取设备名称
     *
     * @return equipment_name - 设备名称
     */
    public String getEquipmentName() {
        return equipmentName;
    }

    /**
     * 设置设备名称
     *
     * @param equipmentName 设备名称
     */
    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    /**
     * 获取保修期
     *
     * @return period - 保修期
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * 设置保修期
     *
     * @param period 保修期
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * 获取型号说明
     *
     * @return remark - 型号说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置型号说明
     *
     * @param remark 型号说明
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取产品名称
     *
     * @return product_name - 产品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置产品名称
     *
     * @param productName 产品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
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
}