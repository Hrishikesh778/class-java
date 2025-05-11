package com.interfaceclass;

public class TestInterface3 implements printable, Showable {

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		TestInterface3 obj = new TestInterface3();
		obj.print();
	}

}
