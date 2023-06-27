package com.model;

public class Customer {
	private int id;
	private String name;
	private String city;
	private int balance;
	
	public Customer(int id, String name, String city, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.balance = balance;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public int getBalance() {
		return balance;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
