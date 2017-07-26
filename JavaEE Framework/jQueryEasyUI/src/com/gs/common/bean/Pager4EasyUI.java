package com.gs.common.bean;

import java.util.List;

public class Pager4EasyUI<T> {
	
	private int pageNo;
	private int pageSize;
	
	private int total;
	private List<T> rows;
	
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
	public int getStartIndex() {
		return (pageNo - 1) * pageSize;
	}

}
