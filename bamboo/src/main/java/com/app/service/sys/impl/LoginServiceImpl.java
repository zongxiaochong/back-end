package com.app.service.sys.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.sys.UserAccountDao;
import com.app.pojo.sys.UserAccount;
import com.app.service.sys.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private UserAccountDao userAccountDao;

	@Override
	public Object doLogin(UserAccount user) {
		userAccountDao.selectUser();
		return null;
	}

}
