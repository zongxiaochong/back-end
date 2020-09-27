package com.app.controller.sys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.pojo.sys.SysMenu;
import com.app.service.sys.IndexService;

@Controller
public class IndexController {
	
	@Autowired
	private IndexService indexService;
	
	@RequestMapping("/index")
	public String index() {
		return "sys/index";
	}
	
	@RequestMapping("/home")
	public String root() {
		return "sys/home";
	}
	
	@GetMapping("/loadMenu")
	@ResponseBody
	public Object loadMenu() {
		List<SysMenu> sysMenuList = indexService.getSysMenuList();
		return sysMenuList;
	}
	
	

}
