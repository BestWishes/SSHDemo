package com.bigbest.utils;

import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
/**
 * ���ʻ������ࡣ
 * @author ljj
 *
 */
public class MessageUtil {

	private static ResourceBundle bundler;
	private static Locale locale=Locale.getDefault();
	private static String  realPath="com.bigbest.resource.message";

	/**
	 * ����properties�е�key�ͱ��ػ���������  ��ȡ���ʵ����ݡ�
	 * ���������ļ��У�ͬʱ���� ���ĺ�Ӣ�ĵ�username(����:������  Ӣ�ģ�Junjie Liu) 
	 * �й���վ��ȡ�������ݾ���"������"��Ӣ����վ��ȡ�������ݾ���"Junjie Liu"
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
