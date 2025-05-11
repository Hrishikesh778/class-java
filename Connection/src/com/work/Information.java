package com.work;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Information {

	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrishi", "root", "admin");
//			System.out.println(con);
			
			PreparedStatement ps = con.prepareStatement("SELECT * FROM student");
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd=rs.getMetaData();
			
			 System.out.println("Total columns: "+rsmd.getColumnCount());   
			 System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));   
			 System.out.println("Column Type Name of 1st column:"+rsmd.getColumnTypeName(1));  
			
			 
			 System.out.println("Column Name of 2st column: "+rsmd.getColumnName(2));   
			 System.out.println("Column Type Name of 2st column:"+rsmd.getColumnTypeName(2));  
			
			 
			 
			 System.out.println("Column Name of 3st column: "+rsmd.getColumnName(3));   
			 System.out.println("Column Type Name of 3st column:"+rsmd.getColumnTypeName(3));  
			
			 System.out.println("Column Type Name of 3st column:"+rsmd.getTableName(1));  
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	
}
