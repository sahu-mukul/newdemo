package com.lombook.demolombook.entity;



import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CART")
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name="created_date")
	private LocalDate created_date;
	private int userid;
	private int productquantity;
	private int productid;
	private String productName;
	
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String name) {
		this.productName = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getProductquantity() {
		return productquantity;
	}
	
	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}
	
	public int getProductid() {
		return productid;
	}
	
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public LocalDate getCreated_date() {
		return created_date;
	}
	
	public void setCreated_date(LocalDate localDate) {
		this.created_date = localDate;
	}
	
	public int getUserid() {
		return userid;
	}
	
	public void setUserid(int userid) {
		this.userid = userid;
	}
	

}