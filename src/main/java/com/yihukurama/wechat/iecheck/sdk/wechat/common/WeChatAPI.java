package com.yihukurama.wechat.iecheck.sdk.wechat.common;

/**
 * 功能描述: 
 * @Author:dengshuai
 * @Date:2016年10月15日 下午10:10:38
 */
public interface WeChatAPI {
	//微信授权
	public static String authorization = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=%s&redirect_uri=%s&response_type=code&scope=snsapi_userinfo#wechat_redirect";
	//获取微信openid
	public static String openid = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=%s&code=%s&grant_type=authorization_code";
	
	//普通accessToken
	public static String accessToken = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s";
	//微信授权专用accessToken
	public static String au_Token = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=%s&code=%s&grant_type=authorization_code";
	//jsapi ticket
	public static String jsapi_ticket = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=%s&type=jsapi";
	//jssdk 签名串
	public static String jssdk_signature = "jsapi_ticket=%s&noncestr=%s&timestamp=%s&url=%s";
}
