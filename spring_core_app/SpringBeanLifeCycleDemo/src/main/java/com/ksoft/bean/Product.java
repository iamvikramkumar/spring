package com.ksoft.bean;

public class Product {

	private int id;
	private String name;
	private String price;

	public Product() {
		System.out.println("Product.Product() constructor called");
	}
	
	public void postInitOfBean() {
		System.out.println("performing post initialization of product bean");
	}

	public void preDestroyOfBean() {
		System.out.println("performing pre destroy operations of product bean");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Product.setId()");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Product.setName()");
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		System.out.println("Product.setPrice()");
		this.price = price;
	}

}
