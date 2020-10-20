package com.app.pojo.sys;

import java.util.Date;

import com.app.pojo.BaseEntity;

public class UserAccount extends BaseEntity {
	
	private Integer id;
	
	private String account;
	
	private String password;
	
	private Date lastLogin;
	
	private int useStatus;
	
	private String accType;
	
	private String loginSet;
	
	private String lastDate;
	 
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getLastLoginTime() {
		return lastLogin;
	}

	public void setLastLoginTime(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public int getUseStatus() {
		return useStatus;
	}

	public void setUseStatus(int useStatus) {
		this.useStatus = useStatus;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}
 
	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getLoginSet() {
		return loginSet;
	}

	public void setLoginSet(String loginSet) {
		this.loginSet = loginSet;
	}

	public String getLastDate() {
		return lastDate;
	}

	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}
	
	
}
