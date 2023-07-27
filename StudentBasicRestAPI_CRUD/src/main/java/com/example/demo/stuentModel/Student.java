package com.example.demo.stuentModel;

public class Student {
	
	private String studentId;
	private String studentName;
	private String studentAdress;
	private String studentEmail;
	
	
	
	public Student() {
		
	}
	
	public Student(String studentId, String studentName, String studentAdress, String studentEmail) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAdress = studentAdress;
		this.studentEmail = studentEmail;
	}
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAdress() {
		return studentAdress;
	}
	public void setStudentAdress(String studentAdress) {
		this.studentAdress = studentAdress;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	

}
