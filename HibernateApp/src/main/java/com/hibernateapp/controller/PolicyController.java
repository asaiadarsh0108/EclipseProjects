package com.hibernateapp.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernateapp.model.Policy;

public class PolicyController {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("in_june_be");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		Policy policy = new Policy();
		entityTransaction.begin();
		System.out.println("----Enter policy details----");
		System.out.println("Enter the policy name");
		policy.setName(sc.nextLine());
		System.out.println("Enter policy Tenure:");
		policy.setTenure(sc.nextDouble());
		entityManager.persist(policy);
		entityTransaction.commit();
		System.out.println("Policy added to Db...!");
	}
	
}
