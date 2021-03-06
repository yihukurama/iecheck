package com.yihukurama.wechat.iecheck.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yihukurama.wechat.iecheck.framework.service.YingjlService;
import com.yihukurama.wechat.iecheck.framework.transfer.ResponseDto;
import com.yihukurama.wechat.iecheck.framework.transfer.model.Params;
import com.yihukurama.wechat.iecheck.sdk.wechat.common.Constant;
import com.yihukurama.wechat.iecheck.sdk.wechat.common.WeChatAPI;
import com.yihukurama.wechat.iecheck.sdk.wechat.common.service.WeChatService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 功能描述: 客户英吉利业务入口
 * @Author:dengshuai
 * @Date:2016年10月15日 下午10:00:57
 */
@Api(description="英吉利业务控制器")
@RestController
@RequestMapping("/Yingjl")
public class YingjlCtrl {

	@Autowired
	YingjlService yingjlService;
	
	@Autowired
	WeChatService weChatService;
	
	@ApiOperation(httpMethod="GET", value="微信扫码", notes="微信扫码2")
	@RequestMapping(value="/scanQRCode",method=RequestMethod.GET)
	public @ResponseBody ResponseDto scanQRCode(String openId,String qrcode){
		return yingjlService.scanQRCode(openId,qrcode);
	}
	
	@ApiOperation(httpMethod="GET", value="微信发红包", notes="微信扫码2")
	@RequestMapping(value="/sendLuckyMoney",method=RequestMethod.GET)
	public @ResponseBody ResponseDto sendLuckyMoney(Params params){
		return yingjlService.sendLuckyMoney(params);
	}

	@ApiOperation(httpMethod="GET", value="微信授权第一步",notes="英吉利二维码扫描入口")
	@RequestMapping("/authorization")
	public ModelAndView getAuthorization(String qrcode) throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.setViewName(String .format("redirect:"+WeChatAPI.authorization,Constant.host+"/Yingjl/openid"+"?qrcode="+qrcode,Constant.APPID));
		return mav;
	}
	
	@ApiOperation(httpMethod="GET", value="获取OpenId",notes="英吉利二维码扫描入口")
	@RequestMapping("/openid")
	public ModelAndView getOpenId(String code,String qrcode) throws Exception{
		String openid = weChatService.getAuthToken(code);
		String params = "?openid="+openid+"&type=1&qrcode="+qrcode;//type为1是爱查公众号的openid
		ModelAndView mav = new ModelAndView();
		mav.setViewName(String .format("redirect:"+Constant.REDIRECTURL+params));
		return mav;
	}
}
