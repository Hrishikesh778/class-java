package com.exceptions;

public class userdeineexception {

	public static void three(int age) throws CheckAge {

		if(age<18)
		{
			throw new CheckAge("this is not valid age");
		}
		else {
			System.out.println("This is valid age");
		}
		
	}

	public static void two(int age) throws CheckAge {
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
		System.out.println("This is First method");
		one(15);
		System.out.println("This is working");

	}
	
}
