package com.lombook.demolombook.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String Productname;
	private double Productprice;
	private int StartingInventory;
	private int InventoryShipped;
	private int InventoryOnHand;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Productname;
	}
	public void setName(String name) {
		this.Productname = name;
	}

	public double getPrice() {
		return Productprice;
	}
	public void setPrice(double price) {
		this.Productprice = price;
	}
	public int getStartingInventory() {
		return StartingInventory;
	}
	public void setStartingInventory(int startingInventory) {
		StartingInventory = startingInventory;
	}
	public int getInventoryShipped() {
		return InventoryShipped;
	}
	public void setInventoryShipped(int inventoryShipped) {
		InventoryShipped = inventoryShipped;
	}
	public int getInventoryOnHand() {
		return InventoryOnHand;
	}
	public void setInventoryOnHand(int inventoryOnHand) {
		InventoryOnHand = inventoryOnHand;
	}
	
}
