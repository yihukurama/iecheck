package com.yihukurama.wechat.iecheck.framework.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yihukurama.wechat.iecheck.common.Constant;
import com.yihukurama.wechat.iecheck.common.utils.HttpUtils;
import com.yihukurama.wechat.iecheck.common.utils.JsonUtil;
import com.yihukurama.wechat.iecheck.framework.domain.entity.mapper.ScanInfoMapper;
import com.yihukurama.wechat.iecheck.framework.service.YingjlService;
import com.yihukurama.wechat.iecheck.framework.transfer.RequestDto;
import com.yihukurama.wechat.iecheck.framework.transfer.ResponseDto;
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
	public ResponseDto scanQRCode(RequestDto requestDto) {
		//1.调用后台扫码接口，此处应拿到openid和二维码值
		String openid ="";
		String qrcode ="";
		List<Object> dataList = requestDto.getData();
		if(dataList.size()!=0){
			openid = (String)dataList.get(0);
			qrcode = (String)dataList.get(2);
		}
		
		YizhiRequest yizhiRequest = new YizhiRequest();
		yizhiRequest.setOper("query");
		yizhiRequest.setSqlid("9515");
		List params = new ArrayList();
		Map<String,String> map = new HashMap();
		map.put("CODE_TYPE", "x2d");
		map.put("CODE", qrcode);
		params.add(map);
		yizhiRequest.setParams(params);
		String requestBody = JsonUtil.toJson(yizhiRequest);
		String yizhiResponse = httpUtils.doPost(Constant.YIZHI_API, requestBody, "UTF-8");
		//3.返回展示的扫码页面地址
		ResponseDto responseDto = new ResponseDto();
		responseDto.setOK(Constant.YINJILI_HOME);
		
		
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

}
