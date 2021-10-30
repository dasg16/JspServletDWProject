package com.das.filters;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class CalculatorFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public CalculatorFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest req = (HttpServletRequest) request;
		int bNum = Integer.parseInt(req.getParameter("num2"));

		PrintWriter out = response.getWriter();
//		out.println("The sum of numbers is k = " + k);

		if (!(bNum == 0)) {
			// pass the request along the filter chain
			chain.doFilter(request, response);
			out.println("Divisor is acceptable!");

		} else {
			out.println("Divisor can't be Zero!");
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
