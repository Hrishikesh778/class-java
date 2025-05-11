package com.inheritance;

interface Sayable {

		// Default method    
		default void say(){   
		System.out.println("Hello, this is default method");   
		}   
		// Abstract method   
		void sayMore(String msg);   

	
}
