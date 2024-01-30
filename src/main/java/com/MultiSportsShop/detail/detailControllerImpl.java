package com.MultiSportsShop.detail;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("detailController")
@RequestMapping(value="/detail")
public class detailControllerImpl {

	@RequestMapping(value="shopDetail", method=RequestMethod.GET)
	public String shopDetail() {
		return "/detail/shopDetail";
	}
}
