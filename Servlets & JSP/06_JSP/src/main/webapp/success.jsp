<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<%
	String userId;
	%>
	<%
	String password;
	%>
<h1 style="color: blue;">Welcome to the page</h1>
	<%
	userId = request.getParameter("txtName");
	out.println("Hello " + userId);
	%>
</body>
</html>