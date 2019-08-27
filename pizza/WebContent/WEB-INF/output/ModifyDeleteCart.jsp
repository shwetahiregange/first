<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.lnt.pos.bean.ProfileBean" %>
     <%@page import="com.lnt.pos.bean.FoodBean" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<h1>Modify Cart</h1>
<%ArrayList<FoodBean> fb=(ArrayList<FoodBean>)request.getAttribute("vallf"); 
Iterator itr=fb.iterator();
FoodBean ff=new FoodBean();%>

<form action="modifycart">

cartID:<input type="test" name="cartID"><br/>
userID:<input type="text" name="userID"><br/>
foodID:<input type="text" name="foodID"><br/>	 
select name:<select name="name" >
<%while(itr.hasNext())
{
	ff=(FoodBean)itr.next();
	%>
	 <option value="<%=ff.getName() %>"><%=ff.getName() %></option>
	 <%} %>
	 </select><br/>
select size:<select name="foodSize">
	 <option value="small">small</option>
	 <option value="medium">medium</option>
	 <option value="large">large</option>
	 </select><br/>
quantity:<input type="text" name="quantity"><br/>
orderDate:<input type="text" name="orderDate"><br/>
<!-- cost:<input type="text" name="cost"><br/> -->
<button type="submit">Modify</button><br/>
</form><br/>

<h1>Delete Cart</h1>
<%ArrayList<ProfileBean> pb=(ArrayList<ProfileBean>)request.getAttribute("vpf"); 
Iterator itr1=pb.iterator();
ProfileBean pp=new ProfileBean();%>
<form action="deletecart">
UserID : 
<select name="userID">
<%while(itr1.hasNext())
{
	pp=(ProfileBean)itr1.next();%>
<option  value="<%=pp.getUserID() %>"><%=pp.getUserID() %>

<%} %>
</option>
</select>
Enter CartID:<input type="text" name="cartID"><br/>
<button type="submit">Delete</button><br/>
</body>
</html>