package com.MultiSportsShop.cart;

import com.MultiSportsShop.service.cartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/cart", method= {RequestMethod.GET, RequestMethod.POST})
public class cartControllerImpl implements cartController {

    private final cartService cartService;

    @Autowired
    public cartControllerImpl(cartService cartService) {
        this.cartService = cartService;
    }

    @Override
    public void addToCart(String productName, double productPrice) {
        cartService.addToCart(productName, productPrice);
    }
    
    @GetMapping("/myCartList")
    public String myCartList(Model model) {
        // myCartList�� ���� ������ �����ϰ�, �𵨿� �ʿ��� �����͸� �߰��Ѵ�.
        // ���� ���, ��ٱ��Ͽ� ��� ��ǰ ����� �𵨿� �߰��Ѵ�.
        model.addAttribute("cartItems", cartService.getCartItems());

        // "myCartList"�� �ش��ϴ� �並 ��ȯ�Ѵ�.
        return "/cart/myCartList";
    }
    
    @PostMapping("/checkOut")
    public String checkout() {
        // �ֹ��ϱ� ��ư�� Ŭ���ϸ� �� �޼��尡 ȣ��˴ϴ�.
        // �𵨿� �ʿ��� �����͸� �߰��մϴ�.
        

        // Checkout �������� �̵��ϴ� �� �̸��� ��ȯ�մϴ�.
        return "/cart/checkOut";
    }
    // �ٸ� ��ٱ��� ���� �޼��带 ������ �� �ֽ��ϴ�.
}
