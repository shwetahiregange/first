<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="com.lnt.pos.bean.OrderBean" %>
<%@page import="java.util.*" %>
<html>
<body>
<%ArrayList<OrderBean> al=(ArrayList<OrderBean>)request.getAttribute("vo");
Iterator itr=al.iterator();
%>
<table border="4">
<tr><th>OrderID</th><th>orderDate</th><th>totalPrice</th><th>orderStatus</th>
	<th>Mobile no</th><th>street</th><th>City</th><th>State</th><th>Pincode</th>
	<th>userID</th><th>storeID</th><th>cartID</th></tr>
<%OrderBean ob=new OrderBean();
while(itr.hasNext())
{
	ob=(OrderBean)itr.next();
%>
<tr><td><%=ob.getOrderID() %></td><td><%=ob.getOrderDate() %></td><td><%=ob.getTotalPrice() %></td>
	<td><%=ob.getOrderStatus() %></td><td><%=ob.getMobileNo() %></td><td><%=ob.getStreet() %></td>
	<td><%=ob.getCity() %></td><td><%=ob.getState() %></td><td><%=ob.getPincode() %></td>
	<td><%=ob.getPb().getUserID() %></td><td><%=ob.getSb().getStoreID() %></td><td><%=ob.getCb().getCartID() %></td></tr>
<%} %>
</table>
</body>
</html>