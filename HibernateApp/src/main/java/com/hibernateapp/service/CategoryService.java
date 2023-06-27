package com.hibernateapp.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.hibernateapp.model.Category;

public class CategoryService {
	private EntityManager entityManager;
	private EntityTransaction entityTransaction;
	public CategoryService(EntityManager entityManager, EntityTransaction entityTransaction) {
		super();
		this.entityManager = entityManager;
		this.entityTransaction = entityTransaction;
	}
	public Category validateId(int catId) throws ResourceNotFoundException{
		// TODO Auto-generated method stub
		entityTransaction.begin();
		Category category=entityManager.find(Category.class, catId);
		try {
			if(category==null) {
				throw new ResourceNotFoundException("Category with the given id doesnot exist");
			}
		}
		finally {
			entityTransaction.commit();
		}
		
		return category;
	}
}
