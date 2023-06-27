package com.employee.main.model;

public class Employee {
	
	private int id;
	
	private String name;
	
	private String phoneNo;
	
	private Long salary;

	public Employee(int id, String name, String phoneNo, Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}
}
