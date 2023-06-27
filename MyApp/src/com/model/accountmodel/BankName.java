package com.model.accountmodel;

public class BankName extends BaseEntity{
	
	protected final String bankName="HDFC";

	public BankName(int id) {
		super(id);
	}
	
	public String getBankName() {
		return bankName;
	}
}
