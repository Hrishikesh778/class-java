package com.HibernateAnnotation;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
      Session session=  new Configuration().configure().buildSessionFactory().openSession();
      
      Employee ep1= new Employee("Ravi",25000.0,true);
      Employee ep2= new Employee("Ram",25000.0,true);
      Employee ep3= new Employee("Raj",25000.0,true);
      
     Transaction tx = session.beginTransaction();
     
     session.persist(ep1);
     session.persist(ep2);
     session.persist(ep3);
     
     tx.commit();
    }
}
