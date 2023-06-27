package com.hibernateapp.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernateapp.model.PolicyHolder;

public class PolicyHolderController {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("in_june_be");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		PolicyHolder policyHolder = new PolicyHolder();
		
		entityTransaction.begin();
		System.out.println("----Enter Policy Holder details---");
		System.out.println("Enter name:");
		policyHolder.setName(sc.nextLine());
		System.out.println("Enter age:");
		policyHolder.setAge(sc.nextInt());
		System.out.println("Enter city:");
		policyHolder.setCity(sc.next());
		
		entityManager.persist(policyHolder);
		
		entityTransaction.commit();
		System.out.println("Policy holder added to Db...!");
	}
}
