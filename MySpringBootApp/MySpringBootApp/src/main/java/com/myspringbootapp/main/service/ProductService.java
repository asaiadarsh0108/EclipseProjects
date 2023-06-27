package com.myspringbootapp.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.myspringbootapp.main.model.Product;
import com.myspringbootapp.main.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public Product insert(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> list= productRepository.findAll();
		return list;
	}

	public Product getById(int id) {
		// TODO Auto-generated method stub
		Optional<Product> optional = productRepository.findById(id);
		if(!optional.isPresent()) {
			return null;
		}
		return optional.get();
	}

	public void deleteProduct(Product product) {
		productRepository.delete(product);
	}

}
