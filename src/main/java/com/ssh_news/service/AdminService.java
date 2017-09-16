package com.ssh_news.service;

import com.ssh_news.bean.Admin;

/**
 * admin service
 * **/
public interface AdminService {

	/**
	 * add admin 
	 * @param admin
	 * **/
	public void addAdmin(Admin admin);
	
	/**
	 * validator admin login
	 * @param condition
	 * **/
	public boolean validatorLogin(Admin condition);
}
