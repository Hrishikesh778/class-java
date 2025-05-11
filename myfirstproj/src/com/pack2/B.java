package com.pack2;

import com.pack.*;

public class B extends A {

	protected void msg() {
		System.out.println("Hello hrishi");
	}

	public static void main(String[] args) {
		B a = new B();
		a.msg();
	}

}
