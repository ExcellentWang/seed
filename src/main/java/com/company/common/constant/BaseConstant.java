package com.company.common.constant;

public class BaseConstant {
	//返回前端状态
	public static final int appUserSuccessStatus = 0;     //成功
	public static final int appUserFaileStatus = 1;       //失败
	public static final int appUserErrorStatus = 2;       //系统出错
	public static final String selectErrorMsg = "数据查询错误...";       //系统出错
	public static final String insertErrorMsg = "数据插入或更新错误...";       //系统出错
	public static final String controllerErrorMsg = "服务器维护中...";       //系统出错

	
	//app端 消息类型
	public static final int newsInformation = 1;   //资讯消息
	public static final int systemInformation = 2;  //系统消息
	public static final int deviceInformation = 3;  //设备消息
	public static final int waterInformation = 4;  //节水量通知
	
	
	
}
