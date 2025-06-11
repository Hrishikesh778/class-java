package com.OneToOne;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Session session = new Configuration().configure().buildSessionFactory().openSession();

//		Transaction tx = session.beginTransaction();
		
		Passport pass1 = new Passport();
		pass1.setPassportNo("IN123456");
		pass1.setIssuedCountry("India");
		pass1.setExpirationDate(LocalDate.now());


		Passport pass2 = new Passport();
		pass2.setPassportNo("US987654");
		pass2.setIssuedCountry("USA");
		pass2.setExpirationDate(LocalDate.now());
		
		Employee emp1 = new Employee();
		emp1.setName("Raj Malhotra");
		emp1.setSalary(75000.0);
		emp1.setPassport(pass1);

		Employee emp2 = new Employee();
		emp2.setName("Emily Carter");
		emp2.setSalary(85000.0);
		emp2.setPassport(pass2);
		
		session.persist(pass1);
		session.persist(pass2);
		session.persist(emp1);
		session.persist(emp2);
		
		session.beginTransaction().commit();

	}
}
