package com.lombook.demolombook.service.impl;

import java.util.List;

import com.lombook.demolombook.entity.Cart;

public interface ICartProductService {

	Cart addToCart(Cart cart);
	List<Cart> getcartitems();
	
}
