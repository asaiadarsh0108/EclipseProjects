package com.hibernateapp.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.hibernateapp.model.Product;

public interface ProductRepository {

	static List<Product> getAll(EntityManager entityManager) {
		// TODO Auto-generated method stub
		List<Product> list = entityManager.createQuery("select p from Product p", Product.class).getResultList();
		return list;
	}

	static List<Product> getByCategoryId(int catId, EntityManager entityManager) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("select p from Product p where p.category.id=:id",Product.class);
		query.setParameter("id", catId);
		List<Product> list = query.getResultList();
		return list;
	}

}
