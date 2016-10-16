package com.yihukurama.wechat.iecheck.sdk.wechat.common.modle;

/**
 * Medio domain 微信图文消息 实体类
 * 
 * @author lilongjun
 * @date 2016-10-13 xx:xx:xx
 */
public class Medio {
	private String type;// 图文消息类型
	private String media_id;// 图文消息 ID
	private String created_at;// 创建时间

	/** getset() */
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMedia_id() {
		return media_id;
	}

	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

}
