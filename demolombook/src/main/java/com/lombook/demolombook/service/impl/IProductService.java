package com.lombook.demolombook.service.impl;

import java.util.List;

import com.lombook.demolombook.entity.Product;

public interface IProductService {

	
	void save(Product contact);
	List<Product> findAll();
	
}
