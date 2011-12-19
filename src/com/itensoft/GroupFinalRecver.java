package com.itensoft;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * GroupFinalRecver entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "GroupFinalRecver", schema = "dbo", catalog = "phoenix")
public class GroupFinalRecver implements java.io.Serializable {

	// Fields

	private GroupFinalRecverId id;
	private String readOnly;
	private Integer printCount;

	// Constructors

	/** default constructor */
	public GroupFinalRecver() {
	}

	/** minimal constructor */
	public GroupFinalRecver(GroupFinalRecverId id) {
		this.id = id;
	}

	/** full constructor */
	public GroupFinalRecver(GroupFinalRecverId id, String readOnly,
			Integer printCount) {
		this.id = id;
		this.readOnly = readOnly;
		this.printCount = printCount;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "groupCode", column = @Column(name = "GroupCode", nullable = false)),
			@AttributeOverride(name = "certId", column = @Column(name = "CertId", nullable = false, length = 50)) })
	public GroupFinalRecverId getId() {
		return this.id;
	}

	public void setId(GroupFinalRecverId id) {
		this.id = id;
	}

	@Column(name = "ReadOnly", length = 1)
	public String getReadOnly() {
		return this.readOnly;
	}

	public void setReadOnly(String readOnly) {
		this.readOnly = readOnly;
	}

	@Column(name = "PrintCount")
	public Integer getPrintCount() {
		return this.printCount;
	}

	public void setPrintCount(Integer printCount) {
		this.printCount = printCount;
	}

}