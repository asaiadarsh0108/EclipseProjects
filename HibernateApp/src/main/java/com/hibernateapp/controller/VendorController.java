package com.hibernateapp.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.loader.custom.ScalarResultColumnProcessor;

import com.hibernateapp.model.Category;
import com.hibernateapp.model.Vendor;

public class VendorController {
	public static void main(String[] args) {
		EntityManagerFactory  entityManagerFactory = 
				Persistence.createEntityManagerFactory("in_june_be");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Vendor Name");
		String name = sc.nextLine();
		System.out.println("Enter vendor city:");
		String city = sc.next();
		Vendor vendor= new Vendor();
		vendor.setName(name);
		vendor.setCity(city);
		
		
		entityTransaction.begin();
		entityManager.persist(vendor);
		entityTransaction.commit();
		System.out.println("Category added in DB...!");
	}
}
