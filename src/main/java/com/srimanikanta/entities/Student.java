package com.srimanikanta.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int studentid;
	private String rollNumber;
	private String studentName;
	private int studentAge;
	private double studentPercentage;
	private String studentFatherName;
	private String studentMotherName;
	
	public Student(int studentid, String rollNumber, String studentName, int studentAge, double studentPercentage,
			String studentFatherName, String studentMotherName) {
		super();
		this.studentid = studentid;
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentPercentage = studentPercentage;
		this.studentFatherName = studentFatherName;
		this.studentMotherName = studentMotherName;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public double getStudentPercentage() {
		return studentPercentage;
	}

	public void setStudentPercentage(double studentPercentage) {
		this.studentPercentage = studentPercentage;
	}

	public String getStudentFatherName() {
		return studentFatherName;
	}

	public void setStudentFatherName(String studentFatherName) {
		this.studentFatherName = studentFatherName;
	}

	public String getStudentMotherName() {
		return studentMotherName;
	}

	public void setStudentMotherName(String studentMotherName) {
		this.studentMotherName = studentMotherName;
	}
}
