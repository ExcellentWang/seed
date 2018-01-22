package com.company.restapi.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_feedback")
public class TbFeedback {
    /**
     * 意见id
     */
    @Id
    @Column(name = "feedback_id")
    private Integer feedbackId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 内容
     */
    private String content;

    /**
     * 获取意见id
     *
     * @return feedback_id - 意见id
     */
    public Integer getFeedbackId() {
        return feedbackId;
    }

    /**
     * 设置意见id
     *
     * @param feedbackId 意见id
     */
    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
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
}