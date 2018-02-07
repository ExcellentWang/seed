package com.company.restapi.model;

import java.util.List;

/**
 * com.company.restapi.model
 *
 * @author Wang
 * @create 2018-02-05 下午7:23
 * @description:
 **/
public class DeviceMsg {
    //设备编号
    private String deviceNum;
    //命令名称
    private String cmdTitle;
    //命令参数
    private List<String> cmdArgs;
    //返回状态Ok(成功)ER(失败)
    private String status;
    //校验信息OR代表没有校验
    private String checkMsg;

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<");
        stringBuffer.append(deviceNum)
                .append(":"+ cmdTitle);
        if (cmdArgs != null) {
            for (String cmdArg : cmdArgs) {
                stringBuffer.append(","+cmdArg);
            }
        }
        stringBuffer.append(","+status);
        stringBuffer.append(","+checkMsg);
    stringBuffer.append(">");
        return stringBuffer.toString();
    }

    public String getDeviceNum() {
        return deviceNum;
    }

    public DeviceMsg setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum;
        return this;
    }

    public String getCmdTitle() {
        return cmdTitle;
    }

    public DeviceMsg setCmdTitle(String cmdTitle) {
        this.cmdTitle = cmdTitle;
        return this;
    }

    public List<String> getCmdArgs() {
        return cmdArgs;
    }

    public DeviceMsg setCmdArgs(List<String> cmdArgs) {
        this.cmdArgs = cmdArgs;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public DeviceMsg setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getCheckMsg() {
        return checkMsg;
    }

    public DeviceMsg setCheckMsg(String checkMsg) {
        this.checkMsg = checkMsg;
        return this;
    }
}
