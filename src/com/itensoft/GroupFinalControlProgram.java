package com.itensoft;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * GroupFinalControlProgram entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "GroupFinalControlProgram", schema = "dbo", catalog = "phoenix")
public class GroupFinalControlProgram implements java.io.Serializable
{

	// Fields

	private GroupFinalControlProgramId id;
	private Integer encryptMode;
	private String printControled;

	// Constructors

	/** default constructor */
	public GroupFinalControlProgram()
	{
	}

	/** minimal constructor */
	public GroupFinalControlProgram(GroupFinalControlProgramId id)
	{
		this.id = id;
	}

	/** full constructor */
	public GroupFinalControlProgram(GroupFinalControlProgramId id,
			Integer encryptMode, String printControled)
	{
		this.id = id;
		this.encryptMode = encryptMode;
		this.printControled = printControled;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "groupCode", column = @Column(name = "GroupCode", nullable = false)),
			@AttributeOverride(name = "programCode", column = @Column(name = "ProgramCode", nullable = false)) })
	public GroupFinalControlProgramId getId()
	{
		return this.id;
	}

	public void setId(GroupFinalControlProgramId id)
	{
		this.id = id;
	}

	@Column(name = "EncryptMode")
	public Integer getEncryptMode()
	{
		return this.encryptMode;
	}

	public void setEncryptMode(Integer encryptMode)
	{
		this.encryptMode = encryptMode;
	}

	@Column(name = "PrintControled", length = 1)
	public String getPrintControled()
	{
		return this.printControled;
	}

	public void setPrintControled(String printControled)
	{
		this.printControled = printControled;
	}

}