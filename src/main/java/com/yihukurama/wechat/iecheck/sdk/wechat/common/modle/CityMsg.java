package com.yihukurama.wechat.iecheck.sdk.wechat.common.modle;

import com.yihukurama.wechat.iecheck.sdk.wechat.common.modle.citymsg.KeyNote;

/**
 * 功能描述: 
 * @Author:denghsuai
 * @Date:2016年10月20日 下午8:49:20
 */
public class CityMsg {
		private String openid;
		private String template_id;
		private String result_page_style_id;
		private String deal_msg_style_id;
		private String card_style_id;
		private String order_no;
		private String url;
		private KeyNote data;
		public String getOpenid() {
			return openid;
		}
		public void setOpenid(String openid) {
			this.openid = openid;
		}
		public String getTemplate_id() {
			return template_id;
		}
		public void setTemplate_id(String template_id) {
			this.template_id = template_id;
		}
		public String getResult_page_style_id() {
			return result_page_style_id;
		}
		public void setResult_page_style_id(String result_page_style_id) {
			this.result_page_style_id = result_page_style_id;
		}
		public String getDeal_msg_style_id() {
			return deal_msg_style_id;
		}
		public void setDeal_msg_style_id(String deal_msg_style_id) {
			this.deal_msg_style_id = deal_msg_style_id;
		}
		public String getCard_style_id() {
			return card_style_id;
		}
		public void setCard_style_id(String card_style_id) {
			this.card_style_id = card_style_id;
		}
		public String getOrder_no() {
			return order_no;
		}
		public void setOrder_no(String order_no) {
			this.order_no = order_no;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	
		public KeyNote getData() {
			return data;
		}
		public void setData(KeyNote data) {
			this.data = data;
		}





		class outData{
			
		}
		
}
