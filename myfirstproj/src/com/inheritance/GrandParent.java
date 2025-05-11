package com.inheritance;

public class GrandParent {
	public void flat() {
		System.out.println("5 bhk");
	}
	
	public static void main(String[] args) {
		GrandParent c = new GrandParent();
//		System.out.println(c.pocketMoney);
//		System.out.println(c.amount);
//		c.car();
		c.flat();
	}

}
