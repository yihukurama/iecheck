package com.yihukurama.wechat.iecheck.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yihukurama.wechat.iecheck.common.Constant;
import com.yihukurama.wechat.iecheck.common.utils.HttpUtils;
import com.yihukurama.wechat.iecheck.common.utils.JsonUtil;
import com.yihukurama.wechat.iecheck.framework.domain.entity.mapper.ScanInfoMapper;
import com.yihukurama.wechat.iecheck.framework.service.YingjlService;
import com.yihukurama.wechat.iecheck.framework.transfer.RequestDto;
import com.yihukurama.wechat.iecheck.framework.transfer.ResponseDto;
import com.yihukurama.wechat.iecheck.framework.transfer.model.Params;
import com.yihukurama.wechat.iecheck.framework.transfer.model.YizhiRequest;

/**
 * 功能描述: 
 * @Author:dengshuai
 * @Date:2016年10月15日 下午11:19:54
 */
@Service
public class YingjlServiceImpl implements YingjlService {

	@Autowired
	ScanInfoMapper mapper;
	@Autowired
	HttpUtils httpUtils;
	
	@Override
	public ResponseDto scanQRCode(String openId,String qrcode) {
		
		YizhiRequest yizhiRequest = new YizhiRequest();
		yizhiRequest.setOper("query");
		yizhiRequest.setSqlid("9515");
		Params params = new Params();
		params.setCODE(qrcode);
		params.setCODE_TYPE("2xd");
		yizhiRequest.setParams(params);
		String requestBody = JsonUtil.toJson(yizhiRequest);
		String yizhiResponse = httpUtils.doPost(Constant.YIZHI_API, requestBody, "UTF-8");
		//3.返回展示的扫码页面地址
		ResponseDto responseDto = new ResponseDto();
		responseDto.setOK(Constant.YINJILI_HOME);
		responseDto.setData(yizhiResponse);
		
		return responseDto;
	}

	/* (non-Javadoc)
	 * @see com.yihukurama.wechat.iecheck.framework.service.YingjlService#getScanHistory(com.yihukurama.wechat.iecheck.framework.transfer.RequestDto)
	 */
	@Override
	public ResponseDto getScanHistory(RequestDto requestDto) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.yihukurama.wechat.iecheck.framework.service.YingjlService#getProductInfo(com.yihukurama.wechat.iecheck.framework.transfer.RequestDto)
	 */
	@Override
	public ResponseDto getProductInfo(RequestDto request) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.yihukurama.wechat.iecheck.framework.service.YingjlService#sendLuckyMoney(com.yihukurama.wechat.iecheck.framework.transfer.model.Params)
	 */
	@Override
	public ResponseDto sendLuckyMoney(Params params) {
		YizhiRequest yizhiRequest = new YizhiRequest();
		yizhiRequest.setOper("query");
		yizhiRequest.setSqlid("9520");
		
		params.setCODE_TYPE("2xd");
		yizhiRequest.setParams(params);
		String requestBody = JsonUtil.toJson(yizhiRequest);
		String yizhiResponse = httpUtils.doPost(Constant.YIZHI_API, requestBody, "UTF-8");
		//3.返回展示的扫码页面地址
		ResponseDto responseDto = new ResponseDto();
		responseDto.setOK(Constant.YINJILI_HOME);
		responseDto.setData(yizhiResponse);
		
		return responseDto;
	}

}
