package com.cai.crm.dao.impl;
import com.cai.crm.dao.*;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.cai.crm.dao.CustomerDao;
import com.cai.crm.domain.*;
import com.cai.crm.domain.*;
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public Customer findById(Long id) {
		
		return this.getHibernateTemplate().get(Customer.class, id);
	}

}
