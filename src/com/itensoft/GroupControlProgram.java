package com.itensoft;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * GroupControlProgram entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "GroupControlProgram", schema = "dbo", catalog = "phoenix")
public class GroupControlProgram implements java.io.Serializable
{

	// Fields

	private GroupControlProgramId id;
	private String encryptMode;
	private String printControled;

	// Constructors

	/** default constructor */
	public GroupControlProgram()
	{
	}

	/** minimal constructor */
	public GroupControlProgram(GroupControlProgramId id)
	{
		this.id = id;
	}

	/** full constructor */
	public GroupControlProgram(GroupControlProgramId id, String encryptMode,
			String printControled)
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
	public GroupControlProgramId getId()
	{
		return this.id;
	}

	public void setId(GroupControlProgramId id)
	{
		this.id = id;
	}

	@Column(name = "EncryptMode", length = 1)
	public String getEncryptMode()
	{
		return this.encryptMode;
	}

	public void setEncryptMode(String encryptMode)
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