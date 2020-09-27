package com.app.controller.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@RequestMapping("/index")
	public String sysMenu() {
		return "sys/menuIndex";
	}

	@RequestMapping("/index1")
	public String index1() {
		return "sys/menuIndex1";
	}
}
