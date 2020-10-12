package com.app.controller.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys/user")
public class UserController {

	
	@RequestMapping("/index")
	public String index() {
		return "sys/userIndex";
	}
	
}
