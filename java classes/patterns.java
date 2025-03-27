package com.myfirstproj;

public class patterns {

	public static void main(String[] args) {

		int rd = 5;

		for (int r = 1; r <= rd; r++) {

			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}

			System.out.println("");
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>");

		for (int r = 1; r <= rd; r++) {

			for (int c = rd; c >=r; c--) {
				System.out.print("*");
			}

			System.out.println("");
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>");
		
		for (int r = 1; r <= rd; r++) {

			for (int c = rd; c >r; c--) {
				System.out.print(" ");
			}
			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>");
		
		for (int r = 1; r <= rd; r++) {

			for (int c = 1; c < r; c++) {
				System.out.print(" ");
			}
			for (int c = rd; c >=r; c--) {
				System.out.print("*");
			}

//			for (int c = 1; c <= r; c++) {
//				System.out.print("*");
//			}
			
			System.out.println("");
		}
		

	}
}
