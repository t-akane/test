package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{
	public Map<String,Object>session;

	public String execute(){
		String result="login";
		//ここで指定したloginというのは、どこのファイルにつながるのだろうか
		if(session.containsKey("id")){
			//containskey　指定した値があればtrue、なければfalse

			//以下、ログイン済み判定を行うための記述
			//一度ログインしている場合は、商品画面にすぐ遷移できる。
			BuyItemDAO buyItemDAO=new BuyItemDAO();
			BuyItemDTO buyItemDTO=buyItemDAO.getBuyItemInfo();
			//DAOの結果を、DTOする
			session.put("id",buyItemDTO.getId());
			session.put("buyItem_name", buyItemDTO.getItemName());
			session.put("buyItem_price", buyItemDTO.getItemPrice());
			//DBから取得した商品情報をセッションに格納している

		result=SUCCESS;

		}
		return result;
	}
		@Override
		public void setSession(Map<String,Object>session){
			this.session=session;
		}
		public Map<String,Object>getSession(){
			return this.session;
		}
}
