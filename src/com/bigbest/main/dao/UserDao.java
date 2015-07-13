package com.bigbest.main.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.bigbest.common.dao.impl.BaseDaoImpl;
import com.bigbest.common.entity.User;
import com.bigbest.utils.HibernateUtil;
import com.bigbest.utils.PageUtil;
import com.bigbest.utils.mapper.JsonMapper;

public class UserDao extends BaseDaoImpl{

	private User user=null;
	private static Logger logger=Logger.getLogger(User.class);
	
	public User userLogin(User user) {
		Session session=HibernateUtil.getSession();
		Criteria criteria=session.createCriteria(User.class);
		Criterion criterion=Restrictions.and(Restrictions.eq("name", user.getName()), Restrictions.eq("password", user.getPassword()));
		criteria.add(criterion);
		@SuppressWarnings("unchecked")
		List<User> users=(List<User>)criteria.list();
		if(!users.isEmpty()){
			this.user=(User) users.get(0);
		}
		session.close();
		try {
			logger.error(JsonMapper.nonEmptyMapper().toJson(this.user));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return this.user;
	}
	
	@SuppressWarnings("unchecked")
	public List<User> getUsers(User user,PageUtil page){
		Session session=HibernateUtil.getSession();
		Criteria criteria=session.createCriteria(User.class);
		criteria.addOrder(Order.asc("age"));
		criteria.setFirstResult(0);
		criteria.setMaxResults(10);
		List<User> users=(List<User>)criteria.add(Example.create(user)).list();
		session.close();
		return users;
	}
	
 }
