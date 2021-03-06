package com.das;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/jstl")
public class JSTL extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		RequestDispatcher rd = req.getRequestDispatcher("JSTL.jsp");
		req.setAttribute("ExpressionLanguage", "Godzilla");
		rd.forward(req, res);

		PrintWriter out = res.getWriter();
		out.println("Username is = " + req.getAttribute("ExpressionLanguage"));
	}

}
