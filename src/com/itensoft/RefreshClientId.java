package com.itensoft;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RefreshClientId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class RefreshClientId implements java.io.Serializable
{

	// Fields

	private String hardId;
	private Integer type;

	// Constructors

	/** default constructor */
	public RefreshClientId()
	{
	}

	/** full constructor */
	public RefreshClientId(String hardId, Integer type)
	{
		this.hardId = hardId;
		this.type = type;
	}

	// Property accessors

	@Column(name = "HardId", nullable = false, length = 50)
	public String getHardId()
	{
		return this.hardId;
	}

	public void setHardId(String hardId)
	{
		this.hardId = hardId;
	}

	@Column(name = "Type", nullable = false)
	public Integer getType()
	{
		return this.type;
	}

	public void setType(Integer type)
	{
		this.type = type;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RefreshClientId))
			return false;
		RefreshClientId castOther = (RefreshClientId) other;

		return ((this.getHardId() == castOther.getHardId()) || (this
				.getHardId() != null && castOther.getHardId() != null && this
				.getHardId().equals(castOther.getHardId())))
				&& ((this.getType() == castOther.getType()) || (this.getType() != null
						&& castOther.getType() != null && this.getType()
						.equals(castOther.getType())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result
				+ (getHardId() == null ? 0 : this.getHardId().hashCode());
		result = 37 * result
				+ (getType() == null ? 0 : this.getType().hashCode());
		return result;
	}

}