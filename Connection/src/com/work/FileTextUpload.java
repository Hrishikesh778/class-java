package com.work;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FileTextUpload {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrishi", "root", "admin");

			// save to sql

//			File f = new File("C:\\Users\\hrish\\OneDrive\\Pictures\\text\\SuperMan.txt");
//			FileReader fr = new FileReader(f);
//			
//			
//			PreparedStatement ps = con.prepareStatement("insert into FILETABLE (fileName ,fileData) values (?,?)");
//
//			ps.setString(1, f.getName());
//			ps.setCharacterStream(2, fr, (int) f.length());
//
//			int i = ps.executeUpdate();
//
//			System.out.println(i + " row inserted");

			// download from sql

			ResultSet rs = con.prepareStatement("select *  from FILETABLE").executeQuery();

			while (rs.next()) {

				Clob cb = rs.getClob(3);

				Reader rd = cb.getCharacterStream();

				File f = new File("C:\\Users\\hrish\\OneDrive\\Pictures\\text\\download\\" + rs.getString(2));
				FileWriter fw = new FileWriter(f);
				
				int i;
				while ((i = rd.read()) != -1) {
					fw.write(i);
				}
				fw.close();
				System.out.println(rs.getString(2) + " File Downloaded");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
