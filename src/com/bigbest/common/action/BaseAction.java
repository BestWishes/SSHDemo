package com.bigbest.common.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.bigbest.utils.MessageUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 所有Action的基类。继承ActionSupport类，实现SessionAware接口。
 * @author ljj
 *
 */
public class BaseAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private Map<String,Object> session;
	private String message;
	private boolean readOnly;
	/**
	 * 此处代码块的目的是获取远程浏览器的语言环境，并将其设置到MessageUtil类中。实现国际化的效果。
	 */
	{
		MessageUtil.setLocale(ActionContext.getContext().getLocale());
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isReadOnly() {
		return readOnly;
	}
	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}
	public Map<String, Object> getSession() {
		return session;
	}

}
