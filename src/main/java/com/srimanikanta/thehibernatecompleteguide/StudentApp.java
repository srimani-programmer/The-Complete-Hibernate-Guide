package com.srimanikanta.thehibernatecompleteguide;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.srimanikanta.entities.Student;
import com.srimanikanta.utils.DBUtil;

public class StudentApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
//			int id = sc.nextInt();
//			String rollNumber = sc.next();
//			String studentName = sc.next();
//			int studentAge = sc.nextInt();
//			double studentPercentage = sc.nextDouble();
//			String fatherName = sc.next();
//			String motherName = sc.next();
			
			Student student = new Student(1, "22D6JH93729A11", "Alex", 17, 92.7, "Thomas", "Julie");
			
			Configuration config =  DBUtil.getConfig();
			
			config.addAnnotatedClass(Student.class);
			
			Session session = DBUtil.getSession(config);
			
			Transaction transaction = session.beginTransaction();
			
			session.save(student);
			
			transaction.commit();
			
			System.out.println("Record Stored Successfully.");
		}catch(Exception e) {
			System.err.println("Unable to Store the Record " + e);
		}finally {
			sc.close();
		}
	}
}
