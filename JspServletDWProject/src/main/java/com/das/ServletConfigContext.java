package com.das;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//@WebServlet("/family")
public class ServletConfigContext extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		System.out.println("I am here");
		PrintWriter writer = res.getWriter();
		writer.println("Hi have ");
		
		ServletContext sc = getServletContext();
		String name = sc.getInitParameter("name");
		String pet = sc.getInitParameter("pet");
		writer.println(name);
		writer.println(pet);
		
		ServletConfig sg = getServletConfig();
		String nameConfig = sg.getInitParameter("name");
		String petConfig = sg.getInitParameter("pet");
		writer.println(nameConfig);
		writer.println(petConfig);
		
		
	}

}
