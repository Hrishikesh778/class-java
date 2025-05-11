package com.downCasting;

import com.updownCasting.Parent;

public class Downcasting {

	public static void main(String[] args) {
		Parent2 p = new Child2();
//		p.name = "Shubham";
		
		
		// Performing Downcasting Implicitly
		// Child c = new Parent(); // it gives compile-time error

		// Performing Downcasting Explicitly
		Child2 c = (Child2) p;
		
		
	
		c.age = 18;
		System.out.println(c.name);
		System.out.println(c.age);
		c.showMessage();
	}

}
