package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;
import com.internousdev.template.util.DateUtil;

public class BuyItemCompleteDAO {
	private DateUtil dateUtil=new DateUtil();

	private String sql="INSERT INTO user_buy_item_transaction5(item_transaction_id,total_price,total_count,user_master_id,pay,insert_date)VALUES(?,?,?,?,?,?)";
	public void buyItemInfo(String item_transaction_id,String total_price,String total_count,String user_master_id,String pay)throws SQLException{
			//infoはメソッド（）内は5つの引数　順不同
			//INFOの中の引数は、のちにsqlにinsertされる
			DBConnector dbConnector=new DBConnector();
			Connection connection=dbConnector.getConnection();

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,item_transaction_id);
			preparedStatement.setString(2,total_price);
			preparedStatement.setString(3, total_count);
			preparedStatement.setString(4, user_master_id);
			preparedStatement.setString(5, pay);
			preparedStatement.setString(6, dateUtil.getDate());
			//6つめは引数なし

			preparedStatement.execute();
			//tryの中は、例外が発生する可能性のある処理

	}catch(Exception e){
		e.printStackTrace();
		//catchの中は、例外が発生したときに実際どのような処理を行うか
		//スタックトレースは、全ての例外処理が持っているコマンド
		//そのままエラーの値を返す
	}finally{
		connection.close();
	}
}
}

