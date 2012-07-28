package com.itensoft;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@SuppressWarnings("serial")
/**
 * ScanPlan entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ScanPlan", schema = "dbo", catalog = "phoenix")
public class ScanPlan implements java.io.Serializable {

	// Fields

	private ScanPlanId id;

	// Constructors

	/** default constructor */
	public ScanPlan() {
	}

	/** full constructor */
	public ScanPlan(ScanPlanId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "name", column = @Column(name = "Name", nullable = false, length = 50)),
			@AttributeOverride(name = "include", column = @Column(name = "Include", length = 500)),
			@AttributeOverride(name = "exclude", column = @Column(name = "Exclude", length = 500)),
			@AttributeOverride(name = "ignoreSys", column = @Column(name = "IgnoreSys", length = 1)) })
	public ScanPlanId getId() {
		return this.id;
	}

	public void setId(ScanPlanId id) {
		this.id = id;
	}

}