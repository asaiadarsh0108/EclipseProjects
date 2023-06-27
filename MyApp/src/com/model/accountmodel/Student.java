package com.model.accountmodel;

public class Student extends BaseEntity implements Comparable<Student>{
	
	protected String name;
	protected String city;
	protected int marks;
	public Student(int id, String name, String city, int i) {
		super(id);
		this.name = name;
		this.city = city;
		this.marks = i;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public int getMarks() {
		return marks;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", marks=" + marks + ", id=" + id + "]";
	}
	@Override
	public int compareTo(Student s) {
		return (int) s.id-this.id;
	}
	
	
}
