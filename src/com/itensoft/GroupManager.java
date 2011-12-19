package com.itensoft;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * GroupManager entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "GroupManager", schema = "dbo", catalog = "phoenix")
public class GroupManager implements java.io.Serializable
{

	// Fields

	private GroupManagerId id;

	// Constructors

	/** default constructor */
	public GroupManager()
	{
	}

	/** full constructor */
	public GroupManager(GroupManagerId id)
	{
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "groupCode", column = @Column(name = "GroupCode", nullable = false)),
			@AttributeOverride(name = "virtualManagerName", column = @Column(name = "VirtualManagerName", nullable = false, length = 50)) })
	public GroupManagerId getId()
	{
		return this.id;
	}

	public void setId(GroupManagerId id)
	{
		this.id = id;
	}

}