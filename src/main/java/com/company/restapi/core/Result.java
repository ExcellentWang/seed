package com.company.restapi.core;

import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * 统一API响应结果封装
 */
public class Result {
    private int code;
    private String message;
    private Object resultMap;
    public void setCode(int code) {
        this.code = code;
    }

    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code();
        return this;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getResultMap() {
        return resultMap;
    }

    public Result setResultMap(Object resultMap) {
        this.resultMap = resultMap;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
