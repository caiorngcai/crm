package com.cai.crm.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.cai.crm.dao.CustomerDao;
import com.cai.crm.domain.Customer;
import com.cai.crm.service.CustomerService;
import com.cai.crm.utils.PageBean;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao  customerDao;
	
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}


	@Override
	public PageBean getPageBean(DetachedCriteria criteria, Integer currentPage, Integer pageSize) {
				// 1 调用Dao查询总记录数
					Integer totalCount=customerDao.getTotalCount(criteria);
				// 2 创建PageBean对象
					PageBean pageBean=new PageBean(currentPage, totalCount, pageSize);
				// 3 调用Dao查询分页列表数据
					List<Customer> cutList=customerDao.getPageList(criteria,pageBean.getStart(),pageSize);
				// 4 列表数据放入pageBean中.并返回
					pageBean.setList(cutList);
					return pageBean;
	}



}
