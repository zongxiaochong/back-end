package com.app.controller.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys/role")
public class RoleController {

	
	@RequestMapping("/index")
	public String sysRole() {
		return "sys/roleIndex";
	}
	
	
}
