package com.thisproj;

public class Student {

	public long id;
	public String name;
	public int std;

	
	
	public Student() {
	
		System.out.println("Default constr");
	}

	public Student(long id, String name) {
		
		this.id = id;
		this.name = name;
		
		//this can used to refer current class instance

	}
	
	public Student(long id, String name, int std) {
		this(id ,name);//this can be used to invoke current class constructor
		this.std = std;
		this.display();//this can be used to invoke current class method (implicitly)
	}

	public void display() {
		System.out.println("id=" + id + ", name=" + name + ", std=" + std);
	}

	public static void main(String[] args) {

		new Student(101,"Shashank",5);
	
		
	}

	
}
