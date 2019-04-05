package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.LoginDTO;
import com.internousdev.template.util.DBConnector;

public class LoginDAO {

	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){

		//→DTOの中に、いずれ格納するデータだから、DTOと名前をつけている
		//これもアクションでアクセスされる原本になる。
		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnection();
		LoginDTO loginDTO=new LoginDTO();
		//最上部でimportしているDTOはここで使用している。
		String sql="SELECT*FROM login_user_transaction5 where login_id=? AND login_pass=?";

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
}


