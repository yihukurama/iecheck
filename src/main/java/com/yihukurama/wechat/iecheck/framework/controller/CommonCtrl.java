package com.yihukurama.wechat.iecheck.framework.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yihukurama.wechat.iecheck.sdk.wechat.common.Constant;
import com.yihukurama.wechat.iecheck.sdk.wechat.common.service.WeChatService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 功能描述: 
 * @Author:dengshuai
 * @Date:2016年10月16日 下午11:07:33
 */
@Api
@RestController
@RequestMapping("/common")
public class CommonCtrl {
	private Logger logger = Logger.getLogger(CommonCtrl.class);
	
	@Autowired
	WeChatService weChatService;
	
	@ApiOperation(httpMethod = "GET", value = "微信服务器认证接口", notes = "微信服务器认证接口 \n\r")
	@RequestMapping("/wechat")
    String wetChatHome(
		@RequestParam(value="echostr", required=false, defaultValue="null") String echostr,
		@RequestParam(value="timestamp", required=false, defaultValue="null") String timestamp,
		@RequestParam(value="nonce", required=false, defaultValue="null") String nonce,
		@RequestParam(value="encrypt", required=false, defaultValue="null") String encrypt,
		@RequestParam(value="signature", required=false, defaultValue="null") String signature,
		@RequestBody(required=false)String requestBody) {
	String response = "Hello weixin!";
	
	if(echostr.equals("null")){//已认证通过，进入响应方法
		logger.info("微信服务器已认证通过，进入响应方法");
		
	}else{//基础认证
		logger.info("进行微信服务器认证");
		String checkResult = weChatService.check(Constant.TOKEN, timestamp, nonce);
		if(signature.equals(checkResult)){
			logger.info("微信服务器通过认证，按要求返回echostr");
			response = echostr;
		}
	}
        return response;
    }
}
