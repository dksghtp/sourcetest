package com.MultiSportsShop.cart;

import org.springframework.ui.Model;

public interface cartController {
	void addToCart(String productName, double productPrice);
    // �ٸ� ��ٱ��� ���� �޼��带 �ʿ信 ���� �߰��� �� �ֽ��ϴ�.
	
	// �޼��� �ñ״�ó�� �ִµ�, ������ �ش� �������̽��� ������ Ŭ�������� �̷�����ϴ�.
    String myCartList(Model model);
    
    // �ٸ� �޼����...
	
}