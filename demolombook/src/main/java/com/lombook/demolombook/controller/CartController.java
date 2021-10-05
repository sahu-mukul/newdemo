package com.lombook.demolombook.controller;


import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lombook.demolombook.entity.Cart;
import com.lombook.demolombook.entity.Product;
import com.lombook.demolombook.service.CartService;

@RestController
@RequestMapping("/show/cart")
@CrossOrigin(origins = "http://localhost:8080")
public class CartController {

	@Autowired
	private CartService cartservice;
	
	 @PostMapping("/addToCart")
	 public ResponseEntity<Cart> addToCart(@RequestBody Product product){
		 Cart cart=new Cart();
		 cart.setProductid(product.getId());
		 cart.setProductName(product.getName());
		 cart.setProductquantity(1);
		 cart.setUserid(1);
		 LocalDate localDate = LocalDate.now();
		 cart.setCreated_date(localDate);
		 this.cartservice.addToCart(cart);
	   return  new ResponseEntity<Cart>(cart, HttpStatus.CREATED);
	 }
	
	 
	 @GetMapping("/mycart")
	 public ResponseEntity<List<Cart>> mycart() {
		 List<Cart> carts = this.cartservice.getcartitems();
	        return new ResponseEntity<List<Cart>>(carts, HttpStatus.OK);
	    }
	 
	 
	 
}
