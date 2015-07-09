package com.bigbest.common.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
/**
 * ����Action�Ļ��ࡣ�̳�ActionSupport�࣬ʵ��SessionAware�ӿڡ�
 * @author ljj
 *
 */
public class BaseAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private Map<String,Object> session;
	private String message;
	private boolean readOnly;
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
