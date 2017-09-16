package com.ssh_news.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ssh_news.bean.Admin;
import com.ssh_news.dao.AdminDao;
import com.ssh_news.service.AdminService;

/**
 * admin service impl
 * **/
@Service("adminService")
@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED)
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDao adminDao;

	@Override
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.addAdmin(admin);
	}

	@Transactional(readOnly=true,rollbackFor=Exception.class)
	@Override
	public boolean validatorLogin(Admin condition) {
		// TODO Auto-generated method stub
		if(adminDao.validatorLogin(condition)!=null&&adminDao
				.validatorLogin(condition).size()>0){
			return true;
		}
		return false;
	}

}
