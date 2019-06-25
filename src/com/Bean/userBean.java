package com.Bean;

public class userBean {
	private String logname;
	private String password;
	private String phone;
	private String email;
	private String address;
	private String realname;
	
	
	public userBean() {
		super();
	}
	
	public userBean(String logname, String password, String phone, String email, String address, String realname) {
		super();
		this.logname = logname;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.realname = realname;
	}

	public String getLogname() {
		return logname;
	}
	public void setLogname(String logname) {
		this.logname = logname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	
	
}
