package com.yihukurama.wechat.iecheck.sdk.wechat.common.modle;

/**
 * OpenBean
 * domain
 * 微信用户信息openID 实体类
 * @author lilongjun
 * @date 2016-10-13 xx:xx:xx
 */
public class OpenBean {
	
	    private String access_token ;//accessToken ID  
	    private String expires_in ; //凭证有效时间
	    private String refresh_token ;//刷新token
	    private String openid ;//用户微信身份ID openID
	    private String scope ;//应用授权作用域
	    
	    /** getset() */
		public String getAccess_token() {
			return access_token;
		}
		public void setAccess_token(String access_token) {
			this.access_token = access_token;
		}
		public String getExpires_in() {
			return expires_in;
		}
		public void setExpires_in(String expires_in) {
			this.expires_in = expires_in;
		}
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
