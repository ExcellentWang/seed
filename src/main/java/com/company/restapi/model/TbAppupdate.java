package com.company.restapi.model;

import javax.persistence.*;

@Table(name = "tb_appupdate")
public class TbAppupdate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "latestVersion")
    private Integer latestversion;

    @Column(name = "apkUrl")
    private String apkurl;

    @Column(name = "apkRemark")
    private String apkremark;

    @Column(name = "isForceUpdate")
    private Boolean isforceupdate;

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
     * @return latestVersion
     */
    public Integer getLatestversion() {
        return latestversion;
    }

    /**
     * @param latestversion
     */
    public void setLatestversion(Integer latestversion) {
        this.latestversion = latestversion;
    }

    /**
     * @return apkUrl
     */
    public String getApkurl() {
        return apkurl;
    }

    /**
     * @param apkurl
     */
    public void setApkurl(String apkurl) {
        this.apkurl = apkurl;
    }

    /**
     * @return apkRemark
     */
    public String getApkremark() {
        return apkremark;
    }

    /**
     * @param apkremark
     */
    public void setApkremark(String apkremark) {
        this.apkremark = apkremark;
    }

    /**
     * @return isForceUpdate
     */
    public Boolean getIsforceupdate() {
        return isforceupdate;
    }

    /**
     * @param isforceupdate
     */
    public void setIsforceupdate(Boolean isforceupdate) {
        this.isforceupdate = isforceupdate;
    }
}