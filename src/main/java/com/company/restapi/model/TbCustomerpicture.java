package com.company.restapi.model;

import javax.persistence.*;

@Table(name = "tb_customerpicture")
public class TbCustomerpicture {
    /**
     * 图片主键
     */
    @Id
    @Column(name = "customerPicture_id")
    private Integer customerpictureId;

    /**
     * 保修ID
     */
    @Column(name = "customer_id")
    private Integer customerId;

    /**
     * 图片地址
     */
    @Column(name = "pictureAddress")
    private String pictureaddress;

    /**
     * 获取图片主键
     *
     * @return customerPicture_id - 图片主键
     */
    public Integer getCustomerpictureId() {
        return customerpictureId;
    }

    /**
     * 设置图片主键
     *
     * @param customerpictureId 图片主键
     */
    public void setCustomerpictureId(Integer customerpictureId) {
        this.customerpictureId = customerpictureId;
    }

    /**
     * 获取保修ID
     *
     * @return customer_id - 保修ID
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * 设置保修ID
     *
     * @param customerId 保修ID
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取图片地址
     *
     * @return pictureAddress - 图片地址
     */
    public String getPictureaddress() {
        return pictureaddress;
    }

    /**
     * 设置图片地址
     *
     * @param pictureaddress 图片地址
     */
    public void setPictureaddress(String pictureaddress) {
        this.pictureaddress = pictureaddress;
    }
}