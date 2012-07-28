package com.itensoft;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "[User]", schema = "dbo", catalog = "phoenix")
public class User implements java.io.Serializable {

	// Fields

	private String name;
	private String password;
	private String note;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String name) {
		this.name = name;
	}

	/** full constructor */
	public User(String name, String password, String note) {
		this.name = name;
		this.password = password;
		this.note = note;
	}

	// Property accessors
	@Id
	@Column(name = "Name", unique = true, nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "[Password]", length = 32)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "Note", length = 50)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}