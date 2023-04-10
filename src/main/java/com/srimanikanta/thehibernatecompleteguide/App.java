package com.srimanikanta.thehibernatecompleteguide;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.srimanikanta.entities.Student;

public class App {
    public static void main( String[] args ){
    	
    	try {
    		
    		// Reading the Configuration Values from the Configuration file.
    		Configuration config = new Configuration();
    		config.configure("hibernate.cfg.xml");    		
    		
    		// Attaching the Annotated Class to the Configuration -- Very Important
    		
    		config.addAnnotatedClass(Student.class);
    		
    		// Creating the Service Registry Object.
    		ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
    		
    		// Creating the Session Factory Object to enable to the Session
    		SessionFactory sessionFactory = config.buildSessionFactory(registry);
    		
    		// Creating the Session Object from the session factory object.
    		Session session = sessionFactory.openSession();
    		
    		// Creating the employee object to store the record in database.
    		Student employee = new Student(1, "23D8E8320A11", "Peter Doe", 17, 98.5, "John Doe", "Mary Doe");
    		
    		// Starting the Transaction
    		
    		Transaction transaction = session.beginTransaction();
    		
    		session.save(employee);
    		
    		transaction.commit();
    		
    		System.out.println("Record Stored Successfully into the DB.");
    		
    	}catch(Exception e) {
    		System.out.println("Unable to Store the Student Record" + e);
    	}
    	
    }
}
