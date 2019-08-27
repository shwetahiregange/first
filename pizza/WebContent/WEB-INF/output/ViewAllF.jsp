<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="com.lnt.pos.bean.FoodBean" %>
<%@page import="java.util.*" %>
<html>
<body>
<%ArrayList<FoodBean> al=(ArrayList<FoodBean>)request.getAttribute("valf");
Iterator itr=al.iterator();
%>
<table border="4">
<tr><th>FoodID</th><th>name</th><th>type</th><th>foodSize</th><th>quantity</th><th>price</th></tr>
<%FoodBean ffb=new FoodBean();
while(itr.hasNext())
{
	ffb=(FoodBean)itr.next();
%>
<tr><td><%=ffb.getFoodID() %></td><td><%=ffb.getName() %></td><td><%=ffb.getType() %></td><td><%=ffb.getFoodSize() %></td><td><%=ffb.getQuantity() %></td><td><%=ffb.getPrice() %></td></tr>
<%} %>
</table>
</body>
</html>