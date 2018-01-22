package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_s_detail")
public class TSDetail {
    /**
     * 明细ID
     */
    @Id
    @Column(name = "detail_id")
    private Integer detailId;

    /**
     * 对应字典ID
     */
    @Column(name = "dict_id")
    private Integer dictId;

    /**
     * 明细名称
     */
    @Column(name = "detail_name")
    private String detailName;

    /**
     * 明细值
     */
    @Column(name = "detail_value")
    private String detailValue;

    /**
     * 明细描述
     */
    @Column(name = "detail_desc")
    private String detailDesc;

    /**
     * 1启用，2禁用
     */
    @Column(name = "detail_status")
    private Integer detailStatus;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取明细ID
     *
     * @return detail_id - 明细ID
     */
    public Integer getDetailId() {
        return detailId;
    }

    /**
     * 设置明细ID
     *
     * @param detailId 明细ID
     */
    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    /**
     * 获取对应字典ID
     *
     * @return dict_id - 对应字典ID
     */
    public Integer getDictId() {
        return dictId;
    }

    /**
     * 设置对应字典ID
     *
     * @param dictId 对应字典ID
     */
    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    /**
     * 获取明细名称
     *
     * @return detail_name - 明细名称
     */
    public String getDetailName() {
        return detailName;
    }

    /**
     * 设置明细名称
     *
     * @param detailName 明细名称
     */
    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    /**
     * 获取明细值
     *
     * @return detail_value - 明细值
     */
    public String getDetailValue() {
        return detailValue;
    }

    /**
     * 设置明细值
     *
     * @param detailValue 明细值
     */
    public void setDetailValue(String detailValue) {
        this.detailValue = detailValue;
    }

    /**
     * 获取明细描述
     *
     * @return detail_desc - 明细描述
     */
    public String getDetailDesc() {
        return detailDesc;
    }

    /**
     * 设置明细描述
     *
     * @param detailDesc 明细描述
     */
    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    /**
     * 获取1启用，2禁用
     *
     * @return detail_status - 1启用，2禁用
     */
    public Integer getDetailStatus() {
        return detailStatus;
    }

    /**
     * 设置1启用，2禁用
     *
     * @param detailStatus 1启用，2禁用
     */
    public void setDetailStatus(Integer detailStatus) {
        this.detailStatus = detailStatus;
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