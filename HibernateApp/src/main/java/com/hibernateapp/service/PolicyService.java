package com.hibernateapp.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.hibernateapp.model.Policy;

public class PolicyService {
	private EntityManager entityManager;
	private EntityTransaction entityTransaction;
	public PolicyService(EntityManager entityManager, EntityTransaction entityTransaction) {
		super();
		this.entityManager = entityManager;
		this.entityTransaction = entityTransaction;
	}
	public Policy validateId(int pId) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		Policy p = entityManager.find(Policy.class, pId);
		try {
			if(p==null) {
				throw new ResourceNotFoundException("Policy with the given is not available");
			}
		}
		finally {
			entityTransaction.commit();
		}
		return p;
	}
	
	
}
