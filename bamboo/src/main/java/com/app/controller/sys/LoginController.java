package com.app.controller.sys;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.common.GlobalConst;
import com.app.common.RandomValidateCode;
import com.app.common.ResponseData;
import com.app.pojo.sys.UserAccount;
import com.app.service.sys.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService LoginService;
	
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
	public Object validCode(HttpServletRequest request, HttpServletResponse response) {
		RandomValidateCode randomValidateCode = new RandomValidateCode();
		String validateCodeImage = randomValidateCode.getValidateCodeImage();
		String validateCode = randomValidateCode.getValidateCode();
		Map<String, Object> map = new HashMap<>(2);
		map.put("validateCodeImage", validateCodeImage);
		map.put("validateCode", validateCode);
		ResponseData result = new ResponseData(200);
		result.setData(map);
		request.getSession().setAttribute(GlobalConst.RANDOM_CODE_KEY, validateCode);
		return result;
	}
	
	@GetMapping("/doLogin")
	@ResponseBody
	public Object doLogin(HttpServletRequest request, HttpServletResponse response) {
		ResponseData result = new ResponseData(200);
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		String validCode = request.getParameter("validCode");
		Object validObj = request.getSession().getAttribute(GlobalConst.RANDOM_CODE_KEY);
		if (validObj != null) {
			String validateCode = String.valueOf(validObj).toLowerCase();
			if (StringUtils.isEmpty(validCode) || 
					(StringUtils.isNotEmpty(validCode) && !validateCode.equals(validCode.toLowerCase()))) {
				result.setMessage("验证码不正确！");
				return result;
			}
		}
		if (StringUtils.isEmpty(account) || StringUtils.isEmpty(password)) {
			result.setMessage("请输入用户名和密码！");
			return result;
		}
		
		UserAccount user = new UserAccount();
		user.setAccount(account);
		user.setPassword(password);
		result = LoginService.doLogin(user);
		
		HttpSession session = request.getSession();
		session.setAttribute(GlobalConst.LOGIN_USER, result.getData());
		return result;
	}
	
	
	@GetMapping("/loginOut")
	@ResponseBody
	public void loginOut(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().removeAttribute(GlobalConst.LOGIN_USER);
	}


}
