package com.itensoft.bean.easyui;
import java.util.*;

public class ComboTree<T> {
	private int id;
	private String text;
	private List<T> children;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<T> getChildren() {
		return children;
	}
	public void setChildren(List<T> children) {
		this.children = children;
	}
	
	
}
