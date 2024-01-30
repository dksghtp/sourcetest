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
	 // �ٸ� ��ٱ��� ���� ��ɿ� ���� ������ �߰��� �� �ֽ��ϴ�.
}