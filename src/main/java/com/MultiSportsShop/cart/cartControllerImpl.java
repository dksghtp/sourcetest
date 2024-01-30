package com.MultiSportsShop.cart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("cartController")
@RequestMapping(value="/cart")
public class cartControllerImpl implements cartController {

	@RequestMapping(value="/myCartList", method=RequestMethod.GET)
    public String myCartList() {
		
        return "/cart/myCartList"; 
    }
}
