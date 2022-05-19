<%@page import="java.util.List"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.mindgate.pojo.Employee"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>All Employees</h3>
<% 
	List<Employee> allEmployees= (List<Employee>) session.getAttribute("data");
%>
<table border="2">
<tr>
	<td> EmployeeId </td>
	<td> Name </td>
	<td> Salary </td>
</tr>
<%
for(Employee employee : allEmployees){
%>
<tr>
	<td><%= employee.getEmployeeId() %> </td>
	<td><%= employee.getName() %> </td>
	<td><%= employee.getSalary() %> </td>
</tr>
<% 
}
%>
</table>

  <a href =addemployee.html> New employee </a>
</body>
</html>