package com.ssh_news.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssh_news.bean.Admin;
import com.ssh_news.dao.AdminDao;
import com.ssh_news.dao.BaseDao;

/**
 * admin dao impl
 * **/
@Repository
public class AdminDaoImpl extends BaseDao<Admin> implements AdminDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> validatorLogin(Admin condition) {
		// TODO Auto-generated method stub
		return (List<Admin>) this.findByCondition(condition);
	}

	@Override
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		this.save(admin);
	}

}
