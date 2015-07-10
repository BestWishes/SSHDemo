package com.bigbest.common.exception;

import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

/**
 * ��Spring AOP���� ����쳣��Ϣ���ѳ����쳣����ҵ���쳣
 * @author ljj
 *
 */
public class ExceptionAdvisor implements ThrowsAdvice{
	
	private void afterThrowing(Method method,Object[] args,Object target,Exception ex) throws Throwable{

		Logger logger=Logger.getLogger(target.getClass());
		logger.error("*****************************************************************");
		logger.error("error happend in class:"+target.getClass().getName());
		logger.error("error happend in method:"+method.getName());
			for (int i = 0; i < args.length; i++) {
				logger.error("arg["+i+"]:"+args[i]);
			}
		logger.error("error class:"+ex.getClass().getName());
		logger.error("ex.getMessage():"+ex.getMessage());
		ex.printStackTrace();
		logger.error("*****************************************************************");
		
		if(ex.getClass().equals(NullPointerException.class)){
			ex.printStackTrace();
			throw new BussinessException("��ָ���쳣��������δ����ʼ���Ķ�������ǲ����ڵĶ���");
		}else if (ex.getClass().equals(IOException.class)) {
			ex.printStackTrace();
			throw new BussinessException("IO�쳣");
		}else if (ex.getClass().equals(ClassNotFoundException.class)) {
			ex.printStackTrace();
			throw new BussinessException("ָ�����಻����");
		}else if (ex.getClass().equals(ArithmeticException.class)) {
			ex.printStackTrace();
			throw new BussinessException("��ѧ�����쳣");
		}else if (ex.getClass().equals(ArrayIndexOutOfBoundsException.class)) {
			ex.printStackTrace();
			throw new BussinessException("�����±�Խ���쳣");
		}else if (ex.getClass().equals(IllegalArgumentException.class)) {
			ex.printStackTrace();
			throw new BussinessException("������������!");
		}else if (ex.getClass().equals(ClassCastException.class)) {
			ex.printStackTrace();
			throw new BussinessException("����ǿ��ת������");
		}else if (ex.getClass().equals(SecurityException.class)) {
			ex.printStackTrace();
			throw new BussinessException("Υ����ȫԭ���쳣");
		}else if (ex.getClass().equals(SQLException.class)) {
			ex.printStackTrace();
			throw new BussinessException("�������ݿ��쳣");
		}else if (ex.getClass().equals(NoSuchMethodError.class)) {
			ex.printStackTrace();
			throw new BussinessException("����δ�ҵ��쳣");
		}else if (ex.getClass().equals(InternalError.class)) {
			ex.printStackTrace();
			throw new BussinessException("java������������ڲ�����");
		}
		else{
			ex.printStackTrace();
			throw new BussinessException("�����ڲ����󣬲���ʧ�ܣ�"+ex.getLocalizedMessage());
		}
		
	}
}
