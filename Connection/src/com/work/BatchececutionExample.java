package com.work;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchececutionExample {
 
	static Connection con=null;
	public static void main(String[] args) throws SQLException {
		
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrishi", "root", "admin");

		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    
		    PreparedStatement ps = con.prepareStatement("insert into student(name,std) values(?,?)");
		    
		    while(true) {
		    	System.out.println("Enter Name");
				String name = br.readLine();

				System.out.println("Enter STD");
				int std = Integer.parseInt(br.readLine());
				
				ps.setString(1, name);
				ps.setInt(2, std);
				
				ps.addBatch();
				
				System.out.println("Do you want to More Data");

				String answer2 = br.readLine();

				if (answer2.equalsIgnoreCase("No")) {
					break;
				}
				
		    }
		    ps.executeBatch();

			System.out.println("All Data Inserted");
		   
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			con.close();
		}
		
	}
	
}
