package com.internousdev.login.action;
import java.sql.SQLException;

import com.internousdev.login.dao.LoginDAO;
import com.internousdev.login.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String name;
	private String password;

	public String execute()throws SQLException{
		//例外処理はsqlにまる投げする

		String ret=ERROR;
		//初期値

		LoginDAO dao=new LoginDAO();
		LoginDTO dto=new LoginDTO();

		dto=dao.select(name,password);
		//daoした結果のnameとpasswordをdtoにいれて実行する

		if(name.equals(dto.getName())){
			if(password.equals(dto.getPassword())){
				ret=SUCCESS;
				//dtoで実行したname、passwordがこのメソッド内のname、passwordと同じであればサクセス
			}
		}return ret;
		//これなに
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	//ゲッターセッターというのは特定の目的のために設置するというよりは、
	//アクセスされる可能性があるから間口あけとこう的なものなのですか

	}


