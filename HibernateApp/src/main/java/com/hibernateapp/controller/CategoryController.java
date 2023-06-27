package com.hibernateapp.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernateapp.model.Category;

public class CategoryController {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("in_june_be");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Category name:");
		String name = sc.next();
		Category category = new Category();
		category.setCname(name);
		
		
		entityTransaction.begin();
		entityManager.persist(category);
		entityTransaction.commit();
		System.out.println("Category added in DB...!");
	}
}