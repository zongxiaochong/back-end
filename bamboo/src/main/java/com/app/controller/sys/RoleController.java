package com.app.controller.sys;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.common.PageParams;
import com.app.service.sys.RoleService;

@Controller
@RequestMapping("/sys/role")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/index")
	public String sysRole() {
		return "sys/roleIndex";
	}
	
	@GetMapping("/")
	@ResponseBody
	public void list(HttpServletRequest request) {
		PageParams pageParams = new PageParams(request);
		
	}
	
	
	
	
}
