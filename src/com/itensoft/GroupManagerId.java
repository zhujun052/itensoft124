package com.itensoft;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * GroupManagerId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class GroupManagerId implements java.io.Serializable
{

	// Fields

	private Integer groupCode;
	private String virtualManagerName;

	// Constructors

	/** default constructor */
	public GroupManagerId()
	{
	}

	/** full constructor */
	public GroupManagerId(Integer groupCode, String virtualManagerName)
	{
		this.groupCode = groupCode;
		this.virtualManagerName = virtualManagerName;
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

	@Column(name = "VirtualManagerName", nullable = false, length = 50)
	public String getVirtualManagerName()
	{
		return this.virtualManagerName;
	}

	public void setVirtualManagerName(String virtualManagerName)
	{
		this.virtualManagerName = virtualManagerName;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GroupManagerId))
			return false;
		GroupManagerId castOther = (GroupManagerId) other;

		return ((this.getGroupCode() == castOther.getGroupCode()) || (this
				.getGroupCode() != null && castOther.getGroupCode() != null && this
				.getGroupCode().equals(castOther.getGroupCode())))
				&& ((this.getVirtualManagerName() == castOther
						.getVirtualManagerName()) || (this
						.getVirtualManagerName() != null
						&& castOther.getVirtualManagerName() != null && this
						.getVirtualManagerName().equals(
								castOther.getVirtualManagerName())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result
				+ (getGroupCode() == null ? 0 : this.getGroupCode().hashCode());
		result = 37
				* result
				+ (getVirtualManagerName() == null ? 0 : this
						.getVirtualManagerName().hashCode());
		return result;
	}

}