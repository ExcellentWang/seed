package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_applog")
public class TbApplog {
    /**
     * 操作日志ID
     */
    @Id
    @Column(name = "appLog_id")
    private Integer applogId;

    /**
     * 操作日期
     */
    @Column(name = "operationTime")
    private Date operationtime;

    /**
     * 操作描述
     */
    @Column(name = "operationDescribe")
    private String operationdescribe;

    /**
     * 操作用户id
     */
    @Column(name = "operationUser_id")
    private String operationuserId;

    /**
     * 获取操作日志ID
     *
     * @return appLog_id - 操作日志ID
     */
    public Integer getApplogId() {
        return applogId;
    }

    /**
     * 设置操作日志ID
     *
     * @param applogId 操作日志ID
     */
    public void setApplogId(Integer applogId) {
        this.applogId = applogId;
    }

    /**
     * 获取操作日期
     *
     * @return operationTime - 操作日期
     */
    public Date getOperationtime() {
        return operationtime;
    }

    /**
     * 设置操作日期
     *
     * @param operationtime 操作日期
     */
    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }

    /**
     * 获取操作描述
     *
     * @return operationDescribe - 操作描述
     */
    public String getOperationdescribe() {
        return operationdescribe;
    }

    /**
     * 设置操作描述
     *
     * @param operationdescribe 操作描述
     */
    public void setOperationdescribe(String operationdescribe) {
        this.operationdescribe = operationdescribe;
    }

    /**
     * 获取操作用户id
     *
     * @return operationUser_id - 操作用户id
     */
    public String getOperationuserId() {
        return operationuserId;
    }

    /**
     * 设置操作用户id
     *
     * @param operationuserId 操作用户id
     */
    public void setOperationuserId(String operationuserId) {
        this.operationuserId = operationuserId;
    }
}