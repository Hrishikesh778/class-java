package com.myfirstproj;

public class Boat {

	public static void main(String[] args) {

		int rd = 5;

//			Flag Part Of The Boat

		for (int i = 1; i <= rd; i++) {
			for (int j = 1; j <= rd * 4 - 1; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

//			Stick Part Of The Boat

		for (int i = 1; i <= rd * 2 - 3; i++) {
			for (int j = 1; j <= rd * 4 - 1; j++) {
				System.out.print("  ");
			}
			System.out.println("*");
		}

//			Base Part Of The Boat

		for (int i = 1; i <= rd; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= rd - i + 1; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= rd * 3; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= rd - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
