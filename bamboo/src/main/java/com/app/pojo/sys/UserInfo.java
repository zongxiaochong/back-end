package com.app.pojo.sys;

import java.util.Date;

import com.app.pojo.BaseEntity;

public class UserInfo extends BaseEntity {
	
	private Integer id;
	
	private Integer accountId;
	
	private String userName;
	
	private String sex;
	
	private Date birthday;
	
	private String idType;
	
	private String idNumber;
	
	private String phone;
	
	private String mail;
	
	private String addr;
	
	private String headPhoto;
	

	private String birthdayDate;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getAccountId() {
		return accountId;
	}


	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String getIdType() {
		return idType;
	}


	public void setIdType(String idType) {
		this.idType = idType;
	}


	public String getIdNumber() {
		return idNumber;
	}


	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getHeadPhoto() {
		return headPhoto;
	}


	public void setHeadPhoto(String headPhoto) {
		this.headPhoto = headPhoto;
	}


	public String getBirthdayDate() {
		return birthdayDate;
	}


	public void setBirthdayDate(String birthdayDate) {
		this.birthdayDate = birthdayDate;
	}
	

}
