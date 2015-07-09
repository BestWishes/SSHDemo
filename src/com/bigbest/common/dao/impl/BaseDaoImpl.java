package com.bigbest.common.dao.impl;

import org.hibernate.Session;

import com.bigbest.common.dao.BaseDao;
import com.bigbest.utils.HibernateUtil;

public class BaseDaoImpl implements BaseDao {

	private String message;
	private Session session;
	
	@Override
	public String getMessage() {		
		return this.message;
	}

	public Session getSession() {
		return session;
	}

	public void setSession() {
		this.session = HibernateUtil.getSession();
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
