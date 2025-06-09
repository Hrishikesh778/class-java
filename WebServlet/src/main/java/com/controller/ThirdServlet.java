package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<Student> studentList =new ArrayList<Student>();
		
//		PrintWriter out=resp.getWriter();
		
		try{
			
			PreparedStatement ps = DAO.getConnection().prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Student stud=new Student(rs.getInt("id"), rs.getString("name"), rs.getInt("std"));
				studentList.add(stud);
			}

			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		req.setAttribute("students", studentList);
		RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
		dispatcher.forward(req, resp);
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		int std = Integer.parseInt(req.getParameter("std"));
		long mobile = Long.parseLong(req.getParameter("mobileno"));

		int i = 0;

		try {
			
			PreparedStatement ps = DAO.getConnection().prepareStatement("insert into student(name,std) values(?,?)");
			ps.setString(1, name);
			ps.setInt(2, std);

			i = ps.executeUpdate();
			req.setAttribute("message", "Data Saved Successfully");
			
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.include(req, resp);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
