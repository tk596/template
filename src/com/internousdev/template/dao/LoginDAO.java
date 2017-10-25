package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.LoginDTO;
import com.internousdev.template.util.DBConnector;

public class LoginDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private LoginDTO loginDTO = new LoginDTO();

	/**
	 * ログインユーザ情報取得メソッド
	 * @param loginUserId
	 * @param loginPassword
	 * @return LoginDTO
	 */
	public LoginDTO getLoginUserInfo(String loginId, String password) {

		String sql = "SELECT * FROM login_user_transaction where login_id = ? AND password = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginId);
			preparedStatement.setString(2, password);

			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				loginDTO.setLoginId(resultSet.getString("login_id"));
				loginDTO.setPassword(resultSet.getString("password"));
				loginDTO.setUserName(resultSet.getString("user_name"));
				loginDTO.setUserId(resultSet.getInt("user_id"));

				if(!(resultSet.getString("login_id").equals(null))) {
					loginDTO.setLoginFlg(true);
				}
			}

		} catch(Exception e) {
			e.printStackTrace();
		}

		return loginDTO;
	}

	public LoginDTO getLoginDTO() {
		return loginDTO;
	}
}
