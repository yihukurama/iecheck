package com.yihukurama.wechat.iecheck.common;

import java.util.List;
import java.util.Random;

/**
 * 功能描述:数字处理工具类; 创建日期:2016年9月6日
 * 
 * @author liujun Created by Eclipse
 */
public abstract class NumberUtil {
	/**
	 * 功能描述:将数值型数组转换为字符串,例如输入数组为[1,2,3],转换之后的结果为"1,2,3";
	 * @param numbers 数值型数组,例如[1,2,3]、[1.2,2.2,3.3]
	 * @return 字符串
	 * @Date:2016年9月26日 上午9:36:09
	 * @Author liujun
	 */
	public static String convertToString(Number[] numbers) {
		StringBuffer buffer = new StringBuffer();
		for (Number number : numbers) {
			buffer.append(number + ",");
		}
		buffer.deleteCharAt(buffer.length() - 1);

		return buffer.toString();
	}

	public static String convertToString(List<? extends Number> numbers) {
		StringBuffer buffer = new StringBuffer();
		if (numbers.size() != 0) {
			for (Number number : numbers) {
				buffer.append(number + ",");
			}
		buffer.deleteCharAt(buffer.length() - 1);
		}else{
			buffer.append("NULL");
		}
		return buffer.toString();
	}
	
	public static String getRandStr(int charCount) {
		String charValue = "";
		for (int i = 0; i < charCount; i++){
			char c = (char) (randomInt(0,26)+'a');
			charValue += String.valueOf(c);
		}
		return charValue;
	}
	public static String getRandNum(int charCount) {
		String charValue = "";
		for (int i = 0; i < charCount; i++){
			char c = (char) (randomInt(0,10)+'0');
			charValue += String.valueOf(c);
		}
		return charValue;
	}

	public static int randomInt(int from, int to){
		Random r = new Random();
		return from + r.nextInt(to - from);
	}
	

}
