package com.itensoft;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VirtualManagerDocerId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class VirtualManagerDocerId implements java.io.Serializable
{

	// Fields

	private String vitrualManagerName;
	private String docer;

	// Constructors

	/** default constructor */
	public VirtualManagerDocerId()
	{
	}

	/** full constructor */
	public VirtualManagerDocerId(String vitrualManagerName, String docer)
	{
		this.vitrualManagerName = vitrualManagerName;
		this.docer = docer;
	}

	// Property accessors

	@Column(name = "VitrualManagerName", nullable = false, length = 50)
	public String getVitrualManagerName()
	{
		return this.vitrualManagerName;
	}

	public void setVitrualManagerName(String vitrualManagerName)
	{
		this.vitrualManagerName = vitrualManagerName;
	}

	@Column(name = "Docer", nullable = false, length = 50)
	public String getDocer()
	{
		return this.docer;
	}

	public void setDocer(String docer)
	{
		this.docer = docer;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VirtualManagerDocerId))
			return false;
		VirtualManagerDocerId castOther = (VirtualManagerDocerId) other;

		return ((this.getVitrualManagerName() == castOther
				.getVitrualManagerName()) || (this.getVitrualManagerName() != null
				&& castOther.getVitrualManagerName() != null && this
				.getVitrualManagerName().equals(
						castOther.getVitrualManagerName())))
				&& ((this.getDocer() == castOther.getDocer()) || (this
						.getDocer() != null && castOther.getDocer() != null && this
						.getDocer().equals(castOther.getDocer())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37
				* result
				+ (getVitrualManagerName() == null ? 0 : this
						.getVitrualManagerName().hashCode());
		result = 37 * result
				+ (getDocer() == null ? 0 : this.getDocer().hashCode());
		return result;
	}

}