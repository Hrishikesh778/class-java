package com.staticKeyword;

public class Student {

	public int id;
	public String name;
	public int std;
	public static String college = "CHM";

	public Student(int i, String n, int s) {
		id = i;
		name = n;
		std = s;
	}

	public Student() {
		System.out.println("default con ");
	}

	public void display() {
		System.out.println("id=" + id + ", name=" + name + ", std=" + std + ", college=" + college);
	}

	public static void main(String[] args) {

		Student s1 =	new Student(101, "Ram", 5);
		s1.display();
		new Student(102, "Raj", 5).display();
		new Student(103, "Raju", 5).display();
		new Student(104, "Rajesh", 5).display();

	}


	
}
