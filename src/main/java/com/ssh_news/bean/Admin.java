package com.ssh_news.bean;

public class Admin {

	private Integer id;
	private Integer loginName;
	private Integer password;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(Integer loginName, Integer password) {
		super();
		this.loginName = loginName;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLoginName() {
		return loginName;
	}

	public void setLoginName(Integer loginName) {
		this.loginName = loginName;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [loginName=" + loginName + ", password=" + password + "]";
	}

}
