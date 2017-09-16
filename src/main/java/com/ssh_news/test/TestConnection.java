package com.ssh_news.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConnection {


	private ApplicationContext ctx = null;
	private DataSource dataSource = null;
	{
		ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
		dataSource = ctx.getBean(DataSource.class);
	}
	

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testConnection() throws SQLException {
		System.out.println(dataSource.getConnection());
	}


}
