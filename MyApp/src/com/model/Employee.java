package com.model;

public class Employee {
	private int id;
	private String name;
	private String city;
	private String department;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public String getDepartment() {
		return department;
	}
	public double getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
