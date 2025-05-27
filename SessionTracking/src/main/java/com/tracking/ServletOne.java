package com.tracking;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ServletOne extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		resp.setContentType("text/html");

		String name = req.getParameter("names");

		PrintWriter out = resp.getWriter();

		out.print("<h1> Welcome , " + name + "</h1>");
		
/////////////////////////////cookies///////////////////////////////////////
//		Cookie ck = new Cookie("username", name);
//
//		resp.addCookie(ck);
//		out.print("<a href ='servlet2'> SecondServlet </a>");

////////////////////////////by hidden form field////////////////////////////////
//		out.print("<form action='servlet2' >");
//		out.print("<input type='hidden' name='uname' value='"+name+"'>");
//		out.print("<input type='submit' value='go'>");
//		out.print("</form>");
/////////////////////////////by url rewriting/////////////////////////////////////////
///		
		
//		out.print("<a href ='servlet2?uname="+name+"'> SecondServlet </a>");
		
/////////////////////////////by http sessions//////////////////////////////////////////////

		HttpSession session=req.getSession();
		session.setAttribute("uname",name);
		out.print("<a href ='servlet2'> SecondServlet </a>");
	}

}
