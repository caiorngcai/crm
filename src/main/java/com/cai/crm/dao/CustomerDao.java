package com.cai.crm.dao;

import com.cai.crm.domain.*;;

public interface CustomerDao {
	/**
	 * 根据ID获取客户信息
	 * @param id
	 * @return
	 */
	public Customer findById(Long id);

}
