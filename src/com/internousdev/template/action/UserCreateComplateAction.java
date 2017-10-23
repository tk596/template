package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.UserCreateComplateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateComplateAction extends ActionSupport implements SessionAware{

	public String loginUserId;

	public String loginPassword;

	public String userName;

	public Map<String,Object> session;

	public String result;

	public SessionAware session01 = new UserCreateConfirmAction();

	public UserCreateComplateDAO userCreateComplateDAO = new UserCreateComplateDAO();

	public String execute() throws SQLException {

		userCreateComplateDAO.cerateUser(session.get("loginUserId").toString(),
				session.get("loginPassword").toString(),
				session.get("userName").toString());

		result = SUCCESS;

		return result ;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public SessionAware getSession01() {
		return session01;
	}

	public void setSession01(SessionAware session01) {
		this.session01 = session01;
	}

	public UserCreateComplateDAO getUserCreateComplateDAO() {
		return userCreateComplateDAO;
	}

	public void setUserCreateComplateDAO(UserCreateComplateDAO userCreateComplateDAO) {
		this.userCreateComplateDAO = userCreateComplateDAO;
	}


}
