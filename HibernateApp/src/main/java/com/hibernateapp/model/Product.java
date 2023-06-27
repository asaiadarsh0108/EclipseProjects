package com.hibernateapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
//hibernate will create product table
public class Product {
	@Id//this will make id as primary key
	@GeneratedValue(strategy = GenerationType.AUTO)//this makes it auto_incremental
	private int id;
	
	@Column(name="ptitle")//By default, String will be varchar(255) size
	private String title;
	
	private double price;
	
	@Column(length=2000)//it will reserve varchar(2000) chars for description
	private String description;

	@ManyToOne
	Category category;
	
	@ManyToOne
	Vendor vendor;
	
	public Category getCategory() {
		return category;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", price=" + price + ", description=" + description + "]";
	}
}
