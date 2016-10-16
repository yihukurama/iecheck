package com.yihukurama.wechat.iecheck.sdk.wechat.common;

public class Constant {
	
	
	//我的测试号
	public static final String TOKEN = "yihukurama";//TOKEN名字
    public static final String APPID = "wxeb2343c9f831f559";//公众号 开发者ID
    public static final String APPSECRET = "98946cb68f1e3c88855c053b1d881dbb";//公众号 开发者密匙
    public static final String AESKEY = "hgACmUxCReVWYFDIs29z6fb1MzbTjc6Eko3BgYWyRQR";//编码随机数
    
	
    public static String REDIRECTURL="http://www.iecheck.com";//重定向地址
    public static String host = "http://www.iecheck.com";
    
    //redis缓存中的键
    public static final String REDISKEY_ACCESSTOKEN = "REDISKEY_ACCESSTOKEN";
    public static final String REDISKEY_AU_ACCESSTOKEN = "REDISKEY_AU_ACCESSTOKEN";
    public static final String REDISKEY_JSAPITICKEY = "REDISKEY_JSAPITICKEY";

}
