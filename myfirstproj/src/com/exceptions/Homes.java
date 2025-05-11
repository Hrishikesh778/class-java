package com.exceptions;

public class Homes {

	public static void three(int age) {

		if(age<18)
		{
			throw new ArithmeticException("Age Is invalid");
		}
		else {
			System.out.println("This is valid age");
		}
		
	}

	public static void two(int age) {
		three(age);
	}

	public static void one(int age) {
		try {
			two(age);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		one(15);

	}
}
