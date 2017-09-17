package com.cai.crm.action;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cai.crm.dao.CustomerDao;
import com.cai.crm.domain.Customer;
import com.cai.crm.service.CustomerService;
import com.cai.crm.utils.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import freemarker.template.utility.StringUtil;
public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
	private CustomerService customerService;
	private Integer currentPage;
	private Integer pageSize;
	public Integer getCurrectPage() {
		return currentPage;
	}

	public void setCurrectPage(Integer currectPage) {
		this.currentPage = currectPage;
	}

	public Integer getPageSiae() {
		return pageSize;
	}

	public void setPageSiae(Integer pageSiae) {
		this.pageSize = pageSize;
	}

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	private Customer customer=new Customer();
	public String list()throws Exception{
		// 封装离线查询对象
			DetachedCriteria criteria=DetachedCriteria.forClass(Customer.class);
		// 判断并封装参数
			if(StringUtils.isNotBlank(customer.getCust_name()))
		// 1 调用Service查询分页数据(PageBean)
			{
				criteria.add(Restrictions.like("cust_name",	"%"+customer.getCust_name()+"%"));
			}
			PageBean pageBean=customerService.getPageBean(criteria,currentPage,pageSize);
		// 2 将PageBean放入request域,转发到列表页面显示
			ActionContext.getContext().put("pageBean",pageBean);
			return "list";
	}

	@Override
	public Customer getModel() {
		
		return customer;
	}
	

}
