package com.jsp.servlet_session_project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession httpSession = req.getSession();
		
		httpSession.invalidate();
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html><body><h3>You have been logout Please login again</h3></body></html>");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("student-login.jsp");
		dispatcher.include(req, resp); 
	}
}
