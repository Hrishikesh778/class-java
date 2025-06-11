package com.embeddableAnno;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
	 Session session =	new Configuration().configure().buildSessionFactory().openSession();
	 
	 Transaction tx=session.beginTransaction();
	 
	 Address addr1 = new Address();
	 addr1.setCity("Pune");
	 addr1.setState("Maharashtra");
	 addr1.setCountry("India");

	 Address addr2 = new Address();
	 addr2.setCity("New York");
	 addr2.setState("New York");
	 addr2.setCountry("USA");
	 
	 Student student1 =new Student();
	 student1.setName("Alice Johnson");
	 student1.setStd("10th grade");
	 student1.setCollege("ABC Academy");
	 student1.setAddress(addr1);
	 
	 Student student2 =new Student();
	 student2.setName("Bob Smith");
	 student2.setStd("11th Grade");
	 student2.setCollege("XYZ Institute");
	 student2.setAddress(addr2);

	 session.persist(student1);
	 session.persist(student2);
	 
	 
	 tx.commit();
	 
	 
	 
	}
	
}
