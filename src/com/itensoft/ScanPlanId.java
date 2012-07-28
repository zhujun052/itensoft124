package com.itensoft;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@SuppressWarnings("serial")
/**
 * ScanPlanId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class ScanPlanId implements java.io.Serializable {

	// Fields

	private String name;
	private String include;
	private String exclude;
	private String ignoreSys;

	// Constructors

	/** default constructor */
	public ScanPlanId() {
	}

	/** minimal constructor */
	public ScanPlanId(String name) {
		this.name = name;
	}

	/** full constructor */
	public ScanPlanId(String name, String include, String exclude,
			String ignoreSys) {
		this.name = name;
		this.include = include;
		this.exclude = exclude;
		this.ignoreSys = ignoreSys;
	}

	// Property accessors

	@Column(name = "Name", nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "Include", length = 500)
	public String getInclude() {
		return this.include;
	}

	public void setInclude(String include) {
		this.include = include;
	}

	@Column(name = "Exclude", length = 500)
	public String getExclude() {
		return this.exclude;
	}

	public void setExclude(String exclude) {
		this.exclude = exclude;
	}

	@Column(name = "IgnoreSys", length = 1)
	public String getIgnoreSys() {
		return this.ignoreSys;
	}

	public void setIgnoreSys(String ignoreSys) {
		this.ignoreSys = ignoreSys;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ScanPlanId))
			return false;
		ScanPlanId castOther = (ScanPlanId) other;

		return ((this.getName() == castOther.getName()) || (this.getName() != null
				&& castOther.getName() != null && this.getName().equals(
				castOther.getName())))
				&& ((this.getInclude() == castOther.getInclude()) || (this
						.getInclude() != null && castOther.getInclude() != null && this
						.getInclude().equals(castOther.getInclude())))
				&& ((this.getExclude() == castOther.getExclude()) || (this
						.getExclude() != null && castOther.getExclude() != null && this
						.getExclude().equals(castOther.getExclude())))
				&& ((this.getIgnoreSys() == castOther.getIgnoreSys()) || (this
						.getIgnoreSys() != null
						&& castOther.getIgnoreSys() != null && this
						.getIgnoreSys().equals(castOther.getIgnoreSys())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getInclude() == null ? 0 : this.getInclude().hashCode());
		result = 37 * result
				+ (getExclude() == null ? 0 : this.getExclude().hashCode());
		result = 37 * result
				+ (getIgnoreSys() == null ? 0 : this.getIgnoreSys().hashCode());
		return result;
	}

}