package com.AutoWiring;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
      ApplicationContext context= new ClassPathXmlApplicationContext("com/AutoWiring/config.xml");
      
      Employee ep1 = context.getBean("ep1",Employee.class);
      
      System.out.println(ep1);
      
    }
}
