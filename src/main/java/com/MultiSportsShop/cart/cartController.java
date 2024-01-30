package com.MultiSportsShop.cart;

import org.springframework.ui.Model;

public interface cartController {
	void addToCart(String productName, double productPrice);
    // 다른 장바구니 관련 메서드를 필요에 따라 추가할 수 있습니다.
	
	// 메서드 시그니처만 있는데, 구현은 해당 인터페이스를 구현한 클래스에서 이루어집니다.
    String myCartList(Model model);
    
    // 다른 메서드들...
	
}