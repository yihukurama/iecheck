package com.yihukurama.wechat.iecheck.common;

import java.util.List;
import java.util.UUID;

/**
 * 功能描述:字符串处理工具类;
 * 创建日期:2016年9月6日
 * @author liujun
 * Created by Eclipse
 */
public abstract class StringUtil
{
	//base64编码字符集
	public static String[] chars = new String[] { "a", "b", "c", "d", "e", "f",  
            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",  
            "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",  
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",  
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",  
            "W", "X", "Y", "Z" };
	
	
	/**
	 * 功能描述:判断字符串是否为空,判定标准是:给定字符串为null或者为空串"";
	 * @param str 待检测的字符串
	 * @return true,字符串为空;false,字符串不为空
	 * 创建时间:2016年9月6日
	 * @Author liujun
	 */
	public static boolean isEmpty(String str)
	{
		if(str == null || "".equals(str.trim()))
		{
			return true;
		}
		return false;
	}
	
	/**
	 * 功能描述:将给定字符串转换为全大写字母形式(仅限英文字符);
	 * @param str 字符串对象
	 * @return 转换后的字符串;如果给定字符串为空,则返回原字符串
	 * 创建时间:2016年9月7日
	 * @Author liujun
	 */
	public static String toUpperCase(String str) 
	{
		if (!isEmpty(str)) 
		{
			return str.trim().toUpperCase();
		}
		return str;
	}
	
	/**
	 * 功能描述:将给定字符串转换为全小写字母形式(仅限英文字符);
	 * @param str 字符串对象
	 * @return 转换后的字符串;如果给定字符串为空,则返回原字符串
	 * 创建时间:2016年9月7日
	 * @Author liujun
	 */
	public static String toLowerCase(String str)
	{
		if (!isEmpty(str)) 
		{
			return str.trim().toLowerCase();
		}
		return str;
	}
	
	/**
	 * 功能描述:将数据元素为字符串的List集合转换成为一个普通的字符串,各个字符串之间以','(英文)分隔;
	 * @param strs List集合
	 * @return 字符串
	 * 创建时间:2016年9月6日
	 * @Author liujun
	 */
	public static String convertToString(List<String> items)
	{
		StringBuffer buffer = new StringBuffer();
		for(String item : items)
		{
			buffer.append(item + ",");
		}
		
		return buffer.deleteCharAt(buffer.length() - 1).toString();
	}
	
	/**
	 * 
	 * 功能描述:获取12位uuid
	 * @return
	 * @Author:Jieyq
	 * @Date:2016年10月10日 上午11:00:27
	 */
	public static String generateUuid() {
	    StringBuffer shortBuffer = new StringBuffer();
	    String uuid = UUID.randomUUID().toString().replace("-", "");
	    for (int i = 0; i < 4; i++) {
	    	String str = uuid.substring(i * 8, i * 8 + 8);
	    	long x = Long.parseLong(str, 16);
//	    	System.out.println(x);
	    	shortBuffer.append(chars[(int) (x % 0x3E)]);
	    }
	    for(int i = 0; i < 8; i++) {
	        String str = uuid.substring(i * 4, i * 4 + 4);
	        int x = Integer.parseInt(str, 16);
//	        System.out.println(x);
	        shortBuffer.append(chars[x % 0x3E]);
	    }
//	    System.out.println(shortBuffer);
	    return shortBuffer.toString();
	  
	} 
	
}
