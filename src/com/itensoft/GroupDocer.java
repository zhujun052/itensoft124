package com.itensoft;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * GroupDocer entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "GroupDocer", schema = "dbo", catalog = "phoenix")
public class GroupDocer implements java.io.Serializable
{

	// Fields

	private GroupDocerId id;

	// Constructors

	/** default constructor */
	public GroupDocer()
	{
	}

	/** full constructor */
	public GroupDocer(GroupDocerId id)
	{
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "groupCode", column = @Column(name = "GroupCode", nullable = false)),
			@AttributeOverride(name = "docer", column = @Column(name = "Docer", nullable = false, length = 50)) })
	public GroupDocerId getId()
	{
		return this.id;
	}

	public void setId(GroupDocerId id)
	{
		this.id = id;
	}

}