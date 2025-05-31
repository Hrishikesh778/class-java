package com.filterswork;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class filterConfigration implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		out.println("<h1>Before servlet invoke</h1>");
		
		
		chain.doFilter(req, resp);
		

		out.println("<h1>after servlet invoke</h1>");
	}

}
