package com.itensoft;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RoleUserId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class RoleUserId implements java.io.Serializable {

	// Fields

	private String roleName;
	private String userName;

	// Constructors

	/** default constructor */
	public RoleUserId() {
	}

	/** full constructor */
	public RoleUserId(String roleName, String userName) {
		this.roleName = roleName;
		this.userName = userName;
	}

	// Property accessors

	@Column(name = "RoleName", nullable = false, length = 50)
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Column(name = "UserName", nullable = false, length = 50)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RoleUserId))
			return false;
		RoleUserId castOther = (RoleUserId) other;

		return ((this.getRoleName() == castOther.getRoleName()) || (this
				.getRoleName() != null && castOther.getRoleName() != null && this
				.getRoleName().equals(castOther.getRoleName())))
				&& ((this.getUserName() == castOther.getUserName()) || (this
						.getUserName() != null
						&& castOther.getUserName() != null && this
						.getUserName().equals(castOther.getUserName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRoleName() == null ? 0 : this.getRoleName().hashCode());
		result = 37 * result
				+ (getUserName() == null ? 0 : this.getUserName().hashCode());
		return result;
	}

}