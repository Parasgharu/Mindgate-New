<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
<% String name=session.getAttribute("username").toString();%>
<%String address=request.getParameter("txtAddress"); %>
<% out.println("Hi...!!! "+ name); %>
<br>
<% out.println(" Location:- "+ address); %>
</body>
</html>