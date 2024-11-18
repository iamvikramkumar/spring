package com.ksoft.bean;

public class Book {

	private int isbn;
	private String name;
	private double price;
	private String author;

	public int getIsbn() {
		return isbn;
	}

	// @Value("4567899")
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	// @Value("Java Complete Reference")
	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	// @Value("450.25")
	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	// @Value("Herbert Schildt")
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", price=" + price + ", author=" + author + "]";
	}

}
