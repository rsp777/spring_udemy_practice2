<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation Page</title>
</head>
<body>
	      The Student is confirmed : ${student.firstName} ${student.lastName}
	<br><br>
					      Country  : ${student.country}
	<br><br>
	Favourite Programming Language : ${student.favouriteLanguage}
	<br><br>
	    Favourite Operating Systems :
	    <ul>
	    	<c:forEach var="temp" items="${student.os}">
	    	<li>${temp}</li>
	    	</c:forEach>
	    </ul>	
</body>
</html>