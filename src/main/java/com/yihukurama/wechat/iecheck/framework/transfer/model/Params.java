package com.yihukurama.wechat.iecheck.framework.transfer.model;

/**
 * 功能描述: 
 * @Author:dengshuai
 * @Date:2016年10月25日 下午11:50:12
 */
public class Params {
	private String CODE_TYPE;
	private String CODE;
	private String openid; 
	private String nickname;//昵称
	private String sex;//性别
	private String province;//省份
	private String city;//城市
	private String country;//国家
	private String headimgurl;//头像地址
	private String privilege;//地址
	private String unionid;//唯一ID
	private String lat;//纬度
	private String lng;//经度
	private String mobile;//手机号
		
		
	/**
	 * @return the cODE_TYPE
	 */
	public String getCODE_TYPE() {
		return CODE_TYPE;
	}
	/**
	 * @param cODE_TYPE the cODE_TYPE to set
	 */
	public void setCODE_TYPE(String cODE_TYPE) {
		CODE_TYPE = cODE_TYPE;
	}
	/**
	 * @return the cODE
	 */
	public String getCODE() {
		return CODE;
	}
	/**
	 * @param cODE the cODE to set
	 */
	public void setCODE(String cODE) {
		CODE = cODE;
	}
	/**
	 * @param cODE_TYPE
	 * @param cODE
	 */
	public Params(String cODE_TYPE, String cODE) {
		super();
		CODE_TYPE = cODE_TYPE;
		CODE = cODE;
	}
	/**
	 * @return the openid
	 */
	public String getOpenid() {
		return openid;
	}
	/**
	 * @param openid the openid to set
	 */
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the headimgurl
	 */
	public String getHeadimgurl() {
		return headimgurl;
	}
	/**
	 * @param headimgurl the headimgurl to set
	 */
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}
	/**
	 * @return the privilege
	 */
	public String getPrivilege() {
		return privilege;
	}
	/**
	 * @param privilege the privilege to set
	 */
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	/**
	 * @return the unionid
	 */
	public String getUnionid() {
		return unionid;
	}
	/**
	 * @param unionid the unionid to set
	 */
	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
	/**
	 * @return the lat
	 */
	public String getLat() {
		return lat;
	}
	/**
	 * @param lat the lat to set
	 */
	public void setLat(String lat) {
		this.lat = lat;
	}
	/**
	 * @return the lng
	 */
	public String getLng() {
		return lng;
	}
	/**
	 * @param lng the lng to set
	 */
	public void setLng(String lng) {
		this.lng = lng;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 
	 */
	public Params() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
