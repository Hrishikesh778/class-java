package com.staticKeyword;

public class Homes {

	static int a;

	public static void display() {
		System.out.println("Work");
	}

	static {
		System.out.println("static block 1");
	}

	static {
		a = 34;
		System.out.println("static block 2");
		display();
	}

	public static void main(String[] args) {

		System.out.println(a);
		display();

	}

	static {
		System.out.println("static block 3");
	}

	
}
