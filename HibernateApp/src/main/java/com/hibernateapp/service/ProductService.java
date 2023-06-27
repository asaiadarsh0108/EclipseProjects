package com.hibernateapp.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.hibernateapp.model.Product;
import com.hibernateapp.persistence.ProductRepository;

public class ProductService {

	private EntityManager entityManager;
	private EntityTransaction entityTransaction;
	public ProductService(EntityManager entityManager, EntityTransaction entityTransaction) {
		super();
		this.entityManager = entityManager;
		this.entityTransaction = entityTransaction;
	}
	public void save(Product product) {
		// TODO Auto-generated method 
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
	}
	public List<Product> getAll(EntityManager entityManager) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		List<Product> list=ProductRepository.getAll(entityManager);
		entityTransaction.commit();
		return list;
	}
	public Product validateId(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		Product p=entityManager.find(Product.class, id);
		try {
			if(p==null) {
				throw new ResourceNotFoundException("Product with the given id is not available");
			}
		}
		finally {
			entityTransaction.commit();
		}
		return p;
	}
	public void delete(Product p) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.remove(p);
		entityTransaction.commit();
	}
	public void update(Product prod) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.merge(prod);
		entityTransaction.commit();
		
	}
	public List<Product> getAllByCategoryId(int catId) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		List<Product> list = ProductRepository.getByCategoryId(catId,entityManager);
		entityTransaction.commit();
		return list;
	}
}
