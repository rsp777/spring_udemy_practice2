<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	First Name : <form:input path = "firstName"/>
	<br><br>
	Last Name :  <form:input path="lastName"/>
	<br><br>
	Country:
	<form:select path = "country">
		<form:option value = "Select Country"/>
		<form:options items="${student.countryOptions}"/>
		<!-- <form:option value = "Brazil" path = "Brazil"/>
		<form:option value = "France" path = "France"/>
		<form:option value = "Germany" path = "Germany"/>
		<form:option value = "India" path = "India"/> -->
	</form:select>
	
	<br><br>
	Favorite Programming Language :
	 Java <form:radiobutton path="favouriteLanguage" value="Java" />
	C# <form:radiobutton path="favouriteLanguage" value="C#" />
	Python <form:radiobutton path="favouriteLanguage" value="Python" />
	Ruby <form:radiobutton path="favouriteLanguage" value="Ruby" /> 
	<br><br>
	Favourite OS :
	Linux   <form:checkbox path="os" value="Linux"/>
	Mac OS  <form:checkbox path="os" value="Mac OS"/>
	Windows <form:checkbox path="os" value="Windows"/>
	<br><br>
	<input type="submit" value="Submit">
		
	</form:form>
</body>
</html>