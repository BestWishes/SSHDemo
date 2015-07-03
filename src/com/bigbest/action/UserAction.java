package com.bigbest.action;

import com.bigbest.dao.UserDao;
import com.bigbest.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2420011513200970457L;
	private UserDao userDao;
	private User user=new User();
	public String userLogin() {
		userDao=new UserDao();
		this.user=userDao.userLogin(this.user);
		if(this.user!=null){
			return SUCCESS;
		}
		return ERROR;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public User getModel() {
		return this.user;
	}
}
