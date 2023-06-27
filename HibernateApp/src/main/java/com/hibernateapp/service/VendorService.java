package com.hibernateapp.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.hibernateapp.model.Vendor;

public class VendorService {
	private EntityManager entityManager;
	private EntityTransaction entityTransaction;
	public VendorService(EntityManager entityManager, EntityTransaction entityTransaction) {
		super();
		this.entityManager = entityManager;
		this.entityTransaction = entityTransaction;
	}
	public Vendor validateId(int vendorId) throws ResourceNotFoundException{
		// TODO Auto-generated method stub
		entityTransaction.begin();
		Vendor vendor=entityManager.find(Vendor.class, vendorId);
		try {
			if(vendor==null) {
				throw new ResourceNotFoundException("Vendor with the given id is not found");
			}
		}
		finally {
			entityTransaction.commit();
		}
		return vendor;
	}
}
