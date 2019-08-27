<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<form action="newreg">
	FirstName:<input type="text" name="firstName"><br/>
	LastName:<input type="text" name="lastName"><br/>
	DOB:<input type="text" name="dateOfBirth"><br/>
	select Gender:<input type="radio" name="gender" value="male">MALE
				<input type="radio" name="gender" value="female">FEMALE<br/>
	street:<input type="text" name="street"><br/>
	location:<input type="text" name="location"><br/>
	city:<input type="text" name="city"><br/>
	state:<input type="text" name="state"><br/>
	pincode:<input type="text" name="pincode"><br/>
	MobileNo:<input type="text" name="mobileNo"><br/>
	EmailId:<input type="text" name="emailID"><br/>
	<button type="submit">Submit</button>

</form>

</body>
</html>