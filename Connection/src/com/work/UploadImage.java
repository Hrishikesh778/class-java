package com.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UploadImage {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrishi", "root", "admin");

			PreparedStatement ps = con.prepareStatement("insert into IMGTABLE (Name,photo) values (?,?) ");

			// save file to data base
//			File f = new File("C:\\Users\\hrish\\OneDrive\\Pictures\\female1.jpg");
//			FileInputStream fis = new FileInputStream(f);
//
//			ps.setString(1, f.getName());
//			ps.setBinaryStream(2, fis, fis.available());
//
//			int i = ps.executeUpdate();
//			System.out.println(i + " image inserted");

			// download from database
			ResultSet rs = con.prepareStatement("SELECT * FROM imgtable").executeQuery();
			
			while(rs.next()) {
				
				Blob b=rs.getBlob(3);
				byte by[] = b.getBytes(1, (int) b.length());
				
				FileOutputStream fos = new FileOutputStream("C:\\Users\\hrish\\OneDrive\\Pictures\\Screenshots\\" + rs.getString(2) );
				
				fos.write(by);
				fos.close();
				
				System.out.println(rs.getString(2)+" image downloaded");
				
			}
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
