package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_commonproblem")
public class TbCommonproblem {
    /**
     * 常见问题ID
     */
    @Id
    @Column(name = "commonProblem_id")
    private Integer commonproblemId;

    /**
     * 标题
     */
    private String tittle;

    /**
     * 内容
     */
    private String content;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 获取常见问题ID
     *
     * @return commonProblem_id - 常见问题ID
     */
    public Integer getCommonproblemId() {
        return commonproblemId;
    }

    /**
     * 设置常见问题ID
     *
     * @param commonproblemId 常见问题ID
     */
    public void setCommonproblemId(Integer commonproblemId) {
        this.commonproblemId = commonproblemId;
    }

    /**
     * 获取标题
     *
     * @return tittle - 标题
     */
    public String getTittle() {
        return tittle;
    }

    /**
     * 设置标题
     *
     * @param tittle 标题
     */
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取创建时间
     *
     * @return createTime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}