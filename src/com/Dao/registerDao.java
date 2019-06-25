package com.Dao;

import java.sql.Connection;
import java.sql.ResultSet;

import com.DBUtil.jdbc;
import com.mysql.jdbc.Statement;

public class registerDao {
	private Connection connection=null;
	private Statement statement=null;
	private ResultSet resultSet=null;
	
	public boolean updata(String logname,String password,String email,String realname,String phone,String address) {
		boolean boo=false;
		try {
			new jdbc();
			connection=jdbc.getConnection();
			statement=(Statement) connection.createStatement();
			String inset_sql="INSERT INTO user VALUES" +				//(logname,password,email,phone,address,realname)
					"(\""+logname+"\",\""+password+"\",\""+email+"\",\""+phone+"\",\""+address+"\",\""+realname+"\")";
			if(logname!=null&&password!=null){
				statement.execute(inset_sql);
				boo=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return boo;
	}
}
