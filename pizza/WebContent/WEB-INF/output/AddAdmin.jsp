<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
  <%@include file="css/index.css" %>
  <%@include file="css/addstore.css" %>
</style>
</head>
<header>
<img src="https://images.vexels.com/media/users/3/131778/isolated/preview/2f58b79f41ddd2cf40e188c533a7f751-pizza-logo-template-by-vexels.png" class="logo"/>
<body><center>
<H1><span class="clrchange">ADD Pizza Store</span></H1></center><br/>
<div  class="b1 addst">
<form action="addstore">
name:<input type="text" name="name"><br/>
street:<input type="text" name="street"><br/>
mobileNo:<input type="text" name="mobileNo"><br/>
city:<input type="text" name="city"><br/>
state:<input type="text" name="state"><br/>
pincode:<input type="text" name="pincode"><br/>
<button type="submit">Add</button><br/>
</form></div>
</header>
</body>
</html>