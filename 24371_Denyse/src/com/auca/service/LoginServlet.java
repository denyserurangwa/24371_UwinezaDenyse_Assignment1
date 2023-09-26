package com.auca.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	private static final String x_username = "24371";
	private static final String x_password = "1234";
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		String enteredUsername = req.getParameter("username");
		String enteredPassword = req.getParameter("password");
		
		if (x_username.equals(enteredUsername)&& x_password.equals(enteredPassword)) {
			res.sendRedirect("dashboad.html");
		}else {
			res.sendRedirect("forgotPassword.html");
		}
	}
}
