package com.interfaceclass;

public class TestInterfaceStatic {
	public static void main(String args[]) {
		Drawable d = new Rectangle();
		d.draw();
		System.out.println(Drawable.cube(3));
	}

}
