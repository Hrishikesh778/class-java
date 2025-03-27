package com.myfirstproj;

public class Studentobj {
	long roll_no;
	String name;
	int std;

	public void insertData(long r, String n, int s) {
		roll_no = r;
		name = n;
		std = s;
		display();
	}

	public void display() {
		System.out.println(roll_no + " " + name + " " + std);
	}

	public static void main(String[] args) {

		Studentobj s1 = new Studentobj(),s2 = new Studentobj();
//		s1.roll_no = 101;
//		s1.name = "Ravi";
//		s1.std = 5;
		s1.insertData(101, "Ravi", 5);
		


		s2.insertData(102, "Sham Kumar", 3);
		

//		s2.roll_no = 102;
//		s2.name = "Sham";
//		s2.std = 2;

		
		
		
		new Studentobj().insertData(103, "Shiv", 2);
		new Studentobj().insertData(103, "Shiv", 2);
		new Studentobj().insertData(103, "Shiv", 2);
		new Studentobj().insertData(103, "Shiv", 2);
		new Studentobj().insertData(103, "Shiv", 2);
		new Studentobj().insertData(103, "Shiv", 2);
		new Studentobj().insertData(103, "Shiv", 2);
		 
		int a = 25, b = 75;
		
		
	}

}
