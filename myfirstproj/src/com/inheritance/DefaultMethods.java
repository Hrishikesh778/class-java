package com.inheritance;

public class DefaultMethods implements Sayable{

	@Override
	public void sayMore(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);   
	}

	
		public static void main(String[] args) {   
			DefaultMethods dm = new DefaultMethods();
			dm.say(); // calling default method
			dm.sayMore("Work is worship"); // calling abstract method

		}   

}
