package com.service;

import com.model.accountmodel.BankCustomer;

public class BankService {

	public void isMinBalanceMaintained(BankCustomer c) {
		// TODO Auto-generated method stub
		if(c.getBalance()<c.getMinBalance()) {
			System.out.println("Minimum Balance is not maintained");
		}
		else {
			System.out.println("Minimum Balance is maintained");
		}
	}

	public static int bankDeposit(BankCustomer c,int amount) {
		// TODO Auto-generated method stub
		c.setBalance(c.getBalance()+amount);
		return c.getBalance();
		
	}

	public static int bankWithdrawal(BankCustomer c, int amount) {
		// TODO Auto-generated method stub
		c.setBalance(c.getBalance()-amount);
		return c.getBalance();
	}

}
