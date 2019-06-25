package com.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class jdbc {
	public static final String JDBC_DRIVER="com.mysql.jdbc.Driver";   //Çý¶¯
	public static final String DB_URL="jdbc:mysql://localhost:3306/bookshop";  //Êý¾Ý¿âURL
	
	public static final String USER="root";
	public static final String PASS="root";
	
	public static Connection connection;
	
	public static Connection getConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			connection=DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void close(Statement statement,Connection connection){
		if(statement!=null){
			try{
				statement.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(connection!=null){
			try{
				connection.close();
			}catch(SQLException exception){
				exception.printStackTrace();
			}
		}
	}
	
	public static void close(ResultSet resultSet,Statement statement,Connection connection){
		if(resultSet!=null){
			try{
				resultSet.close();
			}catch (SQLException e) {
				e.printStackTrace();
	
			}
		}
		if(statement!=null){
			try{
				statement.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(connection!=null){
			try{
				connection.close();
			}catch(SQLException exception){
				exception.printStackTrace();
			}
		}
	}
}
