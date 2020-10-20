package com.app.service.sys.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.sys.UserDao;
import com.app.pojo.sys.UserAccount;
import com.app.pojo.vo.UserInfoVO;
import com.app.service.sys.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public UserInfoVO getUserInfo(UserAccount user) {
		UserInfoVO userInfo = userDao.getUserInfo(user);
		return userInfo;
	}

	
	
	
}
