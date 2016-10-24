package com.yihukurama.wechat.iecheck.sdk.wechat.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yihukurama.wechat.iecheck.sdk.wechat.common.modle.AccessToken;
import com.yihukurama.wechat.iecheck.sdk.wechat.common.modle.CityMsgResult;
import com.yihukurama.wechat.iecheck.sdk.wechat.common.service.WeChatService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(description = "微信基础功能")
@RestController
@RequestMapping("/wechat")
public class WeChatController {

	@Autowired
	WeChatService weChatService;
	
	@ApiOperation(httpMethod="GET", value="获取微信Token",notes="获取微信Token")
	@RequestMapping(value="/access_token", method=RequestMethod.GET)
	public AccessToken getAccessToken(){
		System.out.println("调用微信");
		return weChatService.getAccessToken();
		
	}
	
	@ApiOperation(httpMethod="GET", value="获取最新微信Token",notes="获取微信Token存入缓存")
	@RequestMapping(value="/newaccess_token", method=RequestMethod.GET)
	public AccessToken getNewAccessToken(){
		System.out.println("调用微信");
		return weChatService.getNewAccessToken();
		
	}
	
	@ApiOperation(httpMethod="GET", value="发送城市服务消息",notes="发送城市服务消息")
	@RequestMapping(value="/send_citymsg", method=RequestMethod.GET)
	@ApiImplicitParams(value={
			@ApiImplicitParam(name="openId", value="openId", dataType="string", paramType="query", required=true),
		})
	public CityMsgResult sendCityMsg(@RequestParam(value="openId", required=true) String openId){
		
		return weChatService.sendCityMsg(openId);
		
	}
	
	@ApiOperation(httpMethod="GET", value="测试发送模板消息",notes="")
	@RequestMapping(value="/send_templatemsg", method=RequestMethod.GET)
	@ApiImplicitParams(value={
			@ApiImplicitParam(name="openId", value="openId", dataType="string", paramType="query", required=true),
		})
	public String sendTemplateMsg(@RequestParam(value="openId", required=true) String openId){
		
		return weChatService.sendTemplateMsg(openId);
		
	}
	
}
