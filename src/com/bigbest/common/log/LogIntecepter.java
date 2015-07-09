package com.bigbest.common.log;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;
import org.hibernate.StaleObjectStateException;
import org.hibernate.Transaction;

import com.bigbest.common.dao.impl.BaseDaoImpl;
import com.bigbest.utils.MessageUtil;


/**
 * 日志管理。
 * @author ljj
 *
 */
public class LogIntecepter implements MethodInterceptor {


	public Object invoke(MethodInvocation invocation) throws Throwable  
    {  
        Logger loger = Logger.getLogger(invocation.getClass());  
  
        loger.info("-- SSHDemo Log -----------------------------------------------------------------------------");
        // 方法前的操作
        loger.info(invocation.getMethod() + ":METHOD BEGIN!");
        BaseDaoImpl bs = (BaseDaoImpl) invocation.getThis();
        bs.setSession();
        // 开启事务
        Transaction tx = bs.getSession().beginTransaction();
        
        Object obj = null;
		try {
			
			obj = invocation.proceed();// 执行需要Log的方法
			
			// 提交事务
			tx.commit();
			
		} catch (StaleObjectStateException e) {
			// 更新版本不一致时			
			// 回滚事务
			if(tx != null) {
				tx.rollback();
			}
			
			// TODO 无数据时的处理
			bs.setMessage(MessageUtil.getMessage("E00001"));
		} catch (Exception e) {
			// 回滚事务
			if(tx != null) {
				tx.rollback();
			}
			
			throw e;
		} finally {
			// 关闭session
			bs.getSession().close();
		}

		// 方法后的操作
		loger.info(invocation.getMethod() + ":METHOD END!");
        loger.info("-------------------------------------------------------------------------------------------------");  
  
        return obj;  
    }


}
