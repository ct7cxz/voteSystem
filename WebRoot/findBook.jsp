<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <%@ taglib tagdir="/WEB-INF/tags" prefix="showBookByPage"%> --%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/head.txt" %>
<title>Insert title here</title>
</head>
<body><center>
<form action="-">
输入查询内容:<input type=text name="findContent" value="java">
<select name="condition" size=3>
<option Selected value="bookISBN">ISBN</option>
	<option value="bookName">书名</option>
	<option value="bookAuthor">作者</option>
</select>
<br>
<input type="radio" name="findMethod" value="start">前方一致
<input type="radio" name="findMethod" value="end">前方一致
<input type="radio" name="findMethod" value="contains">前方一致
<input type=submit value="提交">
</form>
<%
String findContent=request.getParameter("findContent");
String condition=request.getParameter("condition");
String findMethod=request.getParameter("findMethod");
if(findContent==null){
	findContent="";
}
if(condition==null){
	condition="";
}
if(findMethod==null){
	findMethod="";
}
%>
<br>查询到的图书:
<findBook:findBook dataSource="bookshop" tableName="bookForm" 
findContent="<%=findContent%>" condition="<%=condition%>" findMethod="<%=findMethod%>"/>
<%-- <br><%=giveResult%> --%>
</center>

</body>
</html>