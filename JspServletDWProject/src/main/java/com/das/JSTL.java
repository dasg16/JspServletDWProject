package com.das;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JSTL extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		req.setAttribute("username", "Godzilla");

		PrintWriter out = res.getWriter();
		out.println("Username is = " + req.getAttribute("username"));
	}

}
