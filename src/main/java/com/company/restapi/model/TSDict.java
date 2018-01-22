package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_s_dict")
public class TSDict {
    /**
     * 字典ID
     */
    @Id
    @Column(name = "dict_id")
    private Integer dictId;

    /**
     * 字典名称
     */
    @Column(name = "dict_name")
    private String dictName;

    /**
     * 字典描述
     */
    @Column(name = "dict_desc")
    private String dictDesc;

    /**
     * 1启用，2禁用
     */
    @Column(name = "dict_status")
    private Integer dictStatus;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取字典ID
     *
     * @return dict_id - 字典ID
     */
    public Integer getDictId() {
        return dictId;
    }

    /**
     * 设置字典ID
     *
     * @param dictId 字典ID
     */
    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    /**
     * 获取字典名称
     *
     * @return dict_name - 字典名称
     */
    public String getDictName() {
        return dictName;
    }

    /**
     * 设置字典名称
     *
     * @param dictName 字典名称
     */
    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    /**
     * 获取字典描述
     *
     * @return dict_desc - 字典描述
     */
    public String getDictDesc() {
        return dictDesc;
    }

    /**
     * 设置字典描述
     *
     * @param dictDesc 字典描述
     */
    public void setDictDesc(String dictDesc) {
        this.dictDesc = dictDesc;
    }

    /**
     * 获取1启用，2禁用
     *
     * @return dict_status - 1启用，2禁用
     */
    public Integer getDictStatus() {
        return dictStatus;
    }

    /**
     * 设置1启用，2禁用
     *
     * @param dictStatus 1启用，2禁用
     */
    public void setDictStatus(Integer dictStatus) {
        this.dictStatus = dictStatus;
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
}