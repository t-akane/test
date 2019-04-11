package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyItemDAO {

	public BuyItemDTO getBuyItemInfo(){
		//LoginDAOと違って、()内に値がない

		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnection();
		BuyItemDTO buyItemDTO=new BuyItemDTO();
		//最上部でimportしているDTOはここで使用している。
		String sql="SELECT id,item_name,item_price FROM item_info_transaction6";



	try{
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		ResultSet resultSet=preparedStatement.executeQuery();

		if(resultSet.next()){
			buyItemDTO.setId(resultSet.getInt("id"));
			buyItemDTO.setItemName(resultSet.getString("item_name"));
			buyItemDTO.setItemPrice(resultSet.getString("item_price"));
			//test code
			System.out.println(buyItemDTO.getId());
			System.out.println(buyItemDTO.getItemName());
			System.out.println(buyItemDTO.getItemPrice());
			//test code
		}

	}catch(Exception e){
		e.printStackTrace();
	}
	return buyItemDTO;

}
}


