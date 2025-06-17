package com.OneToOne;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class GetAndLoad {

	public static void main(String[] args) {
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		Employee employee =session.get(Employee.class, 2);
		System.out.println(employee.getName());
		System.out.println();
		System.out.println(employee.getPassport().getPassportNo());
		
		System.out.println(employee.getPassport().getIssuedCountry());
		
		employee.setName("Hrishikesh");
		
		session.update(employee);
		
		
		session.beginTransaction().commit();
		
		
		

	}
	
}
