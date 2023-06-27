package com.myspringbootapp.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myspringbootapp.main.model.Product;
import com.myspringbootapp.main.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/hello")
	public String get() {
		return "hello";
	}
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		return productService.insert(product);
	}
	
	@GetMapping("/getall")
	public List<Product> getAllProducts(){
		List<Product> product= productService.getAllProducts();
		return product;
	}
	
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<?> getById(@PathVariable int id) {
		Product product = productService.getById(id);
		if(product==null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("invalid id given");
		}
		return ResponseEntity.status(HttpStatus.OK).body(product);
	}
	
	@PutMapping("/edit/{id}")
	public ResponseEntity<?> editProduct(@PathVariable int id, @RequestBody Product newProduct) {
		if(newProduct.getName()==null || !(newProduct.getName().trim().matches("[a-zA-Z0-9- ]+"))){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Name cannot be null");
		}
		if(newProduct.getDescription()==null || newProduct.getDescription().trim().equals("")){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Description cannot be null");
		}
		
		Product oldProduct = productService.getById(id);
		if(oldProduct==null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("invalid id");
		}
		newProduct.setId(oldProduct.getId());
		productService.insert(newProduct);
		return ResponseEntity.status(HttpStatus.OK).body(newProduct);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteEntry(@PathVariable int id){
		Product product = productService.getById(id);
		if(product==null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid id given");
		}
		productService.deleteProduct(product);
		return ResponseEntity.status(HttpStatus.OK).body("Product deleted");
	}
}


