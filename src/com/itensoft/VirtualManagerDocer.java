package com.itensoft;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VirtualManagerDocer entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "VirtualManagerDocer", schema = "dbo", catalog = "phoenix")
public class VirtualManagerDocer implements java.io.Serializable
{

	// Fields

	private VirtualManagerDocerId id;

	// Constructors

	/** default constructor */
	public VirtualManagerDocer()
	{
	}

	/** full constructor */
	public VirtualManagerDocer(VirtualManagerDocerId id)
	{
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "vitrualManagerName", column = @Column(name = "VitrualManagerName", nullable = false, length = 50)),
			@AttributeOverride(name = "docer", column = @Column(name = "Docer", nullable = false, length = 50)) })
	public VirtualManagerDocerId getId()
	{
		return this.id;
	}

	public void setId(VirtualManagerDocerId id)
	{
		this.id = id;
	}

}