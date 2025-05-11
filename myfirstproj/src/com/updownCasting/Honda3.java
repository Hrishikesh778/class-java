package com.updownCasting;

public class Honda3 extends Bike2 {

	int speedlimit = 150;

	public static void main(String args[]) {
		Bike2 obj = new Honda3();
		System.out.println(obj.speedlimit);// 90
	}

}
