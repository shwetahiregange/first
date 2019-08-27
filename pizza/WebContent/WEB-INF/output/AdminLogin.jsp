<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
<%@include file="css/index.css" %>
  <%@include file="css/adminlogin.css" %>
</style>
</head>
<body>
<header>
<img src="https://images.vexels.com/media/users/3/131778/isolated/preview/2f58b79f41ddd2cf40e188c533a7f751-pizza-logo-template-by-vexels.png" class="logo"/>
<H1><span class="clrchange">Welcome to Administrator login</span></H1><br/>

<form action="login">
<div  class="b1 info">
<div class="inp">
<label for="usr">UserName:
<input type="text" id="usr" name="usr"></label><br/>
<label for="pass">Password:
<input type="password" id="pass"  name="pass"></label><br/></div>
<button type="submit" >Login</button><br/></div>
</form>
</header>
</body>
</html>