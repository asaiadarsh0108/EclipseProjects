package com.hibernateapp.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.hibernateapp.model.PolicyHolder;

public class PolicyHolderService {
	private EntityManager entityManager;
	private EntityTransaction entityTransaction;
	public PolicyHolderService(EntityManager entityManager, EntityTransaction entityTransaction) {
		super();
		this.entityManager = entityManager;
		this.entityTransaction = entityTransaction;
	}
	public PolicyHolder validateId(int phId) throws ResourceNotFoundException{
		// TODO Auto-generated method stub
		entityTransaction.begin();
		PolicyHolder ph= entityManager.find(PolicyHolder.class, phId);
		try {
			if(ph==null) {
				throw new ResourceNotFoundException("The Policy holder with the given Id is Not Available");
			}
		}
		finally {
			entityTransaction.commit();
		}
		
		return ph;
	}
}
