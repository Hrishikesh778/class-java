package com.experimental;

import java.util.ArrayList;
import java.util.Iterator;

public class autoandunbox {

	public static void main(String[] args) {
		
		ArrayList<Integer> n=new ArrayList<>();
		n.add(1);
		n.add(2);
		n.add(3);
		n.add(4);
		
		n.remove((Integer)3);
		
		Iterator<Integer> a= n.iterator();
		
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		
		
		
	}
	
	
}
