package com.myfirstproj;

public class Constructooor {

	int amount;
	String tv;

	public Constructooor() {
		System.out.println("Default COn");
	}

	public Constructooor(int a, String t) {
		amount = a;
		tv = t;
		System.out.println("Parameter COn");
	}

	public Constructooor(Constructooor z) {
		amount = z.amount;
		tv = z.tv;

	}

	public static void main(String[] args) {
		
		
	
		Constructooor h1 = new Constructooor();
		System.out.println(h1.amount + " " + h1.tv);
		
		System.out.println();
		System.out.println("============");
		System.out.println();
		
		Constructooor h2 = new Constructooor(50000,"LG");
		
		System.out.println();
		System.out.println("============");
		System.out.println();
		
		
		Constructooor h3 = new Constructooor(200000,"Sony");
		System.out.println(h3.amount + " " + h3.tv);

		
		Constructooor a = new Constructooor(80000,"LG");
		System.out.println(a.amount + " " + a.tv);
	
		Constructooor b = new Constructooor(a);
		System.out.println(b.amount + " " + b.tv);
	

	}


}
