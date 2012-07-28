package com.itensoft;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * GroupRecver entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "GroupRecver", schema = "dbo", catalog = "phoenix")
public class GroupRecver implements java.io.Serializable {

	// Fields

	private GroupRecverId id;
	private String readOnly;
	private Integer printCount;

	// Constructors

	/** default constructor */
	public GroupRecver() {
	}

	/** minimal constructor */
	public GroupRecver(GroupRecverId id) {
		this.id = id;
	}

	/** full constructor */
	public GroupRecver(GroupRecverId id, String readOnly, Integer printCount) {
		this.id = id;
		this.readOnly = readOnly;
		this.printCount = printCount;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "groupCode", column = @Column(name = "GroupCode", nullable = false)),
			@AttributeOverride(name = "certId", column = @Column(name = "CertId", nullable = false, length = 50)) })
	public GroupRecverId getId() {
		return this.id;
	}

	public void setId(GroupRecverId id) {
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