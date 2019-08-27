<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
<%@include file="css/index.css" %>
  <%@include file="css/adminlogin.css" %>
  <%@include file="css/customerlogin.css" %>
</style>
</head>
<body>
<header>
<img src="https://images.vexels.com/media/users/3/131778/isolated/preview/2f58b79f41ddd2cf40e188c533a7f751-pizza-logo-template-by-vexels.png" class="logo"/>
<h1><span class="clrchange">Welcome to Customer login</span></h1>
<div  class="b1 info">
<form action="cuslog">
UserName:<input type="text" name="usr"><br/>
Password:<input type="password" name="pass"><br/>
<button type="submit">Login</button><br/>
</form><br/>
<!-- <form action="viewallf">
<button type="submit">view all food</button>
</form><br/>
<form action="viewallp">
<button type="submit">view all profile</button>
</form><br/>
<form action="viewallstore">
<button type="submit">view all store</button>
</form><br/> -->

<form action="userreg">
New User ? Click here to<button type="submit">Register</button>
</form></div>
</header>
</body>
</html>