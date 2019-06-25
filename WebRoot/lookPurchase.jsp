<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>查看购物车</title>
  </head>
  <%
  	String[] bookISNB=(String[])session.getAttribute("buybookISNB");
  	String[] bookName=(String[])session.getAttribute("buybookName");
  	Float[] bookPrice=(Float[])session.getAttribute("buybookPrice");
  	Integer[] bookNum=(Integer[])session.getAttribute("buybookNum");
  	double price=0;
   %>
  <body>
    <center>
    	<h1>已购买商品</h1><br><br>
    	<%
    		for(int i=0;i<bookISNB.length;i++){
    			%>
    			<div>书名：<%=bookName[i] %>&emsp;书的价格:<%=bookPrice[i] %>&emsp;&emsp;<%=bookNum[i] %>本</div><br>
    			
    			<%
    			price=price+bookPrice[i]*bookNum[i];
    		}
    	 %>
    	 <br><br>
    	 <div>总价:<%=price %></div>
    </center>
  </body>
</html>
