package com.myspringbootapp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myspringbootapp.main.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
