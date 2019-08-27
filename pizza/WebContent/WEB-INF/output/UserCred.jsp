<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.lnt.pos.bean.ProfileBean" %>
<!DOCTYPE html>
<html>
<body>
<form action="usercred">
 <%String s=request.getAttribute("uid").toString(); %> 
	UserId:<input type="text" name="userID"  value="<%=Integer.parseInt(s)%>" readonly> 
	password:<input type="password" name="password"><br/>
	UserType:<input type="text" name="userType"><br/>
	Login status:<input type="number" name="loginStatus"><br/>
	<button type="submit">Submit</button>
</form>

</body>
</html> 