package com.myfirstproj;

public class Recursionsum {

	public static int sumOfRange(int num) {
		if(num<=1) {
			return num;
		}
		
		return num + sumOfRange(num-1);
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfRange(5));
	}
	
}
