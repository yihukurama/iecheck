package com.yihukurama.wechat.iecheck.sdk.wechat.common.exception;

/**
 * 功能描述: 微信API异常类
 * @Author:dengshuai
 * @Date:2016年10月15日 下午10:22:26
 */
public class BaseWeChatException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;

	public BaseWeChatException(String msg)  
    {  
        super(msg);  
    }  
}
