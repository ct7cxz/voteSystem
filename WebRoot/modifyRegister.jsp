<%@page import="java.sql.ResultSet"%>
<%@page import="com.Dao.modifyRegisterDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	String logname=new String();
	String email=new String();
	String realname=new String();
	String phone=new String();
	String address=new String();
	logname=(String)session.getAttribute("logname");
	ResultSet resultSet=null;
 %>
<body>
<center>
<h1>修改个人信息</h1>
<div>
	<div style="font-size: 25">您的历史信息:</div>
	<%
		resultSet=modifyRegisterDao.search(logname);
		while(resultSet.next()){
			email=(String)resultSet.getString("email");
			realname=(String)resultSet.getString("realname");
			phone=(String)resultSet.getString("phone");
			address=(String)resultSet.getString("address");
			%>
			<div>电子邮件:    <%=email %></div>
			<div>真实姓名:    <%=realname %></div>
			<div>联系电话:    <%=phone %></div>
			<div>通讯地址:    <%=address %></div>
			
			
			
			<%
		}
	 %>
</div><br><br>
<div>
	<div style="font-size: 25">请输入您的新信息:</div><br>
	<form action="modifyRegisterServlet" method="post" name="form">
		电子邮件:<input type="text" name="email"><br><br>
		真实姓名:<input type="text" name="realname"><br><br>
		联系电话:<input type="text" name="phone"><br><br>
		通讯地址:<input type="text" name="address"><br><br>
		<input type="submit" value="提交">
	</form>
</div>
</center>
</body>
</html>