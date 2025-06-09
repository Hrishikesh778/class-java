package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Configuration config = new Configuration();

		config.configure();

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();

		Student s1 = new Student(1, "Ravi", "Science");
		Student s2 = new Student(2, "Ram", "Science");
		Student s3 = new Student(3, "Raju", "Science");

		Transaction tx = session.beginTransaction();

		session.persist(s1);
		session.persist(s2);
		session.persist(s3);

		tx.commit();
		factory.close();

	}
}
