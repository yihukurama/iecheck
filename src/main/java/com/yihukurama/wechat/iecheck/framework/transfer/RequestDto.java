/**
 * 功能描述: 
 * @Author:Administrator
 * @Date:2016年10月4日 下午1:59:12
 */
package com.yihukurama.wechat.iecheck.framework.transfer;

import java.util.List;

/**
 * 功能描述: 
 * @param <T>
 * @Author:dengshuai
 * @Date:2016年10月4日 下午1:59:12
 */
public class RequestDto {
	Integer pagesize=5;
	Integer pagenum=1;
	List<Object> data;

	/**
	 * @return the pagesize
	 */
	public Integer getPagesize() {
		return pagesize;
	}

	/**
	 * @param pagesize the pagesize to set
	 */
	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}

	/**
	 * @return the pagenum
	 */
	public Integer getPagenum() {
		return pagenum;
	}

	/**
	 * @param pagenum the pagenum to set
	 */
	public void setPagenum(Integer pagenum) {
		this.pagenum = pagenum;
	}

	/**
	 * @return the data
	 */
	public List<Object> getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(List<Object> data) {
		this.data = data;
	}



	
	
}
