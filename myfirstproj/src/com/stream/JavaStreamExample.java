package com.stream;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample {

	public static void main(String[] args) {  
		//In the following example, we are filtering data without using stream. This approach we are used before the stream package was released.
		
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		
		List<Float> productPriceList = new ArrayList<Float>();
		for (Product product : productsList) {

			// filtering data of list
			if (product.price < 30000) {
				productPriceList.add(product.price); // adding price to a productPriceList
			}
		}
		System.out.println(productPriceList); // displaying data
	    }  

	
}
