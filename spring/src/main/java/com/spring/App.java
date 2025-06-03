package com.spring;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Collection.Item;
import com.Collection.Order;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/applicationContext.xml");

//      Employee ep1   =   (Employee) context.getBean("ep1");
		Employee ep1 = context.getBean("ep3", Employee.class);

		System.out.println(ep1.getId());
		System.out.println(ep1.getName());
		System.out.println(ep1.getLocation());
		
		System.out.println();
		
		Employee ep2= (Employee) context.getBean("ep2");
		System.out.println(ep2.getId());
		System.out.println(ep2.getName());
		System.out.println(ep2.getLocation());
		
		System.out.println();
		
		Employee2 ep3 = context.getBean("ep4", Employee2.class);
		System.out.println(ep3);
		
		Order odr1 = context.getBean("order1", Order.class);
		System.out.println("list>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
//		List<Items> listItem =odr1.getItem();
		
		for(Item i:odr1.getItem()) {
			System.out.println(i);
		}
		
		Order odr2 = context.getBean("order2", Order.class);
		System.out.println("Map>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
//		List<Items> listItem =odr1.getItem();
		
		for(Map.Entry<String, Item> i:odr2.getItemMap().entrySet()) {
			System.out.println(i.getKey());
			System.out.println(i.getValue());
		}
		
	}
}
