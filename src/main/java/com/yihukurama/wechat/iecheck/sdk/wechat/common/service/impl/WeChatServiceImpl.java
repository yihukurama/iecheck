package com.yihukurama.wechat.iecheck.sdk.wechat.common.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yihukurama.wechat.iecheck.common.utils.HttpUtils;
import com.yihukurama.wechat.iecheck.common.utils.JsonUtil;
import com.yihukurama.wechat.iecheck.common.utils.SHA1;
import com.yihukurama.wechat.iecheck.sdk.wechat.common.Constant;
import com.yihukurama.wechat.iecheck.sdk.wechat.common.WeChatAPI;
import com.yihukurama.wechat.iecheck.sdk.wechat.common.modle.AccessToken;
import com.yihukurama.wechat.iecheck.sdk.wechat.common.modle.AuthToken;
import com.yihukurama.wechat.iecheck.sdk.wechat.common.modle.CityMsgResult;
import com.yihukurama.wechat.iecheck.sdk.wechat.common.modle.JSApiTicket;
import com.yihukurama.wechat.iecheck.sdk.wechat.common.modle.JSSignature;
import com.yihukurama.wechat.iecheck.sdk.wechat.common.service.WeChatService;




/**
 * 功能描述:微信通用工具类 
 * @Author:denghsuai
 * @Date:2016年9月22日 上午9:58:32
 */
@Service
public class WeChatServiceImpl implements WeChatService{
	
//	@Autowired
//	RedisUtils redisUtils;
	
	@Autowired
	HttpUtils httpUtils;
	 /**
	  * 功能描述:
	  * @param token
	  * @param timestamp
	  * @param nonce
	  * @return
	  * @Author:dengshuai
	  * @Date:2016年9月22日 上午9:59:45
	  */
     public  String check(String token, String timestamp, String nonce)
     {
             List<String> params = params = new ArrayList<String>();
             params.add(token);  
             params.add(timestamp);  
             params.add(nonce);  
             //1. 将token、timestamp、nonce三个参数进行字典序排序  
             Collections.sort(params, new Comparator<String>() {  
              
             public int compare(String o1, String o2) {  
                 return o1.compareTo(o2);  
             }  
         });   
             //2. 将三个参数字符串拼接成一个字符串进行sha1加密  
             String temp = SHA1.encode(params.get(0) + params.get(1) + params.get(2));  
             return temp;

     }
     
     /**
      * 功能描述:获取普通accessToken
      * @param appid
      * @param appsecret
      * @return
      * @Author:dengshuai
      * @Date:2016年10月11日 下午12:32:17
      */
     public AccessToken getAccessToken ()
     {
//    	AccessToken at = (AccessToken)redisUtils.get(Constant.REDISKEY_ACCESSTOKEN);
//    	if(at == null){
    		//token没有存在于缓存中
			//获取动态access_token
			String jsonAccessToken = httpUtils.doGet(String.format(WeChatAPI.accessToken,Constant.APPID ,Constant.APPSECRET));
			AccessToken	at = JsonUtil.toObject(jsonAccessToken, AccessToken.class);
//			redisUtils.set(Constant.REDISKEY_ACCESSTOKEN, at,7100L);
//    	}
    	return at;
     }
     
     /**
      * 功能描述:获取JSApiTicket
      * @param accessToken
      * @return
      * @Author:dengshuai
      * @Date:2016年10月11日 下午12:43:44
      */
     public JSApiTicket getJSApiTicket()
     {
//    	 JSApiTicket ticket =(JSApiTicket)redisUtils.get(Constant.REDISKEY_JSAPITICKEY);
 	    
// 		 if(ticket == null){
 			 AccessToken accessToken =getAccessToken();
// 			//获取ticket
  			String jsonJSApiTicket = httpUtils.doGet(String.format(WeChatAPI.jsapi_ticket, accessToken.getAccess_token()));
  			JSApiTicket ticket = JsonUtil.toObject(jsonJSApiTicket, JSApiTicket.class);
//  	    	redisUtils.set(Constant.REDISKEY_JSAPITICKEY, ticket,7100L);
//  	    	
// 		 }
 			
 		return ticket;
     }
     
     /**
      * 功能描述:获取jssdk权限签名
      * @param url
      * @param openid
      * @return
      * @Author:dengshuai
      * @Date:2016年10月11日 下午12:26:01
      */
     public JSSignature getJSSignature(String url)
     {
    	//数据准备
     	JSApiTicket jsapi_ticket = getJSApiTicket();//jsapi_ticket
     	String noncestr=random16();//16位16进制随机数
     	String timestamp= (System.currentTimeMillis()+"").substring(0, 10);//时间戳
     	
     	String targerStr = String.format(WeChatAPI.jssdk_signature,jsapi_ticket.getTicket(),noncestr,timestamp,url);;
     	String jssdk = SHA1.encode(targerStr);//jssdk
     	
     	JSSignature jsSignature = new JSSignature();
     	jsSignature.setSignature(jssdk);
     	jsSignature.setAppid(Constant.APPID);
     	jsSignature.setTimestamp(timestamp);
     	jsSignature.setNonceStr(noncestr);
     	jsSignature.setJsapi_ticket(jsapi_ticket.getTicket());
     	jsSignature.setToken(getAccessToken().getAccess_token());
     	jsSignature.setTargerStr(targerStr);
    	 return jsSignature;
     }

	/**
	 * 功能描述:生成16位随机数
	 * @return
	 * @Author:dengshuai
	 * @Date:2016年10月15日 下午10:43:00
	 */
	private String random16() {
		StringBuilder sb = new StringBuilder();
		StringBuilder sum = new StringBuilder();
		//0-9
		for(int i =0;i<10;i++){
			sum.append(i);
		}
		//A-Z
		for(int i =65;i<91;i++){
			sum.append((char)i);
		}
		//a-z
		for(int i =97;i<123;i++){
			sum.append((char)i);
		}
		
		for (int i = 0; i < 16; i++) {
			Integer random =(int)(Math.random()*61);
			sb.append(sum.charAt(random));
		}
		return sb.toString();
	}

	/**
	 * 功能描述:获取微信openid的token
	 * @param code
	 * @return
	 * @throws Exception
	 * @Author:dengshuai
	 * @Date:2016年10月16日 上午12:02:04
	 */
	public String getAuthToken(String code) throws Exception {
		//通过code 获取授权access_token
		String jsonAuthToken = httpUtils.doGet(String.format(WeChatAPI.openid, Constant.APPID,Constant.APPSECRET,code));
		//json-->bean 数据解释
		AuthToken authToken = JsonUtil.toObject(jsonAuthToken, AuthToken.class);
		return authToken.getOpenid();
	}

	@Override
	public AccessToken getNewAccessToken() {
		AccessToken at = null;
		HttpUtils hu = new HttpUtils();
		String jsonAccessToken = hu.doGet(String.format("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s",Constant.APPID ,Constant.APPSECRET));
		at = JsonUtil.toObject(jsonAccessToken, AccessToken.class);
		
		return at;
	}

	/* (non-Javadoc)
	 * @see com.yihukurama.wechat.iecheck.sdk.wechat.common.service.WeChatService#sendCityMsg(java.lang.String)
	 */
	@Override
	public CityMsgResult sendCityMsg(String openId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.yihukurama.wechat.iecheck.sdk.wechat.common.service.WeChatService#sendTemplateMsg(java.lang.String)
	 */
	@Override
	public String sendTemplateMsg(String openId) {
		// TODO Auto-generated method stub
		return null;
	}
  
}
