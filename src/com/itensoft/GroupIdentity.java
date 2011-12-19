package com.itensoft;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * GroupIdentity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "GroupIdentity", schema = "dbo", catalog = "phoenix")
public class GroupIdentity implements java.io.Serializable {

	// Fields

	private GroupIdentityId id;

	// Constructors

	/** default constructor */
	public GroupIdentity() {
	}

	/** full constructor */
	public GroupIdentity(GroupIdentityId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "groupCode", column = @Column(name = "GroupCode", nullable = false)),
			@AttributeOverride(name = "certId", column = @Column(name = "CertId", nullable = false, length = 50)) })
	public GroupIdentityId getId() {
		return this.id;
	}

	public void setId(GroupIdentityId id) {
		this.id = id;
	}

}