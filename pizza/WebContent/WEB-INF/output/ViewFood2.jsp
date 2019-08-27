<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="com.lnt.pos.bean.FoodBean" %>
<html>
<body>
<%
FoodBean fb=(FoodBean)request.getAttribute("vf");

%>
<table border="4">
<tr><th>FoodID</th><th>name</th><th>type</th><th>foodSize</th><th>quantity</th><th>price</th></tr>
<tr><td><%=fb.getFoodID() %></td><td><%=fb.getName() %></td><td><%=fb.getType() %></td><td><%=fb.getFoodSize() %></td><td><%=fb.getQuantity() %></td><td><%=fb.getPrice() %></td></tr>
</table>
</body>
</html>