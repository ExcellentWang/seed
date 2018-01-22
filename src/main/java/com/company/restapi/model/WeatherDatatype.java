package com.company.restapi.model;

import javax.persistence.*;

@Table(name = "weather_datatype")
public class WeatherDatatype {
    /**
     * 天气类型编号
     */
    @Id
    @Column(name = "weatherType")
    private Integer weathertype;

    /**
     * 天气名称
     */
    @Column(name = "weatherName")
    private String weathername;

    /**
     * 获取天气类型编号
     *
     * @return weatherType - 天气类型编号
     */
    public Integer getWeathertype() {
        return weathertype;
    }

    /**
     * 设置天气类型编号
     *
     * @param weathertype 天气类型编号
     */
    public void setWeathertype(Integer weathertype) {
        this.weathertype = weathertype;
    }

    /**
     * 获取天气名称
     *
     * @return weatherName - 天气名称
     */
    public String getWeathername() {
        return weathername;
    }

    /**
     * 设置天气名称
     *
     * @param weathername 天气名称
     */
    public void setWeathername(String weathername) {
        this.weathername = weathername;
    }
}