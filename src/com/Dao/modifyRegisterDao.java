package com.Dao;

import java.sql.Connection;
import java.sql.ResultSet;

import com.DBUtil.jdbc;
import com.mysql.jdbc.Statement;

public class modifyRegisterDao {
	private static Connection connection=null;
	private static Statement statement=null;
	private static ResultSet resultSet=null;
	
	public static ResultSet search(String logname){
		try{
			connection=jdbc.getConnection();
			statement=(Statement) connection.createStatement();
			String search_sql="SELECT phone,email,realname,address FROM user WHERE logname=\""+logname+"\"";
			
			resultSet=statement.executeQuery(search_sql);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultSet;
	}
	
	public static boolean updata(String logname,String phone,String email,String realname,String address){
		boolean boo=false;
		System.out.println(address);
		try{
			connection=jdbc.getConnection();
			statement=(Statement) connection.createStatement();
			String updata_sql="UPDATE user SET " +
					"phone=\""+phone+"\",email=\""+email+"\",realname=\""+realname+"\",address=\""+address+"\"" +
							" WHERE logname=\""+logname+"\"";
			statement.execute(updata_sql);
			boo=true;
			
			jdbc.close(statement, connection);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return boo;
	}
}
