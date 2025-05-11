package com.myfirstproj;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First number:");
		int a = sc.nextInt();

		System.out.println("Enter Second number:");
		int b = sc.nextInt();

		System.out.println("Enter Operator:");
		String op = sc.next();

		sc.close();

		switch (op) {
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		case "/":
			System.out.println(a / b);
			break;

		default:
			System.out.println("Case not found");
			break;

		}

	}

}
