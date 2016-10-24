package com.yihukurama.wechat.iecheck.sdk.wechat.common.modle.citymsg;

/**
 * 功能描述: 
 * @Author:denghsuai
 * @Date:2016年10月21日 下午6:17:09
 */
public class TempMsgBase {
	private String value;
	private String color;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public TempMsgBase(){
		
	}
	public TempMsgBase(String value, String color) {
		super();
		this.value = value;
		this.color = color;
	}
	
	
}
