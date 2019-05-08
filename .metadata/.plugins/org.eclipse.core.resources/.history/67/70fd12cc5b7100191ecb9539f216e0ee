package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.LoginDTO;
import com.internousdev.ecsite.util.DBConnector;

public class LoginDAO {

	DBConnector dbConnector=new DBConnector();
	Connection connection=dbConnector.getConnection();
	LoginDTO loginDTO=new LoginDTO();

	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){

		String sql="SELECT*FROM login_user_transaction6 where login_id=? AND login_pass=?";
		//後にプレイスホルダで置換する値がある列のみ。whereで指定している

	try{
		PreparedStatement preparedStatement=connection.prepareStatement(sql);

		preparedStatement.setString(1, loginUserId);
		preparedStatement.setString(2, loginPassword);
		//sqlの？部分、プレイスホルダに値を挿入している

		ResultSet resultSet=preparedStatement.executeQuery();

		if(resultSet.next()){
			loginDTO.setLoginId(resultSet.getString("login_id"));
			loginDTO.setLoginPassword(resultSet.getString("login_pass"));
			loginDTO.setUserName(resultSet.getString("user_name"));


			if(!(resultSet.getString("login_id").equals(null))){
				loginDTO.setLoginFlg(true);
				//idが空欄でなければ、true。ただ、初期値がfalseなので、
				//ログインが成功しなければtrueにはならない。
				//ユーザーが増えたときに、ログインユーザーログイン状況の識別のためのフラッグ。
			}
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	return loginDTO;

}

	public LoginDTO getLoginDTO(){
		return loginDTO;
		//初級から、ここだけ増えた。
	}
}


