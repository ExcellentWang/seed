package com.company.restapi.model;

import javax.persistence.*;

@Table(name = "information_datatype")
public class InformationDatatype {
    /**
     * 资讯类型ID
     */
    @Id
    @Column(name = "information_type")
    private Integer informationType;

    /**
     * 资讯类型名称
     */
    @Column(name = "information_name")
    private String informationName;

    /**
     * 获取资讯类型ID
     *
     * @return information_type - 资讯类型ID
     */
    public Integer getInformationType() {
        return informationType;
    }

    /**
     * 设置资讯类型ID
     *
     * @param informationType 资讯类型ID
     */
    public void setInformationType(Integer informationType) {
        this.informationType = informationType;
    }

    /**
     * 获取资讯类型名称
     *
     * @return information_name - 资讯类型名称
     */
    public String getInformationName() {
        return informationName;
    }

    /**
     * 设置资讯类型名称
     *
     * @param informationName 资讯类型名称
     */
    public void setInformationName(String informationName) {
        this.informationName = informationName;
    }
}