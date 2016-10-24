package com.yihukurama.wechat.iecheck.sdk.wechat.common.modle;

/**
 * JSSignature
 * domain
 * 微信授权签名 实体类
 * @author lilongjun
 * @date 2016-10-13 xx:xx:xx
 */
public class JSSignature {
	private String appid;//来自accessToken
	private String timestamp;//时间戳
	private String nonceStr;//随机字符串
	private String signature;//微信授权签名 签名ID
	private String jsapi_ticket;//票据
	private String targerStr;
	private String token;
	
	public String getTargerStr() {
		return targerStr;
	}
	public void setTargerStr(String targerStr) {
		this.targerStr = targerStr;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	/** getset() */
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getNonceStr() {
		return nonceStr;
	}
	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getJsapi_ticket() {
		return jsapi_ticket;
	}
	public void setJsapi_ticket(String jsapi_ticket) {
		this.jsapi_ticket = jsapi_ticket;
	}
	
	
	
}