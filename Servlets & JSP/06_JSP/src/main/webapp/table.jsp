<%@page import="javax.swing.border.Border"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!int number;%>	
		<%
		number=Integer.parseInt(request.getParameter("txtNumber"));
		%>
		<h1>Multiplication table of <%= number %></h1>
		<table border="1">
	<% 
	for (int i=1;i<=10;i++){
	%>
	<tr>
   		 <td> <%= number%> </td>
		 <td> <%= i %></td>
		 <td> <%= (number*i) %></td>
	</tr>
	<%
	} 
	%>
	</table>
</body>
</html>