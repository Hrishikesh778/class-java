package com.package2;

import com.thisproj.B;

public class A {

	//this - argument in constructor

	public int amount=25000;
	
	public A() {
		B b=new B(this);
		b.display();
		
	}
	
	
	public static void main(String[] args) {
		A a=new A();
		a.amount=5435;
		
		System.out.println(a.amount);
	}
	
}
