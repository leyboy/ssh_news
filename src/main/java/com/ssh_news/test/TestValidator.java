package com.ssh_news.test;



import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssh_news.bean.Admin;
import com.ssh_news.util.error.ValidatorErrorUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TestValidator {

	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAdminValidator(){
		Admin admin=new Admin("1","123456");
		System.out.println(ValidatorErrorUtil.getValidatorErrors(admin));
	}

}
