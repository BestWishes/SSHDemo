package com.bigbest.main.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.bigbest.common.action.BaseAction;
import com.bigbest.common.entity.User;
import com.bigbest.main.dao.UserDao;
import com.opensymphony.xwork2.ActionContext;
/**
 * ÓÃ»§Action
 * @author ljj
 */
public class UserAction extends BaseAction{

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
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
}
