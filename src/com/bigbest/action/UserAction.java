package com.bigbest.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.bigbest.dao.UserDao;
import com.bigbest.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2420011513200970457L;
	private static UserDao userDao=new UserDao();
	private User user=new User();
	private List<User> users=new ArrayList<User>(); 
	
	public String userLogin() {
		this.user=userDao.userLogin(this.user);
		Map<String,Object> session=ActionContext.getContext().getSession();
		Map<String,Object> application=ActionContext.getContext().getApplication();
		this.user=userDao.userLogin(this.user);
		application.put("applicationAcount", 10);
		session.put("user", this.user);
		if(this.user!=null){
			return SUCCESS;
		}
		return ERROR;
	}
	
	public String userList() {
		this.users=userDao.getUsers(this.user, null);
		return SUCCESS;
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
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
}
