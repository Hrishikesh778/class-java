package com.finalkeyword;

public class staticblock {

	static final int data;// static blank final variable
	static {
		data = 50;
	}

	public static void main(String args[]) {
		System.out.println(staticblock.data);
	}

}
