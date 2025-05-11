package com.interfaceclass;

public class TestInterface2 {
	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("SBI ROI: " + b.rateOfInterest());
		
		Bank k = new PNB();
		System.out.println("PNB ROI: " + k.rateOfInterest());
	}

}
