package com.myfirstproj;

public class Methods {

	public static void add(int a , int b ) {
		System.out.println(a + b);
	}
	
	public static int sub(int a , int b ) {
//		int sum = a - b;
//		
//		return sum;
		
		return a - b;
	
	}

	public static void main(String[] args) {
		 tv();
		 add(10 , 20);
		 int sum = sub(56 , 25);
		 System.out.println("data "+sum);
		 
	}

	public static void tv() {
		System.out.println("LG");
	}

	
}
