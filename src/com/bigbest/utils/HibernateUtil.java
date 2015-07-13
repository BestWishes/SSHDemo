package com.bigbest.utils;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	private static Logger logger=Logger.getLogger(HibernateUtil.class);
	static{
		try{
		Configuration configuration=new Configuration().configure();
		ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory=configuration.buildSessionFactory(serviceRegistry);
		System.out.println("hibernateUtil init sessionfactory");
		}catch(Exception e){
			logger.error(e.getMessage());
		}
	}
	public static Session getSession(){
		try {
			return sessionFactory.openSession();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
}
