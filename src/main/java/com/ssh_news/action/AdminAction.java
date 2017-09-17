package com.ssh_news.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh_news.bean.Admin;
import com.ssh_news.service.AdminService;
import static com.ssh_news.util.commons.NewsConstants.INDEX;

/**
 * admin action
 **/
public class AdminAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String loginName; // login name
	private String password; // password

	@Autowired
	@Qualifier("adminService")
	private AdminService adminService;

	private Map<String, Object> session;

	/**
	 * set session to get session easy
	 **/
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	/**
	 * validator admin login
	 **/
	public String login() {
		Admin admin = new Admin(loginName, password);
		if (adminService.validatorLogin(admin)) {
			session.put("admin", admin);
		}
		return INDEX;
	}
	

	/**
	 * admin logout
	 * **/
	public String loginout(){
		if(session.get("admin")!=null){
			session.remove("admin");
		}
		return INDEX;
	}

}
