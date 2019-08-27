<%@page import="com.lnt.pos.bean.*" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<H1>DELETE Pizza Food</H1><br/>
<%ArrayList<StoreBean> sb=(ArrayList<StoreBean>)request.getAttribute("valls"); 
//ArrayList<FoodBean> fb=(ArrayList<FoodBean>)request.getAttribute("vallf");
Iterator itr=sb.iterator();
StoreBean ss=new StoreBean();%>
<form action="deletefood">

Store ID : 
<select name="storeID">
<%while(itr.hasNext())
{
	ss=(StoreBean)itr.next();%>
<option  value="<%=ss.getStoreID() %>"><%=ss.getStoreID() %>

<%} %>
</option>
</select>
Enter FoodID:<input type="text"  name="foodID"><br/>


<br/>
<button type="submit">Delete</button><br/>
</form>
</body>
</html>