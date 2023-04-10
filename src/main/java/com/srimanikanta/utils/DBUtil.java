package com.srimanikanta.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DBUtil {
	
	public static Configuration getConfig() {
		Configuration configuration = null;
		
		try {
			configuration = new Configuration().configure("hibernate.cfg.xml");
		}catch (Exception e) {
			System.err.println("Unable to fetch the configuration object");
		}
		
		return configuration;
	}
	public static Session getSession(Configuration config) {
		Session session = null;
		
		try {
			ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			SessionFactory sessionFactory = config.buildSessionFactory(registry);
			session = sessionFactory.openSession();			
		}catch (Exception e) {
			System.err.println("Unable to get the Session Object.");
		}
		
		return session;
	}

}
