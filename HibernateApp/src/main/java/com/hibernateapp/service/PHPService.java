package com.hibernateapp.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.hibernateapp.model.PolicyHolder;
import com.hibernateapp.model.PolicyHolderPolicy;

public class PHPService {
	
	private EntityManager entityManager;
	private EntityTransaction entityTransaction;
	
	public PHPService(EntityManager entityManager, EntityTransaction entityTransaction) {
		super();
		this.entityManager = entityManager;
		this.entityTransaction = entityTransaction;
	}

	public void save(PolicyHolderPolicy php) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(php);
		entityTransaction.commit();
		
	}

}
