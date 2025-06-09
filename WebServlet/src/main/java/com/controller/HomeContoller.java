/**
 * 
 */
package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * 
 */
public class HomeContoller implements Servlet {

	//life cycle methods
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		
		 PrintWriter out   = resp.getWriter();
		
		out.println("<h1>This is service Method of Servlet</h1>");
		out.println("<h1>This is service Method</h1>");
		out.println("<h1>This is service Method</h1>");
		out.println("<h1>This is service Method</h1>");

		out.close();
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	
	
	//non-lifecycle methods
	
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
