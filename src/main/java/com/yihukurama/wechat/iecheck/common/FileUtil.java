package com.yihukurama.wechat.iecheck.common;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.codec.binary.Base64;


/**
 * 功能描述:文件处理工具类;
 * 创建日期:2016年9月9日
 * @author liujun
 * Created by Eclipse
 */
public abstract class FileUtil
{
	public static int upload()
	{
		return 0;
	}
	
	public static int download()
	{
		return 0;
	}

	/**
	 * 图片上传处理
	 * @param string
	 * @param sigPic
	 * @return
	 */
	public static String uploadPic(String rootPath,String type, String picdata) {
//		String path1=Thread.currentThread().getContextClassLoader().getResource("").getPath();
//		String rootPath=path1.replace("target/classes", "src/main/resources/public");
		String path="/upload/casePic/"+type;
		try {
			Base64 decoder = new Base64(); 
			byte[] bytes1;
			bytes1 = decoder.decode(picdata);
			ByteArrayInputStream bais = new ByteArrayInputStream(bytes1);    
			BufferedImage bi1 =ImageIO.read(bais); 
			Date timeCur = new Date();
			String str = DateUtil.toString(timeCur, "yyyyMMdd");
			
			String realPath = rootPath+path+"/"+str;
			File dir=new File(realPath);
			if(!dir.exists()){
				dir.mkdirs();
			}
			String fileName=path+"/"+str+"/" +MD5.GetMD5Code(timeCur.getTime()+"")+".jpg";
			File w2 = new File(rootPath+fileName);//可以是jpg,png,gif格式    
			ImageIO.write(bi1, "jpg", w2);//不管输出什么格式图片，此处不需改动   
			return fileName;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}                  
	}
	
	/**
	 * 
	 * 功能描述:读取图片文件的头部信息
	 * @param filePath
	 * @return
	 * @Author:Jieyq
	 * @Date:2016年9月21日 下午7:42:59
	 */
	/*public static Map<String,Object> getPicHeader(String filePath){
		File jpegFile = new File(filePath);
//    	File jpegFile = new File("D:\\IMG_20160921_160121223.jpg");
    	Metadata metadata;
    	Map<String,Object> map=new HashMap<String,Object>();
    	StringBuffer sb=new StringBuffer();
    	Date createDate=null;
		try {
			metadata = ImageMetadataReader.readMetadata(jpegFile);
			for (Directory directory : metadata.getDirectories()) {      
				for (Tag tag : directory.getTags()) {  
					sb.append(tag+"\t\n");
	    	        if(tag!=null&&tag.getTagType()==3&&("File Modified Date").equals(tag.getTagName())){
	    	        	createDate=DateUtil.toDate(tag.getDescription(), Locale.UK);
	    	        }
				}  
			}
		} catch (ImageProcessingException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("createDate", createDate);
		map.put("headerStr", sb.toString());
		return map;
	}
	*/
	/*public static void main(String[] args) {
		String filePath="D:\\71D8A30E10ED8DC1C13CCF72BC928EA5.png";
		Map map=getPicHeader(filePath);
		System.out.println(DateUtil.toString((Date)map.get("createDate"), "yyyy-MM-dd HH:mm:ss"));
		System.out.println(map.get("headerStr"));
	}*/
	
	
}
