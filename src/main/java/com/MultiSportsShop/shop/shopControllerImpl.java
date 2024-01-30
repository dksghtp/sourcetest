package com.MultiSportsShop.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("shopController")
@RequestMapping(value="/shop")
public class shopControllerImpl {

	@RequestMapping(value="/showShop", method=RequestMethod.GET)
	public String showShop(){
		return"/shop/showShop";
	}
}
