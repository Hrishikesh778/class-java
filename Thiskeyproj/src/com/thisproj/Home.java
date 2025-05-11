package com.thisproj;

public class Home {

	//to return current class instance from method
	
	public void tv() {
		System.out.println("Sony");
	}
	
	public Home car() {
		System.out.println("bmw");
		return this;
	}
	
	public static void main(String[] args) {
		new Home().car().tv();
	}
	
}
