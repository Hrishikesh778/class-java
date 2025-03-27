package com.myfirstproj;

public class Array {
	public static void main(String[] args) {

		int[] arb = { 1, 2, 3, 4 };

		System.out.println(arb);
		System.out.println(arb[0]);

		arb[0] = 25;

		System.out.println(arb[0]);

		System.out.println(arb.length);
		System.out.println("================");
		for (int i = 0; i < arb.length; i++) {
			System.out.println(arb[i]);
		}
		System.out.println("================");

		for (int i : arb) {
			System.out.println(i);
		}

		System.out.println("================");

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (String i : cars) {
			System.out.println(i);
		}

		System.out.println("================");
		
		int arr[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8 }, { 9, 10 }, { 11,52 } };

		System.out.println(arr[0][3]);

		arr[0][3] = 45;

		System.out.println(arr[0][3]);

		System.out.println("================");
		
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + ",");
			}
			System.out.println();
		}

	}

}
