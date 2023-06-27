package com.StudentApp.model;

public class Student {
	private int id;
	private String name;
	private String department;
	private int rollNo;
	private int marks;
	public Student(int id, String name, String department, int rollNo, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public int getRollNo() {
		return rollNo;
	}
	public int getMarks() {
		return marks;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", rollNo=" + rollNo + ", marks="
				+ marks + "]";
	}
	
	
}
