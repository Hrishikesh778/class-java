package com.interfaceclass;

public class TestInterface1 {
	public static void main(String args[]) {
		Drawable d = new Circle();// In real scenario, object is provided by method e.g. getDrawable()
		d.draw();
		
		Drawable k = new Rectangle();// In real scenario, object is provided by method e.g. getDrawable()
		k.draw();
	}
}
