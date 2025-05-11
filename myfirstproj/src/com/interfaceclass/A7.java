package com.interfaceclass;

public class A7 implements printable, Showable {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		A7 obj = new A7();
		obj.print();
		obj.show();
	}

}
