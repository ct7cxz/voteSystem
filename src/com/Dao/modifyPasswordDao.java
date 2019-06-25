package com.Dao;

import java.sql.Connection;
import java.sql.ResultSet;

import com.DBUtil.jdbc;
import com.mysql.jdbc.Statement;

public class modifyPasswordDao {
	private static Connection connection=null;
	private static Statement statement=null;
	private static ResultSet resultSet=null;
	
	public static boolean search(String logname,String oldPassword){
		boolean boo=false;
		try{
			String password;
			connection=jdbc.getConnection();
			statement=(Statement) connection.createStatement();
			System.out.println(logname);
			String search_sql="SELECT password FROM user where logname="+logname+"";
			resultSet=statement.executeQuery(search_sql);
			
			while(resultSet.next()){
				password=resultSet.getString("password");
				if(password.equals(oldPassword)){
					boo=true;
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return boo;
	}
	
	public static boolean updata(String logname,String newPassword1){
		boolean boo=false;
		try{
			connection=jdbc.getConnection();
			statement=(Statement) connection.createStatement();
			System.out.println("logname "+logname);
			System.out.println("newpassword "+newPassword1);
			String updata_sql="UPDATE user SET password=\""+newPassword1+"\" WHERE logname=\""+logname+"\" ";
			
			statement.execute(updata_sql);
			
			boo=true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return boo;
		
	}
}
