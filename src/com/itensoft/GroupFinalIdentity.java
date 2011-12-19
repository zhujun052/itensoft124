package com.itensoft;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * GroupFinalIdentity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "GroupFinalIdentity", schema = "dbo", catalog = "phoenix")
public class GroupFinalIdentity implements java.io.Serializable {

	// Fields

	private GroupFinalIdentityId id;

	// Constructors

	/** default constructor */
	public GroupFinalIdentity() {
	}

	/** full constructor */
	public GroupFinalIdentity(GroupFinalIdentityId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "groupCode", column = @Column(name = "GroupCode", nullable = false)),
			@AttributeOverride(name = "certId", column = @Column(name = "CertId", nullable = false, length = 50)) })
	public GroupFinalIdentityId getId() {
		return this.id;
	}

	public void setId(GroupFinalIdentityId id) {
		this.id = id;
	}

}