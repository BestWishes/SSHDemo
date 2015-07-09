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
 * ���ʻ������ࡣ
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
	 * ����properties�е�key�ͱ��ػ���������  ��ȡ���ʵ����ݡ�
	 * ���������ļ��У�ͬʱ���� ���ĺ�Ӣ�ĵ�username(����:������  Ӣ�ģ�Junjie Liu) 
	 * �й���վ��ȡ�������ݾ���"������"��Ӣ����վ��ȡ�������ݾ���"Junjie Liu"
	 * 
	 * @param key
	 * @return
	 */
	public static String getMessage(String key) {
		return bundler.getString(key);
	}
}
