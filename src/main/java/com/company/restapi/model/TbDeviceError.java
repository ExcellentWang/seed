package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_device_error")
public class TbDeviceError {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "equipment_id")
    private Integer equipmentId;

    @Column(name = "water_tank")
    private Integer waterTank;

    @Column(name = "cold_water_in")
    private Integer coldWaterIn;

    @Column(name = "hot_water_in")
    private Integer hotWaterIn;

    @Column(name = "mixer_temp")
    private Integer mixerTemp;

    @Column(name = "mixer_comm")
    private Integer mixerComm;

    @Column(name = "buffer_in")
    private Integer bufferIn;

    @Column(name = "water_out")
    private Integer waterOut;

    @Column(name = "ac_power")
    private Integer acPower;

    @Column(name = "battery_volt")
    private Integer batteryVolt;

    @Column(name = "battery_temp")
    private Integer batteryTemp;

    @Column(name = "updated_at")
    private Date updatedAt;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return equipment_id
     */
    public Integer getEquipmentId() {
        return equipmentId;
    }

    /**
     * @param equipmentId
     */
    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    /**
     * @return water_tank
     */
    public Integer getWaterTank() {
        return waterTank;
    }

    /**
     * @param waterTank
     */
    public void setWaterTank(Integer waterTank) {
        this.waterTank = waterTank;
    }

    /**
     * @return cold_water_in
     */
    public Integer getColdWaterIn() {
        return coldWaterIn;
    }

    /**
     * @param coldWaterIn
     */
    public void setColdWaterIn(Integer coldWaterIn) {
        this.coldWaterIn = coldWaterIn;
    }

    /**
     * @return hot_water_in
     */
    public Integer getHotWaterIn() {
        return hotWaterIn;
    }

    /**
     * @param hotWaterIn
     */
    public void setHotWaterIn(Integer hotWaterIn) {
        this.hotWaterIn = hotWaterIn;
    }

    /**
     * @return mixer_temp
     */
    public Integer getMixerTemp() {
        return mixerTemp;
    }

    /**
     * @param mixerTemp
     */
    public void setMixerTemp(Integer mixerTemp) {
        this.mixerTemp = mixerTemp;
    }

    /**
     * @return mixer_comm
     */
    public Integer getMixerComm() {
        return mixerComm;
    }

    /**
     * @param mixerComm
     */
    public void setMixerComm(Integer mixerComm) {
        this.mixerComm = mixerComm;
    }

    /**
     * @return buffer_in
     */
    public Integer getBufferIn() {
        return bufferIn;
    }

    /**
     * @param bufferIn
     */
    public void setBufferIn(Integer bufferIn) {
        this.bufferIn = bufferIn;
    }

    /**
     * @return water_out
     */
    public Integer getWaterOut() {
        return waterOut;
    }

    /**
     * @param waterOut
     */
    public void setWaterOut(Integer waterOut) {
        this.waterOut = waterOut;
    }

    /**
     * @return ac_power
     */
    public Integer getAcPower() {
        return acPower;
    }

    /**
     * @param acPower
     */
    public void setAcPower(Integer acPower) {
        this.acPower = acPower;
    }

    /**
     * @return battery_volt
     */
    public Integer getBatteryVolt() {
        return batteryVolt;
    }

    /**
     * @param batteryVolt
     */
    public void setBatteryVolt(Integer batteryVolt) {
        this.batteryVolt = batteryVolt;
    }

    /**
     * @return battery_temp
     */
    public Integer getBatteryTemp() {
        return batteryTemp;
    }

    /**
     * @param batteryTemp
     */
    public void setBatteryTemp(Integer batteryTemp) {
        this.batteryTemp = batteryTemp;
    }

    /**
     * @return updated_at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}