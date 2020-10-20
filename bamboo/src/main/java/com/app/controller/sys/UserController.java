package com.app.controller.sys;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.common.GlobalConst;
import com.app.common.ResponseData;
import com.app.pojo.sys.UserAccount;
import com.app.pojo.vo.UserInfoVO;
import com.app.service.sys.UserService;

@Controller
@RequestMapping("/sys/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/index")
	public String index() {
		return "sys/userIndex";
	}
	
	
	@GetMapping("/getUserInfo")
	@ResponseBody
	public Object getUserInfo(HttpServletRequest request, HttpServletResponse response) {
		ResponseData result = new ResponseData(200);
		UserAccount sysAccount = (UserAccount) request.getSession().getAttribute(GlobalConst.LOGIN_USER);
		if (sysAccount != null) {
			UserInfoVO userInfo = userService.getUserInfo(sysAccount);
			result.setData(userInfo);
		} else {
			result.setStatus(500);
		}
		return result;
	}
	
	
	
	
}
