<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.lnt.pos.bean.FoodBean" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<h1>Add to Cart</h1>
<%ArrayList<FoodBean> fb=(ArrayList<FoodBean>)request.getAttribute("vallf"); 
Iterator itr=fb.iterator();
FoodBean ff=new FoodBean();%>
<form action="atc">
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
<button type="submit">Add</button><br/>
</form><br/>
</body>
</html>