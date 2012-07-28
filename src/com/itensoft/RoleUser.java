package com.itensoft;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * RoleUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "RoleUser", schema = "dbo", catalog = "phoenix")
public class RoleUser implements java.io.Serializable {

	// Fields

	private RoleUserId id;

	// Constructors

	/** default constructor */
	public RoleUser() {
	}

	/** full constructor */
	public RoleUser(RoleUserId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "roleName", column = @Column(name = "RoleName", nullable = false, length = 50)),
			@AttributeOverride(name = "userName", column = @Column(name = "UserName", nullable = false, length = 50)) })
	public RoleUserId getId() {
		return this.id;
	}

	public void setId(RoleUserId id) {
		this.id = id;
	}

}