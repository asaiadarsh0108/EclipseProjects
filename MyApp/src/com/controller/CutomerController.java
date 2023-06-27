package com.controller;

import com.model.Customer;
import com.service.CustomerService;

public class CutomerController {
	public static void main(String[] args) {
		Customer c1 = new Customer(1,"sai","Hyderabad",120000);
		Customer c2 = new Customer(2,"adarsh","banglore",11000);
		
		CustomerService service = new CustomerService();
		service.deposit(c1,2000);
		service.deposit(c2, 25000);
		
		System.out.println("Balance after deposit="+c1.getBalance());
		System.out.println("Balance after deposit="+c2.getBalance());
		
		service.withdrawal(c1,25000);
		System.out.println("Balance after withdrawal="+c1.getBalance());
	}

}
