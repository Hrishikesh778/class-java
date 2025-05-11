package com.thisproj;

public class Asanargument {

	//this - argument in method

	
	int amount = 25000;

	public void red(Asanargument h) {
		System.out.println("this is red");
	}

	public void blue() {
		red(this);
		System.out.println("this is blue");
	}

	public static void main(String[] args) {
		
		Asanargument a=new Asanargument();
		a.amount=65000;
		System.out.println(a.amount);
		a.blue();
		
		Asanargument a2=new Asanargument();
		System.out.println(a2.amount);
		a2.red(a2);

	}

}
