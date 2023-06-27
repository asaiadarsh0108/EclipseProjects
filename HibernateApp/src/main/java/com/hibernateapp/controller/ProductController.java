package com.hibernateapp.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.hibernateapp.model.Product;
import com.hibernateapp.service.ProductService;
import com.hibernateapp.service.ResourceNotFoundException;

public class ProductController {
	public static void main(String[] args){
		/* connect to persistance.xml file and load persistance-unit*/
		
		EntityManagerFactory  entityManagerFactory = 
				Persistence.createEntityManagerFactory("in_june_be");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Scanner sc = new Scanner(System.in);
		ProductService productService = new ProductService(entityManager, entityTransaction);
		while(true) {
			System.out.println("====Hibernate Operations====");
			System.out.println("1.Insert Product");
			System.out.println("2. Get all products");
			System.out.println("3. Delete Product");
			System.out.println("0.Exit");
			int input= sc.nextInt();
			if(input==0) {
				System.out.println("Exiting byee...!");
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
				productService.save(product);
				System.out.println("Product saved in DB");
				break;
			case 2:
				List<Product> list = productService.getAll(entityManager);
				list.stream().forEach(p->System.out.println(p));
				break;
			case 3:
				System.out.println("Enter the Product id to delete");
				int id = sc.nextInt();
				
				try {
					Product p = productService.validateId(id);
					productService.delete(p);
					System.out.println("Product deleted");
				} catch (ResourceNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Enter the product id to update:");
				id= sc.nextInt();
				try {
					Product prod=productService.validateId(id);
					System.out.println("Enter the product title");
					sc.nextLine();
					prod.setTitle(sc.nextLine());
					System.out.println("Enter the price of mobile");
					prod.setPrice(sc.nextDouble());
					System.out.println("Enter the description:");
					sc.nextLine();
					prod.setDescription(sc.nextLine());
					productService.update(prod);
					System.out.println("Product updated successfully...!");
				} catch (ResourceNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
				break;
				
			default:
				System.out.println("Invalid input, Try again...");
				break;
			}
		}
		System.out.println("works...!");
	}
}
/*
 Assumpstion : JVM must auto search for META-INF folder in java folder, and within META-INF it should find persistance.xml 
*/
