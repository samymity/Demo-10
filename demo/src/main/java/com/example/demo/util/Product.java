package com.example.demo.util;

public class Product {
	
	
	public Product(String name, double price, int quantity, String description) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		Description = description;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	String name;
	double price;
	int quantity ;
	String Description;
	
	
	

}
