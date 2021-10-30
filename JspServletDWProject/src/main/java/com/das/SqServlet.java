package com.das;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		//good for RequestDispatcher
		//int i = (int) req.getAttribute("k");
		
		//for SendRedirect
		//int i =  Integer.parseInt(req.getParameter("k"));
		
		//For HttpSession
//		HttpSession session = req.getSession();
//		int i = (int) session.getAttribute("k");
		
		//For Cookies
		Cookie cookie[] = req.getCookies();
		int i=0;
		for (int j=0; j<cookie.length;j++) {
			if (cookie[j].getName().equals("k")) {
			i = Integer.parseInt(cookie[j].getValue());
			}
		}
		
		
		PrintWriter writer = res.getWriter();
		writer.print("The expected Square Value is " + i*i);
		
	}

}
