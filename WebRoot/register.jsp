<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.lang.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body background="img/new4.jpg">
<center>
<h1>注册新用户</h1>
	<form action="registerServlet" name="form" method="post">
		输入用户信息，用户信息不能包含逗号，带*号项必须填写.<br>
		用户名称：<input type="text" name="logname">*<br><br>
		设置密码：<input type="password" name="password">*<br><br>
		电子邮件：<input type="text" name="email"><br><br>
		真实姓名：<input type="text" name="realname"><br><br>
		联系电话：<input type="text" name="phone"><br><br>
		通讯地址：<input type="text" name="address"><br><br>
		<input type="submit" value="提交" name="g"><br><br>
	</form>
</center>

</body>
</html>