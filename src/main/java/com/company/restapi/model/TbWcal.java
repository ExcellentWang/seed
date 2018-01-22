package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_wcal")
public class TbWcal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 热水偏差  取值范围：-5.0---5.0
     */
    @Column(name = "hot_water_de")
    private String hotWaterDe;

    /**
     * 冷水偏差  取值范围：-5.0---5.0
     */
    @Column(name = "code_water_de")
    private String codeWaterDe;

    /**
     * 出水偏差  取值范围：-5.0---5.0
     */
    @Column(name = "c_water_de")
    private String cWaterDe;

    /**
     * 混水偏差    取值范围：-5.0---5.0
     */
    @Column(name = "h_water_de")
    private String hWaterDe;

    /**
     * 混水阀
     */
    @Column(name = "mixing_valve")
    private String mixingValve;

    /**
     * 流量系数
     */
    @Column(name = "discharge_coefficient")
    private String dischargeCoefficient;

    /**
     * 温度B值
     */
    @Column(name = "temperature_b_value")
    private String temperatureBValue;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 设备编号
     */
    @Column(name = "device_no")
    private String deviceNo;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取热水偏差  取值范围：-5.0---5.0
     *
     * @return hot_water_de - 热水偏差  取值范围：-5.0---5.0
     */
    public String getHotWaterDe() {
        return hotWaterDe;
    }

    /**
     * 设置热水偏差  取值范围：-5.0---5.0
     *
     * @param hotWaterDe 热水偏差  取值范围：-5.0---5.0
     */
    public void setHotWaterDe(String hotWaterDe) {
        this.hotWaterDe = hotWaterDe;
    }

    /**
     * 获取冷水偏差  取值范围：-5.0---5.0
     *
     * @return code_water_de - 冷水偏差  取值范围：-5.0---5.0
     */
    public String getCodeWaterDe() {
        return codeWaterDe;
    }

    /**
     * 设置冷水偏差  取值范围：-5.0---5.0
     *
     * @param codeWaterDe 冷水偏差  取值范围：-5.0---5.0
     */
    public void setCodeWaterDe(String codeWaterDe) {
        this.codeWaterDe = codeWaterDe;
    }

    /**
     * 获取出水偏差  取值范围：-5.0---5.0
     *
     * @return c_water_de - 出水偏差  取值范围：-5.0---5.0
     */
    public String getcWaterDe() {
        return cWaterDe;
    }

    /**
     * 设置出水偏差  取值范围：-5.0---5.0
     *
     * @param cWaterDe 出水偏差  取值范围：-5.0---5.0
     */
    public void setcWaterDe(String cWaterDe) {
        this.cWaterDe = cWaterDe;
    }

    /**
     * 获取混水偏差    取值范围：-5.0---5.0
     *
     * @return h_water_de - 混水偏差    取值范围：-5.0---5.0
     */
    public String gethWaterDe() {
        return hWaterDe;
    }

    /**
     * 设置混水偏差    取值范围：-5.0---5.0
     *
     * @param hWaterDe 混水偏差    取值范围：-5.0---5.0
     */
    public void sethWaterDe(String hWaterDe) {
        this.hWaterDe = hWaterDe;
    }

    /**
     * 获取混水阀
     *
     * @return mixing_valve - 混水阀
     */
    public String getMixingValve() {
        return mixingValve;
    }

    /**
     * 设置混水阀
     *
     * @param mixingValve 混水阀
     */
    public void setMixingValve(String mixingValve) {
        this.mixingValve = mixingValve;
    }

    /**
     * 获取流量系数
     *
     * @return discharge_coefficient - 流量系数
     */
    public String getDischargeCoefficient() {
        return dischargeCoefficient;
    }

    /**
     * 设置流量系数
     *
     * @param dischargeCoefficient 流量系数
     */
    public void setDischargeCoefficient(String dischargeCoefficient) {
        this.dischargeCoefficient = dischargeCoefficient;
    }

    /**
     * 获取温度B值
     *
     * @return temperature_b_value - 温度B值
     */
    public String getTemperatureBValue() {
        return temperatureBValue;
    }

    /**
     * 设置温度B值
     *
     * @param temperatureBValue 温度B值
     */
    public void setTemperatureBValue(String temperatureBValue) {
        this.temperatureBValue = temperatureBValue;
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
     * 获取设备编号
     *
     * @return device_no - 设备编号
     */
    public String getDeviceNo() {
        return deviceNo;
    }

    /**
     * 设置设备编号
     *
     * @param deviceNo 设备编号
     */
    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }
}