package com.MultiSportsShop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class cartServiceImpl implements cartService {

    private final List<cartItem> cartItems = new ArrayList<>();

    @Override
    public void addToCart(String productName, double productPrice) {
        cartItem cartItem = new cartItem(productName, productPrice);
        cartItems.add(cartItem);
    }

	@Override
	public List<cartItem> getCartItems() {
	    return cartItems;
	 }
	 // 다른 장바구니 관련 기능에 대한 구현을 추가할 수 있습니다.
}