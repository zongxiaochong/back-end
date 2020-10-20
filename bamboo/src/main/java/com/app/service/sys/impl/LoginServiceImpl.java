package com.app.service.sys.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.common.ResponseData;
import com.app.dao.sys.UserDao;
import com.app.pojo.sys.UserAccount;
import com.app.service.sys.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public ResponseData doLogin(UserAccount user) {
		userDao.getIn();
		ResponseData result = new ResponseData(200);
//		UserAccount userInfo = userDao.getUser(user);
//		if (userInfo == null) {
//			result.setMessage("用户名或者密码未匹配！");
//			return result;
//		}
//		result.setData(userInfo);
		return result;
	}
	
	
	
	
	
	
	
	
	

}
