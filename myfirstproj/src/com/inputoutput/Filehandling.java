package com.inputoutput;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Filehandling {

	public static void main(String[] args) {

		try {
			File f = new File("C:\\Users\\hrish\\home.txt");
			if (f.createNewFile()) {
				System.out.println("file is created");
			} else {
				System.out.println("Already Present");
			}
			
			
			FileWriter fw = new FileWriter(f);
			
			if(f.canWrite()) {
				fw.write("This is java \n");
				fw.write("This is java \n");
				fw.write("This is java \n");
				fw.write("This is java \n");
				fw.write("This is java \n");
				fw.write("This is java \n");
				fw.write("This is java \n");
				
				fw.close();
				
			}else {
				System.err.println("File can't write");
			}
			
			
			
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
			if (f.exists()) {
				System.out.println("File name: " + f.getName());
				System.out.println("Absolute path: " + f.getAbsolutePath());
				System.out.println("Writeable: " + f.canWrite());
				System.out.println("Readable " + f.canRead());
				System.out.println("File size in bytes " + f.length());
			} else {
				System.out.println("The file does not exist.");
			}
			
			if (f.delete()) {
				System.out.println("Deleted the file: " + f.getName());
			} else {
				System.out.println("Failed to delete the file.");
			}
			
		} catch (Exception e) {

		}

	}

}
