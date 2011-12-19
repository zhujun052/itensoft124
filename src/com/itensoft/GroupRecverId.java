package com.itensoft;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * GroupRecverId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class GroupRecverId implements java.io.Serializable {

	// Fields

	private Integer groupCode;
	private String certId;

	// Constructors

	/** default constructor */
	public GroupRecverId() {
	}

	/** full constructor */
	public GroupRecverId(Integer groupCode, String certId) {
		this.groupCode = groupCode;
		this.certId = certId;
	}

	// Property accessors

	@Column(name = "GroupCode", nullable = false)
	public Integer getGroupCode() {
		return this.groupCode;
	}

	public void setGroupCode(Integer groupCode) {
		this.groupCode = groupCode;
	}

	@Column(name = "CertId", nullable = false, length = 50)
	public String getCertId() {
		return this.certId;
	}

	public void setCertId(String certId) {
		this.certId = certId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GroupRecverId))
			return false;
		GroupRecverId castOther = (GroupRecverId) other;

		return ((this.getGroupCode() == castOther.getGroupCode()) || (this
				.getGroupCode() != null && castOther.getGroupCode() != null && this
				.getGroupCode().equals(castOther.getGroupCode())))
				&& ((this.getCertId() == castOther.getCertId()) || (this
						.getCertId() != null && castOther.getCertId() != null && this
						.getCertId().equals(castOther.getCertId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getGroupCode() == null ? 0 : this.getGroupCode().hashCode());
		result = 37 * result
				+ (getCertId() == null ? 0 : this.getCertId().hashCode());
		return result;
	}

}