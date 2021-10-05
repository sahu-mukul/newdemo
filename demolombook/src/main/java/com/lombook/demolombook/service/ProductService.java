package com.lombook.demolombook.service;


import com.lombook.demolombook.entity.Product;
import com.lombook.demolombook.repository.ProductRepository;
import com.lombook.demolombook.service.impl.IProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductService implements IProductService
{
	 @Autowired
	    public ProductRepository productrepository;

	    public void save(Product product) {
			this.productrepository.save(product);
		}
	    
	    public List<Product> findAll() {
			return this.productrepository.findAll();
		}
	   
	  
	
	    
	    
	  
			

}