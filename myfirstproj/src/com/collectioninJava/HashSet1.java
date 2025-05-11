package com.collectioninJava;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String args[]) {
		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
//		Iterator<String> i = set.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		set.forEach(data -> System.out.println(data));
	}

}
