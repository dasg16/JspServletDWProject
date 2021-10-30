package com.das;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.queries.dao.DAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Login extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		PrintWriter out = res.getWriter();

		out.println("Username is = " + username);
		out.println("Password is = " + password);

		try {
			if (DAO.validateCredentials(username, password)) {
				HttpSession session = req.getSession();
				session.setAttribute("username", username);
				res.sendRedirect("WelcomePage.jsp");
			} else {
				RequestDispatcher rd = req.getRequestDispatcher("LoginPage.jsp");
				req.setAttribute("LoginStatus", "Incorrect Username or Password! Please try again.");
				rd.forward(req, res);
				res.sendRedirect("LoginPage.jsp");
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}