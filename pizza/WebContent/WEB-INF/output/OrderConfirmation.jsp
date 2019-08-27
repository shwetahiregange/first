<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.lnt.pos.bean.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<h1>ORDER CONFIRMATION</h1>
<form action="confirmorder">
<%ArrayList<CartBean> cb=(ArrayList<CartBean>)request.getAttribute("vc"); 
Iterator itr3=cb.iterator();
CartBean cc=new CartBean();%>
CartID : 
<select name="cartID">
<%while(itr3.hasNext())
{
	cc=(CartBean)itr3.next();%>
<option  value="<%=cc.getCartID() %>"><%=cc.getCartID() %>

<%} %>
</option>
</select><br/>
<%ArrayList<ProfileBean> pb=(ArrayList<ProfileBean>)request.getAttribute("vpf"); 
Iterator itr1=pb.iterator();
ProfileBean pp=new ProfileBean();%>
UserID : 
<select name="userID">
<%while(itr1.hasNext())
{
	pp=(ProfileBean)itr1.next();%>
<option  value="<%=pp.getUserID() %>"><%=pp.getUserID() %>

<%} %>
</option>
</select><br/>
<%ArrayList<StoreBean> al=(ArrayList<StoreBean>)request.getAttribute("vas");
Iterator itr2=al.iterator();
StoreBean sb=new StoreBean();%>
StoreID : 
<select name="storeID">
<%while(itr2.hasNext())
{
	sb=(StoreBean)itr2.next();%>
<option  value="<%=sb.getStoreID() %>"><%=sb.getStoreID() %>

<%} %>
</option>
</select><br/>
orderDate:<input type="text" name="orderDate"><br/>
street:<input type="text" name="street"><br/>
city:<input type="text" name="city"><br/>
state:<input type="text" name="state"><br/>
pincode:<input type="text" name="pincode"><br/>
MobileNo:<input type="text" name="mobileNo"><br/>
<button type="submit">Confirm Order</button><br/>
</form>
</body>
</html>