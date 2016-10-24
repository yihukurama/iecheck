package com.yihukurama.wechat.iecheck.framework.transfer.model;

import java.io.Serializable;
import java.util.List;

/**
 * 功能描述: 易智接口请求类封装
 * @Author:dengshuai
 * @Date:2016年10月17日 下午11:04:06
 */
public class YizhiRequest implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String m ="db";
	private	String oper;
	private	String sqlid;
	private	List<Object> params;
	/**
	 * @return the m
	 */
	public String getM() {
		return m;
	}
	/**
	 * @param m the m to set
	 */
	public void setM(String m) {
		this.m = m;
	}
	/**
	 * @return the oper
	 */
	public String getOper() {
		return oper;
	}
	/**
	 * @param oper the oper to set
	 */
	public void setOper(String oper) {
		this.oper = oper;
	}
	/**
	 * @return the sqlid
	 */
	public String getSqlid() {
		return sqlid;
	}
	/**
	 * @param sqlid the sqlid to set
	 */
	public void setSqlid(String sqlid) {
		this.sqlid = sqlid;
	}
	/**
	 * @return the params
	 */
	public List<Object> getParams() {
		return params;
	}
	/**
	 * @param params the params to set
	 */
	public void setParams(List<Object> params) {
		this.params = params;
	}
	
	
	
		 
}
