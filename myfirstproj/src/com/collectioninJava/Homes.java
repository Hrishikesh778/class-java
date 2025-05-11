package com.collectioninJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Homes {
	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();

		li.add(25);
		li.add(50);
		li.add(55);
		li.add(75);
		li.add(29);
		li.add(21);

		System.out.println(li);
		System.out.println(li.size());

		Collections.sort(li);

		System.out.println(li);

		System.out.println("===========Iterator============");

		Iterator<Integer> it = li.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("==========FOR LOOP=============");

		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}

		System.out.println("==========FOR Each Loop =============");

		for (int data : li) {
			System.out.println(data);
		}

		System.out.println("==========ListIterator=============");

		ListIterator<Integer> lit = li.listIterator();

		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("------Reverse-----");
//		 ListIterator<Integer> lit = li.listIterator(li.size());
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}

		System.out.println("==========For Each Remaining Method=============");

		lit.forEachRemaining(data -> System.out.println(data));

		System.out.println("==========For Each Method=============");

		li.forEach(data -> System.out.println(data));

	}

}
