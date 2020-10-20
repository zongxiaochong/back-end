package com.app.dao.sys;

import org.apache.ibatis.annotations.Select;

import com.app.pojo.sys.UserAccount;
import com.app.pojo.vo.UserInfoVO;

public interface UserDao {
	
	@Select(value = " select * from lcgrpcont where rownum = 1 ")
	Object getIn();
	
	UserAccount getUser(UserAccount user);
	
	UserInfoVO getUserInfo(UserAccount user);

}
