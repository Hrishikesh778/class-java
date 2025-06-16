package com.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
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
        
       Session session = new Configuration().configure().buildSessionFactory().openSession();
       
       Certificate c1= new Certificate();    
       c1.setName("FrontEnd");
       
       Certificate c2= new Certificate();    
       c2.setName("BackEnd");
       
       Certificate c3= new Certificate();    
       c3.setName("CCNA");
       
       List<Certificate> certi =new ArrayList<Certificate>();
       certi.add(c1);
       certi.add(c2);
       certi.add(c3);
       
        
       Student st1=new Student();
       st1.setName("ravi");
       st1.setStd(13);
       
       Student st2=new Student();
       st2.setName("raju");
       st2.setStd(13);
       
       st1.setCertificates(certi);
       st2.setCertificates(certi);
       
       List<Student> st =new ArrayList<Student>();
       st.add(st1);
       st.add(st2);
       
       
       
       
       c1.setStudents(st);
       c2.setStudents(st);
       c3.setStudents(st);
       
       
       session.persist(st1);
       session.persist(st2);
       session.persist(c1);
       session.persist(c2);
       session.persist(c3);
       
       session.beginTransaction().commit();

       
    
       
    }
}
