package com.collectioninJava;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String args[]) {
		// Creating and adding elements
		TreeSet<String> al = new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		// Traversing elements
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		al.forEach(d->System.out.println(d));
	}

}
