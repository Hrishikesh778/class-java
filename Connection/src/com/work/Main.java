package com.work;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrishi", "root", "admin");
			System.out.println(con);
		}
		catch(Exception e){
			System.out.println("ex"+ e);
		} 
	}
	
}
