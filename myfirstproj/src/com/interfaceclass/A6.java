package com.interfaceclass;

public class A6 implements printable {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		A6 obj = new A6();
		obj.print();
	}
}
