package com.hibernateapp.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernateapp.model.Category;
import com.hibernateapp.model.Product;
import com.hibernateapp.model.Vendor;
import com.hibernateapp.service.CategoryService;
import com.hibernateapp.service.ProductService;
import com.hibernateapp.service.ResourceNotFoundException;
import com.hibernateapp.service.VendorService;

public class InventoryManagementController {
	public static void main(String[] args) {
		EntityManagerFactory  entityManagerFactory = 
				Persistence.createEntityManagerFactory("in_june_be");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		ProductService productService = new ProductService(entityManager, entityTransaction);
		CategoryService categoryService = new CategoryService(entityManager, entityTransaction);
		VendorService vendorService = new VendorService(entityManager, entityTransaction);
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("====Inventory Operations====");
			System.out.println("1.Insert Product");
			System.out.println("2. Get all products");
			System.out.println("3. Delete Product");
			System.out.println("4.Update Product");
			System.out.println("0.Exit");
			int input = sc.nextInt();
			if(input==0) {
				System.out.println("Exiting...!");
				break;
			}
			switch (input) {
			case 1:
				Product product = new Product();
				System.out.println("Enter the product title:");
				sc.nextLine();
				product.setTitle(sc.nextLine());
				System.out.println("Enter price");
				product.setPrice(sc.nextDouble());
				System.out.println("Enter description:");
				sc.nextLine();
				product.setDescription(sc.nextLine());
				System.out.println("Enter Category ID");
				int catId=sc.nextInt();
				/*Step 1: Validate category id : if found return category object*/
				Category category = null;
				try {
					category = categoryService.validateId(catId);
				}
				catch (ResourceNotFoundException e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				System.out.println("Enter vendor ID");
				int vendorId= sc.nextInt();
				/* Step 2: Validate vendorId : if found: return vendor object*/
				Vendor vendor = null;
				 try {
					vendor= vendorService.validateId(vendorId);
				} catch (ResourceNotFoundException e) {
					System.out.println(e.getMessage());
				}
				/* Step 3 : Attach category and vendor objects to product object*/
				product.setCategory(category);
				product.setVendor(vendor);
				/* Step 4 : Save product object*/
				productService.save(product);
				break;
			case 2:
				System.out.println("Enter the category id:");
				int id = sc.nextInt();
				try {
					category = categoryService.validateId(id);
				} catch (ResourceNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				List<Product> list= productService.getAllByCategoryId(id);
				list.stream().forEach(c->System.out.println(c));
				break;
			default:
				break;
			}
		}
	}
}
