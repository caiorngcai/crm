package com.cai.crm.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cai.crm.dao.CustomerDao;
import com.cai.crm.domain.Customer;
import com.cai.crm.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {
	private CustomerService customerService;
	private Long custId;
	private Customer customer;
	public Customer getCustomer() {
		return customer;
	}



	public CustomerService getCustomerService() {
		return customerService;
	}



	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}
	
	
	public String findCustomerById(){
		System.out.println(custId+"");
		//ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//CustomerService service = (CustomerService) app.getBean("customerService");
		if(customerService==null)
		{
			System.out.println("customerService 没取到值");
		}else{
			System.out.println(customerService.toString());
			customer=customerService.findById(custId);
		}
		return SUCCESS;
	}
	

}
