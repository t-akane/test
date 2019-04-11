package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyItemDAO {

	public BuyItemDTO getBuyItemInfo(){
		//引数なし
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
			//DAOの結果をDTOするけど、DAOの中でもDTOしている
			//1回の処理につき、2回DTOするということなのか？
		}

	}catch(Exception e){
		e.printStackTrace();
	}
	return buyItemDTO;

}
}


