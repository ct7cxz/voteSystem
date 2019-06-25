package com.Dao;

import java.sql.Connection;
import java.sql.ResultSet;

import com.DBUtil.jdbc;
import com.mysql.jdbc.Statement;

public class loginDao {
	private Connection connection=null;
	private Statement statement=null;
	private ResultSet resultSet=null;
	
	public boolean search(String logname,String password){
		boolean boo=false;
		try{
			new jdbc();
			connection=jdbc.getConnection();
			statement=(Statement) connection.createStatement();
			String search_sql="SELECT logname,password FROM user";
			
			resultSet=statement.executeQuery(search_sql);
			while(resultSet.next()){
				String _logname=resultSet.getString("logname");
				String _password=resultSet.getString("password");
				
				System.out.println("Dao"+_logname);
				System.out.println("Dao"+_password);
				
				if(_logname.equals(logname)&&_password.equals(password)){
					boo=true;
					jdbc.close(resultSet, statement, connection);
					break;
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return boo;
	}
}
