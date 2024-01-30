package com.MultiSportsShop.service;

import java.util.List;

public interface cartService {
	
	void addToCart(String productName, double productPrice);
    List<cartItem> getCartItems();

}
