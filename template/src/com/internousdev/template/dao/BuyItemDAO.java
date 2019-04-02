package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.BuyItemDTO;
import com.internousdev.template.util.DBConnector;

public class BuyItemDAO {

	public BuyItemDTO getBuyItemInfo(){
		//LoginDAOと違って、()内に値がない。代入しないのかな？
		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnection();
		BuyItemDTO buyItemDTO=new BuyItemDTO();
		//最上部でimportしているDTOはここで使用している。
		String sql="SELECT id,item_name,item_price FROM item_info_transaction";
		//ログインダオと同じStrign sql=。でも右側がちがう。
		//変数の値はメソッド内しか有効じゃないから、値が違ってもいいのか。
		//セレクト文だから、指定した値を返してる。

	try{
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		ResultSet resultSet=preparedStatement.executeQuery();

		if(resultSet.next()){
			buyItemDTO.setId(resultSet.getInt("id"));
			buyItemDTO.setItemName(resultSet.getString("item_name"));
			buyItemDTO.setItemPrice(resultSet.getString("item_price"));
		}

	}catch(Exception e){
		e.printStackTrace();
	}
	return buyItemDTO;

}
}


