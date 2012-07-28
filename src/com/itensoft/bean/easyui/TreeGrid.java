package com.itensoft.bean.easyui;
import java.util.*;

public class TreeGrid{
	private int total;
	private List rows;
	
	public <T> TreeGrid(List<T> rows) {
		super();
		this.total = rows.size();
		this.rows = rows;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	
	
	
	
}
