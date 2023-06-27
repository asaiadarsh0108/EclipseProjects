package com.hibernateapp.controller;

import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernateapp.model.Policy;
import com.hibernateapp.model.PolicyHolder;
import com.hibernateapp.model.PolicyHolderPolicy;
import com.hibernateapp.service.PHPService;
import com.hibernateapp.service.PolicyHolderService;
import com.hibernateapp.service.PolicyService;
import com.hibernateapp.service.ResourceNotFoundException;

public class PolicyHolderPolicyController {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("in_june_be");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		PHPService phpService = new PHPService(entityManager,entityTransaction);
		PolicyService policyService = new PolicyService(entityManager, entityTransaction);
		PolicyHolderService phService = new PolicyHolderService(entityManager, entityTransaction);
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Purchase policy");
			System.out.println("0.Exit");
			int input = sc.nextInt();
			if(input==0) {
				System.out.println("Exiting bye...!");
				break;
			}
			switch (input) {
			case 1:
				System.out.println("Enter the Policy Holder id:");
				int phId = sc.nextInt();
				PolicyHolder ph = null;
				try {
					ph = phService.validateId(phId);
					System.out.println("Enter the Policy id:");
					int pId= sc.nextInt();
					Policy policy =null;
					try {
						policy = policyService.validateId(pId);
						LocalDate dateOfRegistration = LocalDate.now();
						System.out.println("Enter the premium you wish to pay per annum:");
						double premium = sc.nextDouble();
						PolicyHolderPolicy php = new PolicyHolderPolicy();
						php.setPolicy(policy);
						php.setPolicyHolder(ph);
						php.setDateOfRegistration(dateOfRegistration);
						php.setPremium(premium);
						
						phpService.save(php);
						
						System.out.println("Policy purchase Successful...!");
					}
					catch (ResourceNotFoundException e) {
						System.out.println(e.getMessage());
					}
				} catch (ResourceNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
				
//			case 2:
//				System.out.println("Enter the PolicyHolder id:");
//				int phID = sc.nextInt();
//				try {
//					ph= phService.validateId(phId);
//				} catch (ResourceNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				break;
			default:
				break;
			}
		}
	}

}
