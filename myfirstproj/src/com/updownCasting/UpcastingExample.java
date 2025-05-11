package com.updownCasting;

public class UpcastingExample {

	public static void main(String args[]) {

		Parent obj1 = (Parent) new Child();
		Parent obj2 =  (Parent) new Child();
		obj1.PrintData();
		obj2.PrintData();
		System.out.println(obj1.name);
	}

}
