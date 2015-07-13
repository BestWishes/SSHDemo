package com.bigbest.main.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.bigbest.common.action.BaseAction;
import com.bigbest.common.entity.User;
import com.bigbest.main.dao.UserDao;
import com.bigbest.utils.MessageUtil;
import com.bigbest.utils.mapper.JsonMapper;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;
/**
 * 用户Action
 * @author ljj
 */
public class UserAction extends BaseAction{

	private static final long serialVersionUID = 2420011513200970457L;
	private static UserDao userDao=new UserDao();
	private User user=new User();
	private List<User> users=new ArrayList<User>(); 
	private String name;
	private String password;

	public String userLogin() {

		this.user.setName(name);
		this.user.setPassword(password);
		this.user=userDao.userLogin(this.user);
		Map<String,Object> session=ActionContext.getContext().getSession();
		Map<String,Object> application=ActionContext.getContext().getApplication();
		Map<String, Object> request=(Map<String, Object>) ActionContext.getContext().get("request");
		application.put("applicationAcount", 10);
		session.put("user", this.user);
		session.put("json", JsonMapper.nonEmptyMapper().toJson(this.user));
		session.put("message", MessageUtil.getMessage("userName"));		
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

	public static UserDao getUserDao() {
		return userDao;
	}

	public static void setUserDao(UserDao userDao) {
		UserAction.userDao = userDao;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
