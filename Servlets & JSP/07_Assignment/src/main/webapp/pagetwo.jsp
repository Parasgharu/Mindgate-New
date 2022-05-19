<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = request.getParameter("txtname");
	session.setAttribute("username", name);
	%>
	<h1 style="color: red; text-align: center;">Page Two</h1>
	<form action="display.jsp" method="post">
		Address : <input type="text" name="txtAddress"> 
		<br> 
		<br>
		<input type="submit" value="OK">
	</form>
</body>
</html>