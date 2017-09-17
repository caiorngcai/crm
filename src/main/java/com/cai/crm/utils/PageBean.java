package com.cai.crm.utils;

import java.util.List;

public class PageBean {
	private Integer currentPage;
	private Integer totalCount;
	private Integer pageSize;
	private Integer totalPage;
	private List list;
	public PageBean(Integer currectPage,Integer totalCount,Integer pageSize) {
		this.currentPage=currentPage;
		this.totalCount=totalCount;
		this.pageSize=pageSize;
		if(this.currentPage==null)
		{
			currectPage=1;
		}
		if(this.pageSize==null)
		{
			pageSize=3;
		}
		this.totalPage=(this.totalCount+this.pageSize-1)/this.pageSize;
		if(this.currentPage<1)
		{
			currectPage=1;
		}
		if(this.currentPage>this.totalPage)
		{
			this.currentPage=this.totalPage;
		}
	}
	public Integer getStart() {
		return(this.currentPage-1)*this.pageSize;
	}
	public Integer getCurrectPage() {
		return currentPage;
	}
	public void setCurrectPage(Integer currectPage) {
		this.currentPage = currectPage;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}

}
