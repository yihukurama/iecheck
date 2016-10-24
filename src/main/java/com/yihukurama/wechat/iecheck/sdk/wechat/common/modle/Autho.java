package com.yihukurama.wechat.iecheck.sdk.wechat.common.modle;

/**
 * 功能描述:微信授权之后的返回封装 
 * @Author:denghsuai
 * @Date:2016年10月11日 下午4:43:03
 */
public class Autho extends AccessToken{

	String refresh_token;
	String openid;
	String scope;
	public String getRefresh_token() {
		return refresh_token;
	}
	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	
	
}
