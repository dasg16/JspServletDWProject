package com.das;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
	
	int k = i + j;
	
	//Below portion if I want to just print the sum on the webpage. 
	//So, servlet 1 will resturn the response in html.
//	PrintWriter out = res.getWriter();
//	out.println("The sum of numbers is k = " + k);
	
	//Sending the request to an another Servlet
	//This is called Request Dispatcher 
	//where the Servlet 2 will send the response back to client.
//	req.setAttribute("k", k);
//	RequestDispatcher rDis = req.getRequestDispatcher("sq");
//	rDis.forward(req, res);
	
	//SendRedirect URL
	//res.sendRedirect("sq?k="+k);
	
	//HttpSession Management
//	HttpSession session = req.getSession();
//	session.setAttribute("k",k);
//	res.sendRedirect("sq");
	
	//For cookies
	Cookie cookie = new Cookie("k", k+"");
	res.addCookie(cookie);
	res.sendRedirect("sq");
	
	
	}

}
