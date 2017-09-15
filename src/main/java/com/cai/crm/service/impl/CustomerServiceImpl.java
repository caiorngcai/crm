package com.cai.crm.service.impl;

import com.cai.crm.dao.CustomerDao;
import com.cai.crm.domain.Customer;
import com.cai.crm.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao  customerDao;
	
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}



	@Override
	public Customer findById(Long id) {
		return customerDao.findById(id);
	}

}
