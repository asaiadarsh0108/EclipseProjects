package com.model.accountmodel;

public class BaseEntity {
	public int id;

	public BaseEntity(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
