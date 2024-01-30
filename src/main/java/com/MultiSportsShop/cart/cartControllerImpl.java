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
        // myCartList에 대한 로직을 구현하고, 모델에 필요한 데이터를 추가한다.
        // 예를 들어, 장바구니에 담긴 상품 목록을 모델에 추가한다.
        model.addAttribute("cartItems", cartService.getCartItems());

        // "myCartList"에 해당하는 뷰를 반환한다.
        return "/cart/myCartList";
    }
    
    @PostMapping("/checkOut")
    public String checkout() {
        // 주문하기 버튼을 클릭하면 이 메서드가 호출됩니다.
        // 모델에 필요한 데이터를 추가합니다.
        

        // Checkout 페이지로 이동하는 뷰 이름을 반환합니다.
        return "/cart/checkOut";
    }
    // 다른 장바구니 관련 메서드를 구현할 수 있습니다.
}
