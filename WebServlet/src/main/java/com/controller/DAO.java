package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
static Connection con =  null;
	
	public static Connection getConnection() {

	
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrishi", "root", "admin");
				
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return con;
		
	}
}
