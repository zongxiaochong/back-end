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
@RequestMapping("/sys/menu")
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	@RequestMapping("/index")
	public String sysMenu() {
		return "sys/menuIndex";
	}

	
	@GetMapping("/getMenu")
	@ResponseBody
	public Object getMenu() {
		List<SysMenu> sysMenuList = menuService.getSysMenuList();
		return sysMenuList;
	}
	
}
