<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Pizza Ordering System</title>
	<style type="text/css">
  <%@include file="css/index.css" %>
</style>
</head>
<body>
<header>
<img src="https://images.vexels.com/media/users/3/131778/isolated/preview/2f58b79f41ddd2cf40e188c533a7f751-pizza-logo-template-by-vexels.png" class="logo"/>
<center>
<H1><span class="clrchange">Pizza Ordering System</span></H1><br/></center><br/><br/><br/>
<div  class="b1">
<form action="admin/reg" >
<button type="submit" > Admin</button>
</form>
<form action="customer/reg" >
<button type="submit" > Customer</button>
</form>
</div>
</header>
</body>
</html>