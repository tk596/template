package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author nakajimatakuya
 * @since 10/31 home遷移用アクションsuccessを返す
 */
public class GoHomeAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;

	public String execute() {
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return this.session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
