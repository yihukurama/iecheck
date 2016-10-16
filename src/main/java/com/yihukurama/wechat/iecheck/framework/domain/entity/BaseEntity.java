
package com.yihukurama.wechat.iecheck.framework.domain.entity;

/**
 * 功能描述: 实体基类
 * 
 * @Author:dengshuai
 * @Date:2016年10月4日 下午4:59:09
 */
public abstract class BaseEntity {
	protected Integer id;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

}
