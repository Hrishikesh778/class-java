package com.tracking;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ServletTwo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		resp.setContentType("text/html");
		
// by cookie		
//		Cookie ck[] = req.getCookies();
//		String name = ck[0].getValue().toString();
		
		////////////////////////////////////////////////////////
		//by hidden parameter and url rewriting 
//		String name = req.getParameter("uname");
//////////////////////////////////////////////////////////////////
///by http session

		HttpSession session=req.getSession(false);
		String name=(String)session.getAttribute("uname");
		
		
		
		PrintWriter out = resp.getWriter();

		out.print("<h1> Welcome , " + name + "</h1>");
	}

}
