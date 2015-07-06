package com.bigbest.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.bigbest.entity.User;
import com.bigbest.utils.HibernateUtil;
import com.bigbest.utils.PageUtil;

public class UserDao {

	private User user=null;
	
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
		return this.user;
	}
	
	@SuppressWarnings("unchecked")
	public List<User> getUsers(User user,PageUtil page){
		Session session=HibernateUtil.getSession();
		Criteria criteria=session.createCriteria(User.class);
		criteria.addOrder(Order.asc("age"));
		criteria.setFirstResult(0);
<<<<<<< HEAD
		criteria.setMaxResults(5);
=======
		criteria.setMaxResults(10);
>>>>>>> origin/master
		List<User> users=(List<User>)criteria.add(Example.create(user)).list();
		session.close();
		return users;
	}
	
 }
