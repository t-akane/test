package com.internousdev.login.dto;

public class LoginDTO {
	private int id;
	private String name;
	private String password;

	//action,DAO,DTOの順番。
	//DTOは贈答箱

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
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


}
