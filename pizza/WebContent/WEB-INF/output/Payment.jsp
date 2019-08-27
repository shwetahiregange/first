<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<body>
<h1>Payment</h1>
<script type="text/javascript">

function home(){
	
	alert("Paid Successfully");
window.location.replace("../index.jsp");
}

</script>
<form action="payment">
<!-- userID:<input type="text" name="userID"><br/> -->
cardName:<input type="text" name="cardName" ><br/>
creditcard:<input type="text" name="creditcard"><br/>
cvv:<input type="text" name="cvv"><br/>
validFrom:<input type="text" name="validFrom"><br/>
validTo:<input type="text" name="validTo"><br/>
balance:<input type="text" name="balance"><br/>
<button onclick="home()">pay</button><br/>
</form>
</body>
</html>