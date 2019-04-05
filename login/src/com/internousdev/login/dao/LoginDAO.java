package com.internousdev.login.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.login.dto.LoginDTO;
import com.internousdev.login.util.DBConnector;

public class LoginDAO {

	public LoginDTO select(String name,String password)throws SQLException{
		//クラスの入れ子。DAOのなかにDTO。セレクトだから文字列を返す。それをDTOにまたいれる？

		LoginDTO dto=new LoginDTO();
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		//DBにアクセスするクラスだからコネクション記述している

		String sql="select*from user where user_name=? and password=?";
		//？に↓のをいれる

	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, password);

		ResultSet rs=ps.executeQuery();

		if(rs.next()){
			dto.setName(rs.getString("user_name"));
			dto.setPassword(rs.getString("password"));
			//DBの中で、該当箇所があるまで列を下にどんどん移動する。
		}
		}catch(SQLException e){
			e.printStackTrace();

			//上部でthrowsしているのにtrycatchなのはなぜ
		}finally{
	}con.close();
	return dto;
}
}



