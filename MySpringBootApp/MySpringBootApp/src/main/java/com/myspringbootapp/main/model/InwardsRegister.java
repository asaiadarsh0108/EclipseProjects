package com.myspringbootapp.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class InwardsRegister {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	@ManyToOne
	@Column(name="product_id")
	private Product product;
	
	@ManyToOne
	@Column(name="godown_id")
	private Godown godown;
	
	@ManyToOne
	@Column(name="supplier_id")
	private Supplier supplier;
	
	
}
