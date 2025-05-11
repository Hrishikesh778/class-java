package com.abstractclass;

public class TestAbstraction1 {
	public static void main(String args[]) {
		Shape s = new Circle1();// In a real scenario, object is provided through method, e.g., getShape()
								// method
		s.draw();
		
		Shape r =new Rectangle();
		r.draw();
	}

}
