package com.yihukurama.wechat.iecheck.sdk.wechat.common.modle;

/**
 * JSApiTicket domain 微信授权票据 实体类
 * 
 * @author lilongjun
 * @date 2016-10-13 xx:xx:xx
 */
public class JSApiTicket extends BaseResponseModel {
	private String ticket;// 微信授权票据 ID
	private String expires_in;// 凭证有效时间

	/** getset() */
	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}

}
