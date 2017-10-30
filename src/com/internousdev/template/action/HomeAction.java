package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	/**
	 * ログインボタン押下時に実行
	 * ログイン画面へ遷移します。
	 *
	 * @return SUCCSESS
	 */
	public String execute() {
		String result = "login";
		if (session.containsKey("userId")) {
			session.putAll(session);
			result = SUCCESS;
		}
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return session;
	}


}
