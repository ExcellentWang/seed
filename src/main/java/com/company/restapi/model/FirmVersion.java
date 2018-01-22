package com.company.restapi.model;

import javax.persistence.*;

@Table(name = "firm_version")
public class FirmVersion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String product;

    private String type;

    private String version;

    @Column(name = "firm_url")
    private String firmUrl;

    private String remark;

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
     * @return product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return firm_url
     */
    public String getFirmUrl() {
        return firmUrl;
    }

    /**
     * @param firmUrl
     */
    public void setFirmUrl(String firmUrl) {
        this.firmUrl = firmUrl;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}