package com.bigbest.utils;

import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
/**
 * 国际化工具类。
 * @author ljj
 *
 */
public class MessageUtil {

	private static ResourceBundle bundler;
	private static Locale locale=Locale.getDefault();
	private static String  realPath="com.bigbest.resource.message";

	/**
	 * 根据properties中的key和本地化语言类型  获取合适的数据。
	 * 比如配置文件中，同时存在 中文和英文的username(中文:刘俊杰  英文：Junjie Liu) 
	 * 中国网站获取到的数据就是"刘俊杰"，英语网站获取到的数据就是"Junjie Liu"
	 * 
	 * @param key
	 * @return
	 */
	public static void setLocale(Locale newlocale){
		locale=newlocale;
		bundler=ResourceBundle.getBundle(realPath,locale);
	}
	public static String getMessage(String key) {
		if(bundler==null){
			bundler=PropertyResourceBundle.getBundle(realPath, locale);
		}
		return bundler.getString(key);
	}
}
