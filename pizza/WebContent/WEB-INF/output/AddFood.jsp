<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<H1>ADD Pizza Food</H1><br/>
<form action="addfood">
storeID :<input type="text" name="storeID"><br/>
name:<input type="text" name="name"><br/>
type:<input type="text" name="type"><br/>
foodSize:<select name="foodSize">
<option value="small">small</option>
<option value="medium">medium</option>
<option value="large">large</option>
</select><br>
quantity:<input type="text" name="quantity"><br/>
price:<input type="text" name="price"><br/>
<button type="submit">Add</button><br/>
</form>
</body>
</html>