package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "device_offline_info")
public class DeviceOfflineInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 设备id
     */
    @Column(name = "device_id")
    private Integer deviceId;

    /**
     * 设备类型
     */
    @Column(name = "device_type")
    private String deviceType;

    /**
     * 命令
     */
    private String command;

    /**
     * 参数
     */
    private String args;

    /**
     * 原始数据
     */
    private String raw;

    @Column(name = "created_at")
    private Date createdAt;

    private String ip;

    private Integer port;

    private String direction;

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
     * 获取设备id
     *
     * @return device_id - 设备id
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    /**
     * 设置设备id
     *
     * @param deviceId 设备id
     */
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 获取设备类型
     *
     * @return device_type - 设备类型
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * 设置设备类型
     *
     * @param deviceType 设备类型
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * 获取命令
     *
     * @return command - 命令
     */
    public String getCommand() {
        return command;
    }

    /**
     * 设置命令
     *
     * @param command 命令
     */
    public void setCommand(String command) {
        this.command = command;
    }

    /**
     * 获取参数
     *
     * @return args - 参数
     */
    public String getArgs() {
        return args;
    }

    /**
     * 设置参数
     *
     * @param args 参数
     */
    public void setArgs(String args) {
        this.args = args;
    }

    /**
     * 获取原始数据
     *
     * @return raw - 原始数据
     */
    public String getRaw() {
        return raw;
    }

    /**
     * 设置原始数据
     *
     * @param raw 原始数据
     */
    public void setRaw(String raw) {
        this.raw = raw;
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
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    /**
     * @param port
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }
}