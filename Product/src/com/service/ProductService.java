package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductService {
	public List<Product> getAllProducts(){
		Product p1= new Product();
		Product p2= new Product();
		Product p3= new Product();
		
		p1.setId(1);
		p1.setTitle("Pencil");
		p1.setDescription("Made of wood");
		p1.setPrice(120);
		
		p2.setId(2);
		p2.setTitle("Pen");
		p2.setDescription("Made of Plastic");
		p2.setPrice(110);
		
		p3.setId(3);
		p3.setTitle("Box");
		p3.setDescription("Made of Iron");
		p3.setPrice(210);
		
		List<Product> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		return list;
		
	}
}
