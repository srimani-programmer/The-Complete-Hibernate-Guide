package com.srimanikanta.thehibernatecompleteguide;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.srimanikanta.entities.Student;
import com.srimanikanta.utils.DBUtil;

public class FetchingStudentDetails {
	
	public static void main(String[] args) {
		
		Configuration config = DBUtil.getConfig();
		
		config.addAnnotatedClass(Student.class);
		
		Session session = DBUtil.getSession(config);
		
		Transaction transaction = session.beginTransaction();
		
		Student student = session.get(Student.class, 1);
		
		if(student != null) {
			System.out.println("Student Roll Number: " + student.getRollNumber());
			System.out.println("Student Name: " + student.getStudentName());
			System.out.println("Student Age: " + student.getStudentAge());
			System.out.println("Student Percentage: " + student.getStudentPercentage());
			System.out.println("Student Father Name: " + student.getStudentFatherName());
			System.out.println("Student Mother Name: " + student.getStudentMotherName());
			
		}
		transaction.commit();
		
	}

}
