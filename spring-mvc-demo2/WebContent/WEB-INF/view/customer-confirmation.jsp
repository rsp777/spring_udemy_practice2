<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Validation Example</title>
</head>
<body>
    <h1>Customer Validation Example</h1>
	<h3>The <i>customer</i> is confirmed : ${customer.firstName} ${customer.lastName}.</h3>
	Free Passes : ${customer.freePasses}.
	<br><br>
	Postal Code : ${customer.postalCode}.
	<br><br>
	Course Code : ${customer.courseCode}.
</body>
</html>