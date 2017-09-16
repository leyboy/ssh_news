package com.ssh_news.dao;

import java.util.List;

import com.ssh_news.bean.Admin;

/**
 * admin dao
 * **/
public interface AdminDao {

	/**
	 * validator admin login
	 * @param condition
	 * 			validator condition
	 * @return List
	 * **/
	public List<Admin> validatorLogin(Admin condition);
	
	/**
	 * add admin
	 * @param admin
	 * **/
	public void addAdmin(Admin admin);
}
