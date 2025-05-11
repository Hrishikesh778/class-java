package com.work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {
	static Connection con = null;
	static BufferedReader br = null;

	public static void deleteStudentById() throws Exception {
		System.out.println("Student Id ");
		 int id   = Integer.parseInt(br.readLine())  ;

//		System.out.println("Student Name");
//		String name = br.readLine();

		 PreparedStatement ps= con.prepareStatement("delete from student where id = ? ");	
//		PreparedStatement ps = con.prepareStatement("delete from student where name = ? ");
		 ps.setInt(1, id);
//		ps.setString(1, name);

		int i = ps.executeUpdate();

		System.out.println(i + " row deleted");
		asked();
	}
	
	public static void updateStudent() throws Exception {
	
		System.out.println("Student Id ");
		int id = Integer.parseInt(br.readLine());

		System.out.println("Student Name ");
		String name = br.readLine();

		System.out.println("Student Std ");
		int std = Integer.parseInt(br.readLine());
		
		PreparedStatement ps=con.prepareStatement("update Student set name= ? , std =? where id = ?");
		ps.setString(1, name);
		ps.setInt(2, std);
		ps.setInt(3, id);
		int i = ps.executeUpdate();
		
		System.out.println(i + " row updated");
		asked();
		
	}

	public static void createNewStudent() throws Exception {
		System.out.println("Enter Name");

		String name = br.readLine();
		System.out.println("Enter STD");

		int std = Integer.parseInt(br.readLine());

		PreparedStatement ps = con.prepareStatement("insert into student(name,std) values(?,?)");
		ps.setString(1, name);
		ps.setInt(2, std);

		int rs = ps.executeUpdate();
		System.out.println(rs + " row inserted");
		asked();
	}

	private static void getAllStudent() throws Exception {
//		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery("SELECT * FROM student");

		PreparedStatement ps = con.prepareStatement("SELECT * FROM student");
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));

		}
		asked();
	}

	public static void asked() throws Exception {
		System.out.println();
		System.out.println("Press 1 to Insert Student");

		System.out.println("Press 2 to Get All Student");

		System.out.println("Press 3 to Delete Student");
		
		System.out.println("Press 4 to Update Student By id");

		int key = Integer.parseInt(br.readLine());
		switch (key) {
		case 1:
			createNewStudent();
			break;
		case 2:
			getAllStudent();
			break;
		case 3:
			deleteStudentById();
			break;
		case 4:
			updateStudent();
			break;
		default:
			throw new Exception("hi");
		}

	}

	public static void main(String[] args) throws SQLException {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrishi", "root", "admin");
			System.out.println(con);

			br = new BufferedReader(new InputStreamReader(System.in));

			asked();

		} catch (Exception e) {
			System.out.println("ex" + e);
		} finally {
			con.close();
		}
	}

}
