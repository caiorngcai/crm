package com.cai.crm.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.cai.crm.dao.BaseDao;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {
		private Class clazz;
	 public BaseDaoImpl() {
		ParameterizedType ptClass=(ParameterizedType) this.getClass().getGenericSuperclass();
		clazz=(Class) ptClass.getActualTypeArguments()[0];
	}
	@Override
	public void save(T t) {
		
		
	}

	@Override
	public void delete(T t) {
		
		
	}

	@Override
	public void update(Serializable id) {
		
		
	}

	@Override
	public T getById(Serializable id) {
		
		return null;
	}

	@Override
	public Integer getTotalCount(DetachedCriteria criteria) {
		criteria.setProjection(Projections.rowCount());
		List<Long> list=(List<Long>) getHibernateTemplate().findByCriteria(criteria);
		criteria.setProjection(null);
		if(list!=null&&list.size()>0)
		{
		return list.get(0).intValue();
		}else {
			return null;
		}
		
	}

	@Override
	public List<T> getPageList(DetachedCriteria criteria, Integer start, Integer pageSize) {
		List<T> list=(List<T>) getHibernateTemplate().findByCriteria(criteria, start, pageSize);
		return list;
	}

}
