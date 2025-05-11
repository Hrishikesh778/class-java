package com.inheritance;

public class Child2 extends Parent{
	int pocketMoney2 = 350;
	public static void main(String[] args) {
		
		Child2 c2 = new Child2();
		c2.car();
		System.out.println(c2.amount);	
		System.out.println(c2.pocketMoney2);
		
	}
}
