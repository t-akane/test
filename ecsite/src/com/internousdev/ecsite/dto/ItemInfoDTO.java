package com.internousdev.ecsite.dto;

public class ItemInfoDTO {

	public String itemName;
	public int itemPrice;
	public int itemStock;

	public String id;
	public String insert_date;
	//お手本ではPriceもStockも全部Stringになってるけど、変更しなきゃだめ？


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

	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id=id;
	}

	public String getInsert_date(){
		return this.insert_date;
	}
	public void setInsert_date(String insert_date){
		this.insert_date=insert_date;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	private String update_date;



}
