package com.work;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CommitRollback {
	
	static Connection con=null;
	static BufferedReader br = null;
	
	public static void createNewStudent() throws Exception {
		
		con.setAutoCommit(false);
		
		while(true) {
			
			System.out.println("Enter Name");

			String name = br.readLine();
			System.out.println("Enter STD");

			int std = Integer.parseInt(br.readLine());

			PreparedStatement ps = con.prepareStatement("insert into student(name,std) values(?,?)");
			ps.setString(1, name);
			ps.setInt(2, std);

			int rs = ps.executeUpdate();
			
			System.out.println("Do you want to Insert Data");
			String answer = br.readLine();
			
			if(answer.equalsIgnoreCase("Yes")) {
				con.commit();
				System.out.println(rs + " row inserted");
			}
			else {
				con.rollback();
				System.out.println(" Data Rollback");
			}
			
			
			System.out.println("Do you want to More Data");

			String answer2 = br.readLine();

			if (answer2.equalsIgnoreCase("No")) {
				break;
			}
			
		}
		
		
		System.out.println("out of the loop");
	}

	public static void main(String[] args) throws SQLException {
		
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrishi", "root", "admin");

		    br = new BufferedReader(new InputStreamReader(System.in));
		    
		    createNewStudent();

		   
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			con.close();
		}
		
		
	}
	
}
