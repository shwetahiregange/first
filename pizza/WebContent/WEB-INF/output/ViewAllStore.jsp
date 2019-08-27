<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="com.lnt.pos.bean.StoreBean" %>
<%@page import="java.util.*" %>
<html>
<body>
<%ArrayList<StoreBean> al=(ArrayList<StoreBean>)request.getAttribute("vas");
Iterator itr=al.iterator();
%>
<table border="4">
<tr><th>StoreID</th><th>Name</th><th>Street</th><th>Mobile no</th><th>City</th><th>State</th><th>Pincode</th></tr>
<%StoreBean sb=new StoreBean();
while(itr.hasNext())
{
	sb=(StoreBean)itr.next();
%>
<tr><td><%=sb.getStoreID() %></td><td><%=sb.getName() %></td><td><%=sb.getStreet() %></td><td><%=sb.getMobileNo() %></td><td><%=sb.getCity() %></td><td><%=sb.getState() %></td><td><%=sb.getPincode() %></td></tr>
<%} %>
</table>
</body>
</html>