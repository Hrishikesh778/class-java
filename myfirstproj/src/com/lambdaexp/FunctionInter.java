package com.lambdaexp;


public class FunctionInter {

	
	public static void main(String[] args) {
		
//		Work w = new Work() {
//			public void tester() {
//				System.out.println("Testing");
//			}
//			
//			public void dev() {
//				System.out.println("Dev");
//			}
//		};
//		
//		w.tester();
//		
//		Work w1 = new Work(){
//			public void tester() {
//				System.out.println("Testing");
//			}
//			
//			public void dev() {
//				System.out.println("Dev");
//			}
//		};
		
//		Work w = (int a , int b) -> {
//			System.out.println("Testing "  + (a+b));
//		};
		
//		Work w = (a , b) -> {
//			System.out.println("Testing "  + (a+b));
//		};
		
//		Work w = (a , b) -> {
//			return a + b;
//		};
//		
		Work w = (a , b) -> (a + b);
		 int sum = w.tester(20 , 30);
		System.out.println(sum);
		System.out.println( w.tester(25000 , 30));
		
	}
	
}
