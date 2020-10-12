package com.app.controller.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys")
public class SysController {
	
	
	@RequestMapping("/index")
	public String index() {
		return "sys/index";
	}
	
	@RequestMapping("/home")
	public String root() {
		return "sys/home";
	}
	
	
	@RequestMapping("/dict")
	public String dict() {
		return "sys/dict";
	}
	
	

 

}
