package com.lombook.demolombook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lombook.demolombook.entity.Cart;
import com.lombook.demolombook.entity.Product;
import com.lombook.demolombook.repository.CartRepository;
import com.lombook.demolombook.repository.ProductRepository;
import com.lombook.demolombook.service.impl.ICartProductService;



    @Service
	public class CartService implements ICartProductService  {

    	public int remainquantity;
		@Autowired
		private CartRepository cartrepository;
		@Autowired
        private ProductRepository productrepository;
		
		public Cart addToCart(Cart cart) {
			Cart cartRow;
		
			Optional<Product> product;
			product=productrepository.findById(cart.getProductid());
			Product productrow;
			productrow=product.get();
			int qty;
			int ship;
		    
			qty=productrow.getStartingInventory();
		
			ship=productrow.getInventoryShipped();
			
			remainquantity = qty-(ship+1);
			
			productrow.setInventoryOnHand(remainquantity);
			
			productrow.setInventoryShipped(ship+1);
			productrepository.save(productrow);
			cartRow=cartrepository.save(cart);
		//	System.out.println(productrow.getInventoryOnHand());
		
			return cartRow;
			
		}
		
		public List<Cart> getcartitems()
		{
			return cartrepository.findAll();
		}
	

}
