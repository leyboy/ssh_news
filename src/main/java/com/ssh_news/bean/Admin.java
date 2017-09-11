package com.ssh_news.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tb_admin", catalog = "maven_ssh_news")
public class Admin {

	private Integer id;
	private String loginName;
	private String password;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String loginName, String password) {
		super();
		this.loginName = loginName;
		this.password = password;
	}

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GenericGenerator(name = "generator", strategy = "native")
	@Id
	@Column(name = "adminId", length = 11, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "loginName", length = 30, nullable = false)
	@Pattern(regexp = "(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})", message = "用户名必须是2-5位中文或者6-16位英文和数字的组合")
	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	@Column(name = "password", length = 18, nullable = true)
	@Pattern(regexp = "(^[a-zA-Z0-9_-]{5,17}$)", message = " 密码以字母开头,长度在5~17 之间,只能包含字符,数字和下划线")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [loginName=" + loginName + ", password=" + password + "]";
	}

}
