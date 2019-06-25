<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <%@ taglib tagdir="/WEB-INF/tags" prefix="previewOrderForm"%> --%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/head.txt" %>
<title>当前订单(预览)</title>
<%
String logname=(String)session.getAttribute("logname");
if(logname!=null){
	int m=logname.indexOf(",");
	logname=logname.substring(0,m);
	%>
	<previewOrderForm:PreviewOrderForm logname="<%=logname%>"/>;
<html>
<body>
<head><center>
<h3>单击“提交订单”按钮将确认订单</h3>
<form action="makeBookForm.jsp">
<input type=hidden name="confirm" value="buy">
<%-- <input type=hidden name="orderContent" value="<%=giveResult%>">
<input type=hidden name="totalPrice" value="<%=totalPrice%>"> --%>
<center><input type=submit name="g" value="提交订单"></center>
</form>
订单信息:<br>
<table border=2>
<tr><th>订购信息</th>
<th>总价格</th>
</tr>
<tr>
<td><%-- <%=giveResult%> --%></td>
<td><%-- <%=totalPrice%> --%></td>
</tr>
</table>
</head>
</center>
</body>
</html>
<%}
else{
	response.sendRedirect("login.jsp");
}
%>