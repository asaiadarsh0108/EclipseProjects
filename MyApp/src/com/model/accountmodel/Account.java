package com.model.accountmodel;

public class Account extends BankName {
	protected String AccountType;
	protected final int minBalance=10000;
	
	public Account(int id, String accountType) {
		super(id);
		AccountType = accountType;
	}
	
	public String getAccountType() {
		return AccountType;
	}
	public int getMinBalance() {
		return minBalance;
	}
	
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
}
