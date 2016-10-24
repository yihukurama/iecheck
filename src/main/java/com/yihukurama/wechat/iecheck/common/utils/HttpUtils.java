package com.yihukurama.wechat.iecheck.common.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import com.yihukurama.wechat.iecheck.common.Constant;



/**
 * 功能描述:http工具类; 创建日期:2016年9月9日
 * 
 * @author dengshuai Created by Eclipse
 */
@Component
public class HttpUtils {

	/**
	 * 功能描述：下载网络图片，用url的 md5命名
	 * 
	 * @param url
	 * @param type
	 *            jpg,png等
	 * @return
	 */
	public File downLoadImageFile(String url, String type, String destDir) {
		File file = null;
		String fileName = MD5.GetMD5Code(url) + Constant.DOT + type;
		// 使用get方法连接服务器
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url);
		FileOutputStream fos;
		try {
			// 客户端开始向指定的网址发送请求
			HttpResponse response = client.execute(httpGet);
			InputStream inputStream = response.getEntity().getContent();
			file = new File(destDir);
			if (!file.exists()) {
				file.mkdirs();
			}

			fos = new FileOutputStream(file.getAbsolutePath() + File.separator + fileName);
			byte[] data = new byte[1024];
			int len = 0;
			while ((len = inputStream.read(data)) != -1) {
				fos.write(data, 0, len);
			}
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		file = new File(destDir + File.separator + fileName);
		return file;
	}

	/**
	 * POST请求
	 * 
	 * @param url
	 * @param requestBody
	 * @param charset
	 * @return
	 */
	public String doPost(String url, String requestBody, String charset) {
		CloseableHttpClient httpClient = null;
		HttpPost httpPost = null;
		String result = null;
		try {
			httpClient = HttpClients.createDefault();
			httpPost = new HttpPost(url);
			StringEntity entity = new StringEntity(requestBody,charset);// 解决中文乱码问题
			entity.setContentEncoding("UTF-8");
			entity.setContentType("application/json");
			httpPost.setEntity(entity);

			HttpResponse response = httpClient.execute(httpPost);
			
			if (response != null) {
				HttpEntity resEntity = response.getEntity();
				if (resEntity != null) {
					result = EntityUtils.toString(resEntity, charset);
				}
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				
				httpClient.close(); // 关闭资源 释放链接
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 发送get请求
	 * 
	 * @param url
	 *            路径
	 * @return "No data" default
	 */
	public String doGet(String url) {
		// get请求返回结果
		String strResult = "No data";
		CloseableHttpClient client = HttpClients.createDefault();
		try {
			// 发送get请求
			HttpGet request = new HttpGet(url);
			HttpResponse response = client.execute(request);

			/** 请求发送成功，并得到响应 **/
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				/** 读取服务器返回过来的json字符串数据 **/
				strResult = EntityUtils.toString(response.getEntity());
				url = URLDecoder.decode(url, "UTF-8");
			} else {
				System.out.println("get请求提交失败:1" + url);
			}
			
		} catch (IOException e) {
			System.out.println("get请求提交失败:2" + url);
		} finally {
			try {
				client.close(); // 关闭资源 释放链接
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return strResult;
	}
}
