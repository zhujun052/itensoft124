package com.itensoft;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * GroupDocerId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class GroupDocerId implements java.io.Serializable
{

	// Fields

	private Integer groupCode;
	private String docer;

	// Constructors

	/** default constructor */
	public GroupDocerId()
	{
	}

	/** full constructor */
	public GroupDocerId(Integer groupCode, String docer)
	{
		this.groupCode = groupCode;
		this.docer = docer;
	}

	// Property accessors

	@Column(name = "GroupCode", nullable = false)
	public Integer getGroupCode()
	{
		return this.groupCode;
	}

	public void setGroupCode(Integer groupCode)
	{
		this.groupCode = groupCode;
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
		if (!(other instanceof GroupDocerId))
			return false;
		GroupDocerId castOther = (GroupDocerId) other;

		return ((this.getGroupCode() == castOther.getGroupCode()) || (this
				.getGroupCode() != null && castOther.getGroupCode() != null && this
				.getGroupCode().equals(castOther.getGroupCode())))
				&& ((this.getDocer() == castOther.getDocer()) || (this
						.getDocer() != null && castOther.getDocer() != null && this
						.getDocer().equals(castOther.getDocer())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result
				+ (getGroupCode() == null ? 0 : this.getGroupCode().hashCode());
		result = 37 * result
				+ (getDocer() == null ? 0 : this.getDocer().hashCode());
		return result;
	}

}