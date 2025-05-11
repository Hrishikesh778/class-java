package com.collectioninJava;

import java.util.ArrayList;

public class remove {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Anuj");
		al.add("Gaurav");
		al.add("Vijay");
		
		System.out.println(al);
		al.remove("Vijay");
		
		
		System.out.println(al);
		// Removing element on the basis of specific position
		al.remove(0);
		
		System.out.println(al);
		al.add("Ravi");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
		
		al.addAll(al2);
		
		System.out.println("Updated list : " + al);
		// Removing all the new elements from arraylist
		al.removeAll(al2);
		
		System.out.println("removed " + al);
		
		// Removing elements on the basis of specified condition
		al.removeIf(val -> val.contains("Ajay")); // Here, we are using Lambda expression
		
		System.out.println("After invoking removeIf() method: " + al);
		// Removing all the elements available in the list
		
		al.clear();
		System.out.println("After invoking clear() method: " + al);
	}

}
