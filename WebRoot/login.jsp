<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<link href="css/login.css"  rel="stylesheet" />
</head>
<body background="img/new4.jpg">
<br><br>
<div class="font">网上书城</div>
<div class="login" style="background: white;">
	<form action="loginServlet" method="post">
	<br>
	&emsp;用户名:<input type=text name="logname"><br><br>
	&emsp;密      &nbsp; 码:<input type=password name="password"><br>
	<br>

	&emsp;&emsp;&emsp;&emsp;&emsp;<input type=submit name="g" value="登录">&emsp;&emsp;
	<a href="register.jsp"><input type="button" name="" value="注册"></a>
	</form>
</div>

</body>
</html>