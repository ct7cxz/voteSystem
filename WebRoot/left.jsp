<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    
	
	<link rel="stylesheet" type="text/css" href="css/left.css">
	

  </head>
  
  <body>
  	<div class="wai">
  		<div class="top" style="text-align: center;">网&emsp;上&emsp;书&emsp;城</div><center>
  		<div class="font top1">浏览图书</div>
  		<div class="font top2">去购物车</div>
  		<div class="font top3">修改信息</div>
  		<div class="font top4">修改密码</div>
  		<div class="font top5">退出登录</div></center>
  	</div>
  	
  </body>
</html>
