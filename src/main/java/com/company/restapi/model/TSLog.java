package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_s_log")
public class TSLog {
    @Id
    @Column(name = "log_id")
    private Integer logId;

    /**
     * 访问URL
     */
    @Column(name = "action_url")
    private String actionUrl;

    /**
     * 访问时间
     */
    @Column(name = "log_time")
    private Date logTime;

    /**
     * 用户IP
     */
    @Column(name = "user_ip")
    private String userIp;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 日志描述
     */
    @Column(name = "log_desc")
    private String logDesc;

    /**
     * 用户名称
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 操作响应时间
     */
    @Column(name = "process_time")
    private Integer processTime;

    /**
     * 控制器名称
     */
    @Column(name = "controller_name")
    private String controllerName;

    /**
     * 控制器方法名称
     */
    @Column(name = "controller_method")
    private String controllerMethod;

    /**
     * @return log_id
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * @param logId
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * 获取访问URL
     *
     * @return action_url - 访问URL
     */
    public String getActionUrl() {
        return actionUrl;
    }

    /**
     * 设置访问URL
     *
     * @param actionUrl 访问URL
     */
    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    /**
     * 获取访问时间
     *
     * @return log_time - 访问时间
     */
    public Date getLogTime() {
        return logTime;
    }

    /**
     * 设置访问时间
     *
     * @param logTime 访问时间
     */
    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    /**
     * 获取用户IP
     *
     * @return user_ip - 用户IP
     */
    public String getUserIp() {
        return userIp;
    }

    /**
     * 设置用户IP
     *
     * @param userIp 用户IP
     */
    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取日志描述
     *
     * @return log_desc - 日志描述
     */
    public String getLogDesc() {
        return logDesc;
    }

    /**
     * 设置日志描述
     *
     * @param logDesc 日志描述
     */
    public void setLogDesc(String logDesc) {
        this.logDesc = logDesc;
    }

    /**
     * 获取用户名称
     *
     * @return user_name - 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名称
     *
     * @param userName 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取操作响应时间
     *
     * @return process_time - 操作响应时间
     */
    public Integer getProcessTime() {
        return processTime;
    }

    /**
     * 设置操作响应时间
     *
     * @param processTime 操作响应时间
     */
    public void setProcessTime(Integer processTime) {
        this.processTime = processTime;
    }

    /**
     * 获取控制器名称
     *
     * @return controller_name - 控制器名称
     */
    public String getControllerName() {
        return controllerName;
    }

    /**
     * 设置控制器名称
     *
     * @param controllerName 控制器名称
     */
    public void setControllerName(String controllerName) {
        this.controllerName = controllerName;
    }

    /**
     * 获取控制器方法名称
     *
     * @return controller_method - 控制器方法名称
     */
    public String getControllerMethod() {
        return controllerMethod;
    }

    /**
     * 设置控制器方法名称
     *
     * @param controllerMethod 控制器方法名称
     */
    public void setControllerMethod(String controllerMethod) {
        this.controllerMethod = controllerMethod;
    }
}