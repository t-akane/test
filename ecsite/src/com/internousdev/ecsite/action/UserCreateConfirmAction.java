package com.internousdev.ecsite.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCreateConfirmDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	private String userName;
	public Map<String,Object>session;
	private String errorMessage;


	UserCreateConfirmDAO userCreateConfirmDAO = new UserCreateConfirmDAO();
	//これの使い方




	public String execute(){

		String result=SUCCESS;



		if(!(loginUserId.equals(""))
				&&!(loginPassword.equals(""))
				&&!(userName.equals(""))){
			//もしIDとPWとUserNameがすべて空欄ではなかった場合、下を実行
			if(userCreateConfirmDAO.isExistsUserInfo(loginUserId)) {
				setErrorMessage("そのユーザーIDは使用できません。");
				result=ERROR;
			}else {
				session.put("loginUserId", loginUserId);
				session.put("loginPassword", loginPassword);
				session.put("userName", userName);
			}

			//ここで、Map型の中に値を代入している
		}else{
			setErrorMessage("未入力の項目があります。");
			result=ERROR;
		}
				return result;
	}


	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}

	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}

	public Map<String,Object>getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}

	public String getErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
			this.errorMessage=errorMessage;
		}
}
