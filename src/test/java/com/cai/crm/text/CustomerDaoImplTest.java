package com.cai.crm.text;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cai.crm.dao.CustomerDao;
import com.cai.crm.domain.Customer;

public class CustomerDaoImplTest {
	@Test
	public void test() {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		CustomerDao customerDao = (CustomerDao) app.getBean("customerDao");
		Customer customer = customerDao.findById(23L);
		System.out.println("********************"+customer.getCustName());
	}
}
