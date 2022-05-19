package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mindgate.DAO.EmployeeDAO;
import com.mindgate.pojo.Employee;

@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private PrintWriter out;
	private String name;
	private double salary;
	private EmployeeDAO employeeDAO = new EmployeeDAO();
	private boolean result;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		out = response.getWriter();
		name = request.getParameter("txtName");
		salary = Double.parseDouble(request.getParameter("txtSalary"));

		out.println("name :: " + name);
		out.println("Salary :: " + salary);

		Employee employee = new Employee(0, name, salary);
		result = employeeDAO.addEmployeeem(employee);
		
		response.setContentType("text/html");
		
		if (result) {
//			out.println("<br>Record Added Successfully");
//			out.println("<br><a href =employeehome.html> Home Page </a>");
//			Set<Employee> allEmployees=employeeDAO.getAllEmployee();
//			HttpSession session= request.getSession();
//			session.setAttribute("data", allEmployees);
			response.sendRedirect("GetAllEmployeeServlet");
		} else {  
			out.println("<br>Failed to Add Record");
			out.println("<br><a href =employeehome.html> Home Page </a>");
		}
	}

}
