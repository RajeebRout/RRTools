package com.nt.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dateurl")
public class DateServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// set response content type
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();  			// get PrintWriter
		
		Date d = new Date();
		pw.print("<h1>Date and Time is :: "+d+"</h1>");
		
		pw.println("<br><a href='index.jsp'>Home</a>");		// add home hyper link
		
		pw.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
	
}
