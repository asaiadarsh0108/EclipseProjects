package com.service;

import com.model.Customer;

public class CustomerService {

	public void deposit(Customer c, int amount) {
		// TODO Auto-generated method stub
		c.setBalance(c.getBalance()+amount);
		
	}

	public void withdrawal(Customer c, int amount) {
		// TODO Auto-generated method stub
		c.setBalance(c.getBalance()-amount);
	}

}
