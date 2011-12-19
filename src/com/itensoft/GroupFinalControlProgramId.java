package com.itensoft;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * GroupFinalControlProgramId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class GroupFinalControlProgramId implements java.io.Serializable
{

	// Fields

	private Integer groupCode;
	private Integer programCode;

	// Constructors

	/** default constructor */
	public GroupFinalControlProgramId()
	{
	}

	/** full constructor */
	public GroupFinalControlProgramId(Integer groupCode, Integer programCode)
	{
		this.groupCode = groupCode;
		this.programCode = programCode;
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

	@Column(name = "ProgramCode", nullable = false)
	public Integer getProgramCode()
	{
		return this.programCode;
	}

	public void setProgramCode(Integer programCode)
	{
		this.programCode = programCode;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GroupFinalControlProgramId))
			return false;
		GroupFinalControlProgramId castOther = (GroupFinalControlProgramId) other;

		return ((this.getGroupCode() == castOther.getGroupCode()) || (this
				.getGroupCode() != null && castOther.getGroupCode() != null && this
				.getGroupCode().equals(castOther.getGroupCode())))
				&& ((this.getProgramCode() == castOther.getProgramCode()) || (this
						.getProgramCode() != null
						&& castOther.getProgramCode() != null && this
						.getProgramCode().equals(castOther.getProgramCode())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result
				+ (getGroupCode() == null ? 0 : this.getGroupCode().hashCode());
		result = 37
				* result
				+ (getProgramCode() == null ? 0 : this.getProgramCode()
						.hashCode());
		return result;
	}

}