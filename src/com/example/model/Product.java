package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "items")
public class Product {
	@Id
	@Column(name="barcode", unique = true)
	protected int barcode;
	
	@Column(name="name")
	protected String name;
	
	@Column(name="color")
	protected String color;
	
	@Column(name="description")
	protected String description;
	
	public Product() {
		
	}
	
	public Product(int barcode, String name, String color, String des) {
		super();
		this.barcode = barcode;
		this.name = name;
		this.color = color;
		this.description = des;
	}
	
	public int getBarcode() {
		return barcode;
	}
	public void setBarcode(int bc) {
		this.barcode = bc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDescription() {
		return description;
	}
	public void setCountry(String des) {
		this.description = des;
	}

}
