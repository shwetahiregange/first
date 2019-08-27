<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="com.lnt.pos.bean.*" %>
<%@page import="java.util.*" %>
<html>
<body>
<%ArrayList<CartBean> al=(ArrayList<CartBean>)request.getAttribute("vc");
Iterator itr=al.iterator();
%>
<table border="4">
<tr><th>cartID</th><th>name</th><th>foodSize</th><th>quantity</th>
	<th>cost</th><th>orderDate</th><th>userID</th></tr>
<%CartBean cb=new CartBean();
while(itr.hasNext())
{
	cb=(CartBean)itr.next();
%>
<tr><td><%=cb.getCartID() %></td><td><%=cb.getName() %></td><td><%=cb.getFoodSize() %></td>
	<td><%=cb.getQuantity() %></td><td><%=cb.getCost() %></td><td><%=cb.getOrderDate() %></td>
	<td><%=cb.getPb().getUserID() %></td></tr>
<% } %>
</table>
</body>
</html>