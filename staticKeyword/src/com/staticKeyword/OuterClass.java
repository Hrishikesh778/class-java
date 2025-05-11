package com.staticKeyword;

public class OuterClass {

	
    // Outer class fields
    private String outerField = "OuterClass Field";

    // Static nested class
    public static class StaticNestedClass {
        public void display() {
            System.out.println("Inside Static Nested Class");
        }
    }

    // Inner (non-static) class
    public class InnerClass {
        public void display() {
            System.out.println("Inside Inner Class: " + outerField);
        }
    }

    // Method in OuterClass to demonstrate usage
    public void demonstrateNestedClasses() {
        // Create an instance of InnerClass
        InnerClass inner = new InnerClass();
        inner.display();
    }


    
//    public static void main(String[] args) {
        // Accessing the static nested class
//        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
//        staticNested.display();

        // Accessing the inner class
//        OuterClass outer = new OuterClass();
//        outer.demonstrateNestedClasses();
        
//        OuterClass.InnerClass inner = outer.new InnerClass();
//        inner.display();
        
//    }

    
    public static void main(String[] args) {
    	// Accessing the static nested class
      OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
      staticNested.display();

      // Accessing the inner class
      OuterClass outer = new OuterClass();
      outer.demonstrateNestedClasses();
      
      OuterClass.InnerClass inner = outer.new InnerClass();
      inner.display();
	}


	
}
