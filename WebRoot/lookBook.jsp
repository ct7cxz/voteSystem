<%@page import="java.sql.ResultSet"%>
<%@page import="com.Dao.lookBookDao"%>
<%@page import="com.DBUtil.jdbc"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body><center>
<br>

<%
	ResultSet resultSet=null;
	resultSet=lookBookDao.getSearch();
	
	String bookISBN;
	String bookName;
	String bookAuthor;
	float bookPrice;
	String bookPublish;
 %>
 <form method="post" action="lookBookServlet" name="form">
 	<h1>浏览图书</h1><br><br>
 	<%
 		while(resultSet.next()){
 			bookISBN=resultSet.getString("bookISBN");
 			bookName=resultSet.getString("bookName");
 			bookAuthor=resultSet.getString("bookAuthor");
 			bookPrice=resultSet.getFloat("bookPrice");
 			bookPublish=resultSet.getString("bookPublish");
 	%>
   <div><%=bookISBN %>&emsp;<%=bookName %>&emsp;<%=bookAuthor %>&emsp;<%=bookPrice %>&emsp;<%=bookPublish %>&emsp;<input type="text" value="0" name="<%=bookISBN%>"></div><br><br>
 			
 				
 	<%
 		}
 	 %>
 	 <input type="submit" value="提交到购物车">
</form>

</center>

</body>
</html>