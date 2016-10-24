package com.yihukurama.wechat.iecheck.framework.transfer.model;

import java.io.Serializable;
import java.util.List;

/**
 * 功能描述: 易智接口返回类封装
 * @Author:dengshuai
 * @Date:2016年10月17日 下午11:09:42
 */
public class YizhiResponse implements Serializable{
	private static final long serialVersionUID = 1L;
	private String outresult;
	private String outdesc;
	private List<Object> outdata;
	/**
	 * @return the outresult
	 */
	public String getOutresult() {
		return outresult;
	}
	/**
	 * @param outresult the outresult to set
	 */
	public void setOutresult(String outresult) {
		this.outresult = outresult;
	}
	/**
	 * @return the outdesc
	 */
	public String getOutdesc() {
		return outdesc;
	}
	/**
	 * @param outdesc the outdesc to set
	 */
	public void setOutdesc(String outdesc) {
		this.outdesc = outdesc;
	}
	/**
	 * @return the outdata
	 */
	public List<Object> getOutdata() {
		return outdata;
	}
	/**
	 * @param outdata the outdata to set
	 */
	public void setOutdata(List<Object> outdata) {
		this.outdata = outdata;
	}
	
}
