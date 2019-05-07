package com.internousdev.ecsite.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class ItemCreateConfirmAction extends ActionSupport implements SessionAware{
	private String itemName;
	private int itemPrice;
	private int itemStock;
	public Map<String,Object>session;
	private String errorMessage;

	public String execute(){

		String result=SUCCESS;

		System.out.println(itemName);
		System.out.println(itemPrice);
		System.out.println(itemStock);
		if(!(itemName.equals(""))
				&&!(itemPrice==0)
				&&!(itemStock==0)){
			//もしすべて空欄ではなかった場合、下を実行
				session.put("itemName", itemName);
				session.put("itemPrice", itemPrice);
				session.put("itemStock", itemStock);
			//ここで、Map型の中に値を代入している
		}else{
			setErrorMessage("未入力の項目があります。");
			result=ERROR;
		}
				return result;
	}


	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName=itemName;
	}

	public int getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(int itemPrice){
		this.itemPrice=itemPrice;
	}
	public int getItemStock(){
		return itemStock;
	}
	public void setItemStock(int itemStock){
		this.itemStock=itemStock;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
	//ここの意味が良くわからない。

	public String getErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
			this.errorMessage=errorMessage;
		}
}
