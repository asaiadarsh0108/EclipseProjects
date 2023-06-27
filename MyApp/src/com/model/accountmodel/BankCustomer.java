package com.model.accountmodel;

public class BankCustomer extends Account{

	protected String ename;
	protected String city;
	protected int balance;
	public BankCustomer(int id, String accountType, String ename, String city, int balance) {
		super(id, accountType);
		this.ename = ename;
		this.city = city;
		this.balance = balance;
	}
	
	public String getEname() {
		return ename;
	}
	public String getCity() {
		return city;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
