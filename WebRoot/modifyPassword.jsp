<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>修改密码</h1>
</center>
<div align="center">
	<div style="font-size: 25">请输入您的当前密码与新密码</div><br>
	<form action="modifyPasswordServlet" method="post" name="form">
		 当前密码:<input type="password" name="oldPassword"><br>
		 新密码:<input type="password" name="newPassword1"><br>
		 确认新密码:<input type="password" name="newPassword2"><br>
		 <input type="submit" value="提交">
	</form>
</div>
</body>
</html>