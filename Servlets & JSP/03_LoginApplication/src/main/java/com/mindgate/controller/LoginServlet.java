package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private PrintWriter out;
	private String loginId;
	private String password;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		out = response.getWriter();
		loginId = request.getParameter("txtLoginId");
		password = request.getParameter("txtPassword");

		if (loginId.equals("admin") && password.equals("admin@123")) {
			out.println("Welcome to the Login page ");

		} else {

			out.println("Invalid userId & Password  ");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		out = response.getWriter();
		loginId = request.getParameter("txtLoginId");
		password = request.getParameter("txtPassword");

		if (loginId.equals("admin") && password.equals("admin@123")) {
			out.println("Welcome to the Login page ");

		} else {

			out.println("Invalid userId & Password  ");
		}
	}

}
