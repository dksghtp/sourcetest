package com.MultiSportsShop.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("memberController")
@RequestMapping(value="/member")
public class memberControllerImpl {

	@RequestMapping(value="login", method=RequestMethod.GET)
	public String loginGet() {
		
		return "/member/login";
	}
}
