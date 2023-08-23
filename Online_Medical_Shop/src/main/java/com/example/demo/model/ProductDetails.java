package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class ProductDetails {
@Id
private Integer productID;
private String name;
private String description;
private Integer price;
private Integer quantity;
private LocalDate manufacturdeDate;
private LocalDate expireDate;
public Integer getProductID() {
	return productID;
}
public void setProductID(Integer productID) {
	this.productID = productID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}
public Integer getQuantity() {
	return quantity;
}
public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}
public LocalDate getManufacturdeDate() {
	return manufacturdeDate;
}
public void setManufacturdeDate(LocalDate manufacturdeDate) {
	this.manufacturdeDate = manufacturdeDate;
}
public LocalDate getExpireDate() {
	return expireDate;
}
public void setExpireDate(LocalDate expireDate) {
	this.expireDate = expireDate;
}
public ProductDetails(Integer productID, String name, String description, Integer price, Integer quantity,
		LocalDate manufacturdeDate, LocalDate expireDate) {
	super();
	this.productID = productID;
	this.name = name;
	this.description = description;
	this.price = price;
	this.quantity = quantity;
	this.manufacturdeDate = manufacturdeDate;
	this.expireDate = expireDate;
}
public ProductDetails() {
	super();
	// TODO Auto-generated constructor stub
}

}
