package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	public Map<String,Object>session;
	private LoginDAO loginDAO=new LoginDAO();
	private LoginDTO loginDTO=new LoginDTO();
	private BuyItemDAO buyItemDAO=new BuyItemDAO();
	//初級では、したの3つはexecuteの中で演算子なしで実行されてた。

	public String execute(){
		//String executeって文字列として実行するって意味？

		String result=ERROR;
		loginDTO=loginDAO.getLoginUserInfo(loginUserId, loginPassword);
		session.put("loginUser",loginDTO);


		//入力力、ユーザー情報の検索を行っている。ログインが成功したら、次の画面で
		//商品情報が必要になるため商品情報を取得している
		if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
			result=SUCCESS;
			BuyItemDTO buyItemDTO=buyItemDAO.getBuyItemInfo();

			session.put("login_user_id",loginDTO.getLoginId());
			session.put("id",buyItemDTO.getId());
			session.put("buyItem_name",buyItemDTO.getItemName());
			session.put("buyItem_price",buyItemDTO.getItemPrice());
			//putでObjectがインスタンスの変数

			return result;
		}return result;
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

	public Map<String,Object>getSession(){
		return session;
	}

	@Override
	//親クラスのメソッド引用。親クラス・・ActionSupport？
	public void setSession(Map<String,Object>session){
		this.session=session;
	}

	}
