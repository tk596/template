package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemDAO;
import com.internousdev.template.dao.LoginDAO;
import com.internousdev.template.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ログイン認証処理
 * Login.jspからログインID、ログインパスワードを受け取り
 * DBへ問い合わせを行います。
 *
 * @author internous
 * @param loginUserId
 * @param loginPassword
 *
 * @return result
 */
public class LoginAction extends ActionSupport implements SessionAware{

    /**
    * ログインID
    */
    public String userId;

    /**
    * ログインパスワード
    */
    public String password;

    /**
    * 処理結果を格納
    */
    public String result;

    /**
    * ログイン情報を格納
    */
    public Map<String, Object> session;

    /**
    * ログイン情報取得DAO
    */
    public LoginDAO loginDAO = new LoginDAO();

    /**
    * ログイン情報格納IDTO
    */
    private LoginDTO loginDTO = new LoginDTO();

    /**
    * アイテム情報を取得
    */
    public BuyItemDAO buyItemDAO = new BuyItemDAO();

    /**
    * 実行メソッド
    */
    public String execute() {

        result = ERROR;

        // ログイン実行
        loginDTO = loginDAO.getLoginUserInfo(userId, password);

        session.put("loginUser", loginDTO);

        // ログイン情報を比較
        if(((LoginDTO) session.get("loginUser")).getLoginFlg()) {
            result = SUCCESS;


            return result;
        }

        return result;
    }






	public String getUserId() {
		return userId;
	}






	public void setUserId(String userId) {
		this.userId = userId;
	}






	public String getPassword() {
		return password;
	}






	public void setPassword(String password) {
		this.password = password;
	}






	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public LoginDAO getLoginDAO() {
		return loginDAO;
	}

	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

	public LoginDTO getLoginDTO() {
		return loginDTO;
	}

	public void setLoginDTO(LoginDTO loginDTO) {
		this.loginDTO = loginDTO;
	}

	public BuyItemDAO getBuyItemDAO() {
		return buyItemDAO;
	}

	public void setBuyItemDAO(BuyItemDAO buyItemDAO) {
		this.buyItemDAO = buyItemDAO;
	}


}
