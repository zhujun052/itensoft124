package com.itensoft.bean.easyui;

import java.util.List;

public class ListBean {
	private long total;
	private List rows;
	
	public ListBean(){
		
	}
	
	public <T> ListBean(List<T> obj){
		this.rows = obj;
		this.total = obj.size();
	}
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	
	
}
