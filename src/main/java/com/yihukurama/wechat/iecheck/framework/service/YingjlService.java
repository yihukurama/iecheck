package com.yihukurama.wechat.iecheck.framework.service;


import com.yihukurama.wechat.iecheck.framework.transfer.RequestDto;
import com.yihukurama.wechat.iecheck.framework.transfer.ResponseDto;
import com.yihukurama.wechat.iecheck.framework.transfer.model.Params;

/**
 * 功能描述: 英吉利业务接口
 * @Author:dengshuai
 * @Date:2016年10月15日 下午11:07:40
 */
public interface YingjlService {

	//微信扫码
	public ResponseDto scanQRCode(String openId,String qrcode);
	
	//微信发红包
	public ResponseDto sendLuckyMoney(Params params);
		
		
	//获取扫码记录接口
	public ResponseDto getScanHistory(RequestDto requestDto);
	//获取产品信息接口
	public ResponseDto getProductInfo(RequestDto request);
	
}
