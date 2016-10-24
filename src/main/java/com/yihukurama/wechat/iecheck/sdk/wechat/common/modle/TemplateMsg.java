package com.yihukurama.wechat.iecheck.sdk.wechat.common.modle;

import com.yihukurama.wechat.iecheck.sdk.wechat.common.modle.citymsg.KeyNote;

public class TemplateMsg {
	private String touser;
	private String template_id;
	private String url;
	private KeyNote data;
	
	public String getTouser() {
		return touser;
	}
	public void setTouser(String touser) {
		this.touser = touser;
	}
	public String getTemplate_id() {
		return template_id;
	}
	public void setTemplate_id(String template_id) {
		this.template_id = template_id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public KeyNote getData() {
		return data;
	}
	public void setData(KeyNote data) {
		this.data = data;
	}
	
	
    
}
