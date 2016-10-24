package com.yihukurama.wechat.iecheck.sdk.wechat.common.service;

import com.yihukurama.wechat.iecheck.sdk.wechat.common.modle.AccessToken;
import com.yihukurama.wechat.iecheck.sdk.wechat.common.modle.CityMsgResult;
import com.yihukurama.wechat.iecheck.sdk.wechat.common.modle.JSApiTicket;
import com.yihukurama.wechat.iecheck.sdk.wechat.common.modle.JSSignature;

/**
 * 功能描述: 
 * @Author:dengshuai
 * @Date:2016年10月16日 上午12:31:25
 */
public interface WeChatService {
	
	 /**
	  * 功能描述:微信认证服务器
	  * @param token
	  * @param timestamp
	  * @param nonce
	  * @return
	  * @Author:dengshuai
	  * @Date:2016年10月16日 上午12:35:03
	  */
	 public  String check(String token, String timestamp, String nonce);
     
     /**
      * 功能描述:获取普通accessToken
      * @param appid
      * @param appsecret
      * @return
      * @Author:dengshuai
      * @Date:2016年10月11日 下午12:32:17
      */
     public AccessToken getAccessToken ();
     
     /**
      * 功能描述:获取JSApiTicket
      * @param accessToken
      * @return
      * @Author:dengshuai
      * @Date:2016年10月11日 下午12:43:44
      */
     public JSApiTicket getJSApiTicket();
     
     /**
      * 功能描述:获取jssdk权限签名
      * @param url
      * @param openid
      * @return
      * @Author:dengshuai
      * @Date:2016年10月11日 下午12:26:01
      */
     public JSSignature getJSSignature(String url);

	

	/**
	 * 功能描述:获取微信openid的token
	 * @param code
	 * @return
	 * @throws Exception
	 * @Author:dengshuai
	 * @Date:2016年10月16日 上午12:02:04
	 */
	public String getAuthToken(String code) throws Exception;

	/**
	 * 功能描述:
	 * @return
	 * @Author:dengshuai
	 * @Date:2016年10月24日 下午10:34:47
	 */
	public AccessToken getNewAccessToken();

	/**
	 * 功能描述:
	 * @param openId
	 * @return
	 * @Author:dengshuai
	 * @Date:2016年10月24日 下午10:34:57
	 */
	public CityMsgResult sendCityMsg(String openId);

	/**
	 * 功能描述:
	 * @param openId
	 * @return
	 * @Author:dengshuai
	 * @Date:2016年10月24日 下午10:35:07
	 */
	public String sendTemplateMsg(String openId);
}
