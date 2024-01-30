package com.MultiSportsShop.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("mainController")
public class MainController {	
	
	@RequestMapping(value="/", method= {RequestMethod.POST, RequestMethod.GET})
	public String main() {
				
		return "/main/main";
	}	
}
