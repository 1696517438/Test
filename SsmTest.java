package com.jio.smm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jio.ssm.dao.UserDao;
import com.jio.ssm.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContent.xml")
public class SsmTest {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void select() {
//		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContent.xml");
//		UserDao userDao = (UserDao) app.getBean("userDao");
		List<User> users = userDao.queryAllUsers();
		System.out.println(users);
	}

}
