package com.cai.crm.service;

import org.hibernate.criterion.DetachedCriteria;

import com.cai.crm.domain.Customer;
import com.cai.crm.utils.PageBean;

public interface CustomerService {


	/**
	 * 服务层获得pagebean的方法
	 * @param criteria
	 * @param pageSiae 
	 * @param currentPage 
	 * @return
	 */
	public PageBean getPageBean(DetachedCriteria criteria, Integer currentPage, Integer pageSize);
	
}
