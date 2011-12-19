package com.itensoft;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * GroupFinalManager entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "GroupFinalManager", schema = "dbo", catalog = "phoenix")
public class GroupFinalManager implements java.io.Serializable
{

	// Fields

	private GroupFinalManagerId id;

	// Constructors

	/** default constructor */
	public GroupFinalManager()
	{
	}

	/** full constructor */
	public GroupFinalManager(GroupFinalManagerId id)
	{
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "groupCode", column = @Column(name = "GroupCode", nullable = false)),
			@AttributeOverride(name = "virtualManagerName", column = @Column(name = "VirtualManagerName", nullable = false, length = 50)) })
	public GroupFinalManagerId getId()
	{
		return this.id;
	}

	public void setId(GroupFinalManagerId id)
	{
		this.id = id;
	}

}