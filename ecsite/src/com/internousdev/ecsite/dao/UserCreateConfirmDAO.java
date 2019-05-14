package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class UserCreateConfirmDAO{

	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();

	private String sql="SELECT count(id) as count from login_user_transaction6 where login_id=?";

	public boolean isExistsUserInfo(String userId) {

		boolean result = false;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				if (rs.getInt("count") > 0) {
					result = true;
				}
				//isExistsUserInfoメソッド。既存かどうか判定。初期値は重複しない。trueのときはじく。
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}