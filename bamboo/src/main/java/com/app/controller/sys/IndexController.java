package com.app.controller.sys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.pojo.sys.SysMenu;
import com.app.service.sys.MenuService;

@Controller
public class IndexController {
	
	@Autowired
	private MenuService menuService;
	
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
	
	
	
	@GetMapping("/loadMenu")
	@ResponseBody
	public Object loadMenu() {
		List<SysMenu> sysMenuList = menuService.getSysMenuList();
		return sysMenuList;
	}
	
 

}
