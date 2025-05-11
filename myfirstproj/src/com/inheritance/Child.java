package com.inheritance;

public class Child extends Parent {
	int pocketMoney = 250;

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.pocketMoney);
		System.out.println(c.amount);
		c.car();
		c.flat();
	}
}
