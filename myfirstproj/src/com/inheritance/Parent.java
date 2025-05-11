package com.inheritance;

public class Parent extends GrandParent {

	long amount = 450000000;

	public void car() {
		System.out.println("RR");
	}
	
	public static void main(String[] args) {
		Parent c = new Parent();
//		System.out.println(c.pocketMoney);
		System.out.println(c.amount);
		c.car();
		c.flat();
	}

}
