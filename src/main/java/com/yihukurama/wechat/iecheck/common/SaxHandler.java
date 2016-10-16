package com.yihukurama.wechat.iecheck.common;

import java.util.HashMap;
import java.util.Map;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


/**
 * 功能描述:SAX解析XML文件工具类,该工具类仅用于解析无重复节点元素的XML文档;
 * @date:2016年9月5日
 * @author 胡云凯
 */
public class SaxHandler extends DefaultHandler
{
	private Map<String, String> dataMap;   // 保存xml文件中的键值对数据;
	private String currentNode;            // 当前节点名称;
	private String currentValue;           // 当前节点值; 
	
	// 构造方法;
	public SaxHandler() 
	{
		this.currentNode = "";
		this.currentValue = "";
	}
	
	// Geters and Setters;
	public Map<String, String> getDataMap() 
	{
		return dataMap;
	}
	
	// 成员方法;
	/*
	 * 开始解析XML文档;
	 */
	@Override
	public void startDocument() throws SAXException 
	{
		dataMap = new HashMap<>();
	}
	
	/*
	 * 开始解析节点元素;
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) 
		throws SAXException 
	{
		if(!StringUtil.isEmpty(qName))
		{
			currentNode = qName;  // 保存当前节点名称;
		}
	}
	
	/*
	 * 解析节点元素的值;
	 */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException
	{
		currentValue = new String(ch, start, length);
	}
	
	/*
	 * 结束解析节点元素;
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException
	{
		if(!StringUtil.isEmpty(qName))
		{
			dataMap.put(currentNode, currentValue.trim());
		}
		// 清空临时数据;
		currentNode = "";
		currentValue = "";
	}
	
	@Override
	public void endDocument() throws SAXException 
	{
		dataMap.remove("");
	}
	
}
