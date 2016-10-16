/**
 * 功能描述: 
 * @Author:Administrator
 * @Date:2016年10月4日 下午1:59:25
 */
package com.yihukurama.wechat.iecheck.framework.transfer;


/**
 * 功能描述: 
 * @param <T>
 * @Author:dengshuai
 * @Date:2016年10月4日 下午1:59:25
 */
public class ResponseDto {
	private String errcode = ErrorCode.ERRORCODE_1000;
	private String message;
	private Object data;
	
	/**
	 * 功能描述:设置接口操作成功默认值
	 * @param data  需要返回的数据
	 * @return
	 * @Author:dengshuai
	 * @Date:2016年10月13日 上午12:26:47
	 */
	public ResponseDto setOK(Object data){
		this.errcode = ErrorCode.ERRORCODE_OK;
		this.message = ErrorCode.MES_OK;
		this.data = data;
		return this;
	}
	
	
	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}


	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}


	/**
	 * @return the errcode
	 */
	public String getErrcode() {
		return errcode;
	}

	/**
	 * @param errcode the errcode to set
	 */
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	
	
}
