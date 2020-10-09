package com.app.controller.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.common.ResponseData;
import com.app.util.StringUtils;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String root() {
		return "login";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	
	@GetMapping("/getValidCode")
	@ResponseBody
	public Object validCode() {
		ResponseData result = new ResponseData(200);
		result.setData(StringUtils.randomCode(4));
		return result;
	}
	
	


}
