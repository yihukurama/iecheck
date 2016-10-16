package com.yihukurama.wechat.iecheck.framework.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yihukurama.wechat.iecheck.framework.domain.entity.ScanInfo;
import com.yihukurama.wechat.iecheck.framework.domain.entity.mapper.ScanInfoMapper;
import com.yihukurama.wechat.iecheck.framework.service.YingjlService;
import com.yihukurama.wechat.iecheck.framework.transfer.RequestDto;
import com.yihukurama.wechat.iecheck.framework.transfer.ResponseDto;

/**
 * 功能描述: 
 * @Author:dengshuai
 * @Date:2016年10月15日 下午11:19:54
 */
@Service
public class YingjlServiceImpl implements YingjlService {

	@Autowired
	ScanInfoMapper mapper;
	/* (non-Javadoc)
	 * @see com.yihukurama.wechat.iecheck.framework.service.YingjlService#scanQRCode(com.yihukurama.wechat.iecheck.framework.transfer.RequestDto)
	 */
	@Override
	public ResponseDto scanQRCode(RequestDto requestDto) {
		//1.调用后台扫码接口
		List<Object> dataList = requestDto.getData();
		for (Object object : dataList) {
			
		}
		ScanInfo record = new ScanInfo();
		
		//2.把扫码记录存入数据库
		mapper.insert(record);
		//3.返回扫码页面地址
		return null;
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
