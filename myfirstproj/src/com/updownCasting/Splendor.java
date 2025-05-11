package com.updownCasting;

public class Splendor extends Bike2 {
	void run() {
		System.out.println("running safely with 60km");
	}

	public static void main(String args[]) {
		Bike2 b = new Splendor();// upcasting
		b.run();

	}
}
