package com.encapsulation;

import java.util.Arrays;

public class Teststringcomparison4 {
	public static void main(String args[]) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "Ratan";
		System.out.println(s1.compareTo(s2));// 0
		System.out.println(s1.compareTo(s3));// 1(because s1>s3)
		System.out.println(s3.compareTo(s1));// -1(because s3 < s1 )

		String s = 50 + 30 + "Sachin" + (40 + 40);
		System.out.println(s);// 80Sachin4040

		String k = "SachinTendulkar";
		System.out.println("Original String: " + k);
		System.out.println("Substring starting from index 6: " + k.substring(6));// Tendulkar
		System.out.println("Substring starting from index 0 to 6: " + k.substring(0, 6)); // Sachin

		// split

		String text = new String("Hello, My name is Sachin");
		/* Splits the sentence by the delimeter passed as an argument */
		String[] sentences = text.split(" ");
		System.out.println(Arrays.toString(sentences));

		// trim

		String f = "  Sachin  ";
		System.out.println(f);// Sachin
		System.out.println(f.trim());// Sachin

		// starstwith and endswith
		String l = "Sachin";
		System.out.println(l.startsWith("Sa"));// true
		System.out.println(l.endsWith("in"));// true

		// string intern()
		String s12 = new String("Hello");
		String s22 = s12.intern(); // Adds "Hello" to the String Pool
		String s32 = "Hello";
		System.out.println(">>>>>>>>>>>>>>>>>>");
		System.out.println(s22 == s32); // Output: true

		System.out.println(">>>>>>>>>>>>>>>>>>");
		// string buffer capacity
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());// default 16
		sb.append("Hello");
		System.out.println(sb.capacity());// now 16
		sb.append("java is my favourite language");
		System.out.println(sb.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2

		System.out.println(">>>>>>>>>>>>>>>>>>");
		// string buffer ensurcapacity

		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());// default 16
		sb1.append("Hello");
		System.out.println(sb1.capacity());// now 16
		sb1.append("java is my favourite language");
		System.out.println(sb1.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
		sb1.ensureCapacity(10);// now no change	
		System.out.println(sb1.capacity());// now 34
		sb1.ensureCapacity(50);// now (34*2)+2
		System.out.println(sb1.capacity());// now 70

	}

}
