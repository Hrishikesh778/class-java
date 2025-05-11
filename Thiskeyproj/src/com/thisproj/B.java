package com.thisproj;

import com.package2.A;

public class B {
	//this - argument in constructor
	A a;
	
	public void display() {
		System.out.println(a.amount);
	}
	
	public B(A a1) {
		this.a=a1;
	}
	
}
