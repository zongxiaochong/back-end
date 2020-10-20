package com.app.service.sys;

import com.app.pojo.sys.UserAccount;
import com.app.pojo.vo.UserInfoVO;

public interface UserService {
	
	
	UserInfoVO getUserInfo(UserAccount user);

}
