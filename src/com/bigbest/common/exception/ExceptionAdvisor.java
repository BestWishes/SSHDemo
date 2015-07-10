package com.bigbest.common.exception;

import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

/**
 * 由Spring AOP调用 输出异常信息，把程序异常抛向业务异常
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
			throw new BussinessException("空指针异常。调用了未经初始化的对象或者是不存在的对象！");
		}else if (ex.getClass().equals(IOException.class)) {
			ex.printStackTrace();
			throw new BussinessException("IO异常");
		}else if (ex.getClass().equals(ClassNotFoundException.class)) {
			ex.printStackTrace();
			throw new BussinessException("指定的类不存在");
		}else if (ex.getClass().equals(ArithmeticException.class)) {
			ex.printStackTrace();
			throw new BussinessException("数学运算异常");
		}else if (ex.getClass().equals(ArrayIndexOutOfBoundsException.class)) {
			ex.printStackTrace();
			throw new BussinessException("数组下标越界异常");
		}else if (ex.getClass().equals(IllegalArgumentException.class)) {
			ex.printStackTrace();
			throw new BussinessException("方法参数错误!");
		}else if (ex.getClass().equals(ClassCastException.class)) {
			ex.printStackTrace();
			throw new BussinessException("类型强制转换错误");
		}else if (ex.getClass().equals(SecurityException.class)) {
			ex.printStackTrace();
			throw new BussinessException("违背安全原则异常");
		}else if (ex.getClass().equals(SQLException.class)) {
			ex.printStackTrace();
			throw new BussinessException("操作数据库异常");
		}else if (ex.getClass().equals(NoSuchMethodError.class)) {
			ex.printStackTrace();
			throw new BussinessException("方法未找到异常");
		}else if (ex.getClass().equals(InternalError.class)) {
			ex.printStackTrace();
			throw new BussinessException("java虚拟机发生了内部错误");
		}
		else{
			ex.printStackTrace();
			throw new BussinessException("程序内部错误，操作失败！"+ex.getLocalizedMessage());
		}
		
	}
}
