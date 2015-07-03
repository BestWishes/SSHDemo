package com.bigbest.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.bigbest.entity.User;

public class UserDao {

	private User user=null;
	@SuppressWarnings({ "deprecation", "unchecked" })
	public User userLogin(User user) {
		Configuration config=new Configuration().configure();
		ServiceRegistry serviceRegistry = 
				new ServiceRegistryBuilder().applySettings(config.getProperties())
				                            .buildServiceRegistry();
		SessionFactory sessionFactory=config.buildSessionFactory(serviceRegistry);
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("from User u where u.name=:name and u.password=:password").setString("name", user.getName()).setString("password", user.getPassword());
		java.util.List<Object> users=query.list();
		transaction.commit();
		if(!users.isEmpty()){
			this.user=(User) users.get(0);
		}
		session.close();
		return this.user;
	}
	
	
 }
