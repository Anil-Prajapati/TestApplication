package com.Incident.model;

public class Student {
	
	private int rollno;
	private String name;
	private String cource;
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public Student(int rollno, String name, String cource) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.cource = cource;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", cource=" + cource + "]";
	}
	
	
	

}
