package com.collectioninJava;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample2 {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.offer("arvind");
		deque.offer("vimal");
		deque.add("mukul");
		deque.offerFirst("jai");
		deque.offerFirst("jai2");
		deque.offerLast("jai");
		System.out.println("After offerFirst Traversal..." + deque);
		for (String s : deque) {
			System.out.println(s);
		}

		// deque.poll();
		// deque.pollFirst();//it is same as poll()
		deque.pollLast();
		System.out.println("After pollLast() Traversal...");
		for (String s : deque) {
			System.out.println(s);
		}

	}

}
