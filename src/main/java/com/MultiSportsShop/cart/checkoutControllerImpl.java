package com.MultiSportsShop.cart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("checkoutController")
@RequestMapping("/cart")
public class checkoutControllerImpl {

	@RequestMapping(value="/checkOut", method=RequestMethod.GET)
	public String checkOut() {
		return "/cart/checkOut";
	}
}
