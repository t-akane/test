package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;


public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{

	private String itemName;
	private int itemPrice;
	private int itemStock;

	public Map<String,Object>session;


	public String execute()throws SQLException{

		ItemCreateCompleteDAO itemCreateCompleteDAO=new ItemCreateCompleteDAO();
//		createItem(String itemName,int itemPrice,int itemStock)
		//DAOを経由して、入力された内容をDBに登録
		itemCreateCompleteDAO.createItem(
				session.get("itemName").toString(),
				Integer.parseInt(session.get("itemPrice").toString()),
				Integer.parseInt(session.get("itemStock").toString()));
		//intにするときは、一度toStringで文字列にしたものをIntegerする

		String result =SUCCESS;
		return result;
	}

//以下テンプレのセッターゲッター

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

	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}

}
