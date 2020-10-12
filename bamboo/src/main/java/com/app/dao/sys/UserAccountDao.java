package com.app.dao.sys;

import java.util.List;

import com.app.pojo.sys.UserAccount;

public interface UserAccountDao {
	
	
	List<UserAccount> selectUser();

}
