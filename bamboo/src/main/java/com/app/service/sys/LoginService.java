package com.app.service.sys;

import com.app.common.ResponseData;
import com.app.pojo.sys.UserAccount;

public interface LoginService {
	
	
	ResponseData doLogin(UserAccount user);

}
