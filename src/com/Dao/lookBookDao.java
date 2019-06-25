package com.Dao;

import java.sql.Connection;
import java.sql.ResultSet;

import com.DBUtil.jdbc;
import com.mysql.jdbc.Statement;

public class lookBookDao {
	private static Connection connection=null;
	private static Statement statement=null;
	private static ResultSet resultSet=null;
	
	public static ResultSet getSearch(){
		try {
			connection=jdbc.getConnection();
			statement=(Statement) connection.createStatement();
			String search_sql="SELECT * FROM bookform";
			
			resultSet=statement.executeQuery(search_sql);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultSet;
	}
}
