package com.bigbest.common.log;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;
import org.hibernate.StaleObjectStateException;
import org.hibernate.Transaction;

import com.bigbest.common.dao.impl.BaseDaoImpl;
import com.bigbest.utils.MessageUtil;


/**
 * ��־����
 * @author ljj
 *
 */
public class LogIntecepter implements MethodInterceptor {


	public Object invoke(MethodInvocation invocation) throws Throwable  
    {  
        Logger loger = Logger.getLogger(invocation.getClass());  
  
        loger.info("-- SSHDemo Log -----------------------------------------------------------------------------");
        // ����ǰ�Ĳ���
        loger.info(invocation.getMethod() + ":METHOD BEGIN!");
        BaseDaoImpl bs = (BaseDaoImpl) invocation.getThis();
        bs.setSession();
        // ��������
        Transaction tx = bs.getSession().beginTransaction();
        
        Object obj = null;
		try {
			
			obj = invocation.proceed();// ִ����ҪLog�ķ���
			
			// �ύ����
			tx.commit();
			
		} catch (StaleObjectStateException e) {
			// ���°汾��һ��ʱ			
			// �ع�����
			if(tx != null) {
				tx.rollback();
			}
			
			// TODO ������ʱ�Ĵ���
			bs.setMessage(MessageUtil.getMessage("E00001"));
		} catch (Exception e) {
			// �ع�����
			if(tx != null) {
				tx.rollback();
			}
			
			throw e;
		} finally {
			// �ر�session
			bs.getSession().close();
		}

		// ������Ĳ���
		loger.info(invocation.getMethod() + ":METHOD END!");
        loger.info("-------------------------------------------------------------------------------------------------");  
  
        return obj;  
    }


}
