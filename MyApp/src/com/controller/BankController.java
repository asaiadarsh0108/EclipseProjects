package com.controller;

import java.util.Scanner;

import com.model.accountmodel.BankCustomer;
import com.service.BankService;

public class BankController {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BankCustomer c1 = new BankCustomer(1,"Savings","Sai","Hyderabad", 120000);
		BankCustomer c2 = new BankCustomer(2,"Current","Adarsh","Banglore",550000);
		
		BankService bankService= new BankService();
		
		bankService.isMinBalanceMaintained(c1);
		System.out.println("Select the below options:");
		System.out.println("1.Deposit\n"+ "2.Withdrawal");
		int var= sc.nextInt();
		System.out.println("Enter the name of the customer");
		String name=sc.next();
		switch(var) {
		
		case 1: System.out.println("Enter the amount to be deposited:");
				int amount=sc.nextInt();
				System.out.println(BankService.bankDeposit(c1,amount));
				break;
				
		case 2: System.out.println("Enter the amount to be withdrawn:");
				amount=sc.nextInt();
				System.out.println(BankService.bankWithdrawal(c1,amount));
				break;
				
		default: System.out.println("Invalid option");
		}
	}
}
