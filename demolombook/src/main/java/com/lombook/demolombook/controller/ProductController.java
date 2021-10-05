package com.lombook.demolombook.controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import com.lombook.demolombook.entity.Product;
import com.lombook.demolombook.entity.User;
import com.lombook.demolombook.service.ProductService;



@RestController
@RequestMapping("/rest/auth")
@CrossOrigin(origins = "http://localhost:8080") 	
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/")
    public String login()
    {
    	return "auth successfully";
    }
    
    @GetMapping(produces = "products")
	@RequestMapping({ "/validateLogin" })
	public User validateLogin() {
		return new User("User successfully authenticated");
	}
    
   
    @PostMapping("/addProduct")
    public ResponseEntity<Product> create(@RequestBody Product product) {
		this.service.save(product);
		return new ResponseEntity<Product>(product, HttpStatus.CREATED);
	}
  
    @GetMapping("/products")
    public ResponseEntity<List<Product>> findAll() {
		List<Product> products = this.service.findAll();
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
      

    
    
}