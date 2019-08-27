<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h1>Modify 	Order</h1>
<form action="modifyorder">
orderID:<input type="test" name="orderID"><br/>
orderStatus:<select name="orderStatus">
	 <option value="pending">pending</option>
	 <option value="Dispatched">Dispatched</option>
	 <option value="Cancelled">Cancelled</option>
	 </select><br/>
<button type="submit">Modify</button><br/>
</form>
</body>
</html>