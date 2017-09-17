package com.cai.crm.dao;

import java.io.Serializable;

import org.hibernate.criterion.DetachedCriteria;

import antlr.collections.List;

public interface BaseDao <T>{
	void save(T t);
	void delete(T t);
	void update(Serializable id);
	T getById(Serializable id);
	Integer getTotalCount(DetachedCriteria criteria );
	java.util.List<T>getPageList(DetachedCriteria criteria,Integer start,Integer pageSize);
}
