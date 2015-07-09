package com.bigbest.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import org.apache.struts2.ServletActionContext;
/**
 * 国际化工具类。
 * @author ljj
 *
 */
public class MessageUtil {

	private static ResourceBundle bundler;
	
	static{
		
		try {
//			Locale locale=Locale.ENGLISH;
			String realPath="com.bigbest.resource.message";
//			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream(new File(realPath)),"UTF-8"));
//			bundler=new PropertyResourceBundle(bufferedReader);
			bundler=ResourceBundle.getBundle(realPath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * 根据properties中的key和本地化语言类型  获取合适的数据。
	 * 比如配置文件中，同时存在 中文和英文的username(中文:刘俊杰  英文：Junjie Liu) 
	 * 中国网站获取到的数据就是"刘俊杰"，英语网站获取到的数据就是"Junjie Liu"
	 * 
	 * @param key
	 * @return
	 */
	public static String getMessage(String key) {
		return bundler.getString(key);
	}
}
