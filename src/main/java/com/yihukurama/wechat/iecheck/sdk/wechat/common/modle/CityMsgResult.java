package com.yihukurama.wechat.iecheck.sdk.wechat.common.modle;

/**
 * 功能描述: 城市服务返回结果
 * 
 * @Author:denghsuai
 * @Date:2016年10月20日 下午9:00:43
 */
public class CityMsgResult extends BaseResponseModel {
	String result_page_url;

	public String getResult_page_url() {
		return result_page_url;
	}

	public void setResult_page_url(String result_page_url) {
		this.result_page_url = result_page_url;
	}

}
/**
 * 
 * 
 * https://api.weixin.qq.com/cityservice/sendmsgdata?access_token=ACCESS_TOKEN
 * 
 * 以POST方式传入json格式参数 openid 必填 用户id template_id 必填 城市服务分配给公众号的模板id
 * result_page_style_id 选填 若该模板会进入办事结果页则必填。办事结果页样式id deal_msg_style_id 选填
 * 若该模板会进入办事记录则必填。办事记录样式id card_style_id 选填 若该模板会进入页卡则必填。页卡样式id order_no 选填
 * 办事记录的订单号。同一订单号的办事记录会合成一条 url 选填 跳转链接。用于服务通知和办事结果页 data 必填
 * 模板对应的json数据，其中的color字段只对服务通知有效
 * 
 * 例如： {            "openid":"OPENID",
 *            "template_id":"ngqIpbwh8bUfcSsECmogfXcV14J0tQlEpBO27izEYtY",
 *            "result_page_style_id":"cUjfPSEtwasWQFsJ5PXo218PexBaHy5jg_peVDe4WkY
 * ",
 *            "deal_msg_style_id":"cUjfPSEtwasWQFsJ5PXo24LeNjWbwMObXSHPNjVZ0uQ
 * ",            "card_style_id":"cUjfPSEtwasWQFsJ5PXo2z8LSM0Q6FH05DCerWEVkDs ",
 *            "order_no":"ORDER_NO",
 *            "url":"http://weixin.qq.com/download",            "data":{
 *                    "first": {                        "value":"恭喜你购买成功！",
 *                        "color":"#173177"                    },
 *                    "keynote1":{                        "value":"巧克力",
 *                        "color":"#173177"                    },
 *                    "keynote2": {                        "value":"39.8元",
 *                        "color":"#173177"                    },
 *                    "keynote3": {                        "value":"2014年9月22日",
 *                        "color":"#173177"                    },
 *                    "remark":{                        "value":"欢迎再次购买！",
 *                        "color":"#173177"                    }            } }
 * 
 * 返回结果： errcode 返回码 errmsg 返回码描述 result_page_url 办事结果页url 例如： { "errcode":0,
 * "errmsg":"ok",
 * "result_page_url":"https://city.weixin.qq.com/static/resultpagenew.html?openid=ont-9vjAcIdSU-LgB7ubALAVJO9U&biz_template_id=ngqIpbwh8bUfcSsECmogfXcV14J0tQlEpBO27izEYtY"
 * }
 * 
 **/