package com.bigbest.common.dao.impl;

import org.hibernate.Session;

import com.bigbest.common.dao.BaseDao;

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

	public void setSession(Session session) {
		this.session = session;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
