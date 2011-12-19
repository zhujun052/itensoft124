package com.itensoft;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * RefreshClient entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "RefreshClient", schema = "dbo", catalog = "phoenix")
public class RefreshClient implements java.io.Serializable
{

	// Fields

	private RefreshClientId id;

	// Constructors

	/** default constructor */
	public RefreshClient()
	{
	}

	/** full constructor */
	public RefreshClient(RefreshClientId id)
	{
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "hardId", column = @Column(name = "HardId", nullable = false, length = 50)),
			@AttributeOverride(name = "type", column = @Column(name = "Type", nullable = false)) })
	public RefreshClientId getId()
	{
		return this.id;
	}

	public void setId(RefreshClientId id)
	{
		this.id = id;
	}

}