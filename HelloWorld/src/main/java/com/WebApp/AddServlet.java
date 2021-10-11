package com.WebApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int result = a+b;
//		PrintWriter out = res.getWriter();
//		out.println("Result : "+result);
		
		req.setAttribute("k",result);
		RequestDispatcher addToSquare = req.getRequestDispatcher("sq"); 
		addToSquare.forward(req,res);
			
	
			
		
	}
}
