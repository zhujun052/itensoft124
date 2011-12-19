package com.itensoft;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@SuppressWarnings("serial")
/**
 * DecryptUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "DecryptUser", schema = "dbo", catalog = "phoenix")
public class DecryptUser implements java.io.Serializable {
	// Fields
	private String name;
	private String hardId;
	private String password;
	private Integer offlineTime;
	private String actived;
	private String actEncrypt;
	private String actDecrypt;
	private String actDeploy;
	private String actAdjuestRcv;
	private String defReadonly;
	private String defDisablePrint;
	private String defLastDateTime;
	private String defAllowLocalTime;
	private String actReadOnly;
	private String actDisablePrint;
	private String actLastDateTime;
	private String actAllowLocalTime;
	private Integer defDeployTime;
	private Integer maxDeployTime;

	// Constructors

	/** default constructor */
	public DecryptUser() {
	}

	/** minimal constructor */
	public DecryptUser(String name) {
		this.name = name;
	}

	/** full constructor */
	public DecryptUser(String name, String hardId, String password,
			Integer offlineTime, String actived, String actEncrypt,
			String actDecrypt, String actDeploy, String actAdjuestRcv,
			String defReadonly, String defDisablePrint, String defLastDateTime,
			String defAllowLocalTime, String actReadOnly,
			String actDisablePrint, String actLastDateTime,
			String actAllowLocalTime, Integer defDeployTime,
			Integer maxDeployTime) {
		this.name = name;
		this.hardId = hardId;
		this.password = password;
		this.offlineTime = offlineTime;
		this.actived = actived;
		this.actEncrypt = actEncrypt;
		this.actDecrypt = actDecrypt;
		this.actDeploy = actDeploy;
		this.actAdjuestRcv = actAdjuestRcv;
		this.defReadonly = defReadonly;
		this.defDisablePrint = defDisablePrint;
		this.defLastDateTime = defLastDateTime;
		this.defAllowLocalTime = defAllowLocalTime;
		this.actReadOnly = actReadOnly;
		this.actDisablePrint = actDisablePrint;
		this.actLastDateTime = actLastDateTime;
		this.actAllowLocalTime = actAllowLocalTime;
		this.defDeployTime = defDeployTime;
		this.maxDeployTime = maxDeployTime;
	}

	// Property accessors
	@Id
	@Column(name = "Name", unique = true, nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "HardId", length = 50)
	public String getHardId() {
		return this.hardId;
	}

	public void setHardId(String hardId) {
		this.hardId = hardId;
	}

	@Column(name = "Password", length = 32)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "OfflineTime")
	public Integer getOfflineTime() {
		return this.offlineTime;
	}

	public void setOfflineTime(Integer offlineTime) {
		this.offlineTime = offlineTime;
	}

	@Column(name = "Actived", length = 1)
	public String getActived() {
		return this.actived;
	}

	public void setActived(String actived) {
		this.actived = actived;
	}

	@Column(name = "ActEncrypt", length = 1)
	public String getActEncrypt() {
		return this.actEncrypt;
	}

	public void setActEncrypt(String actEncrypt) {
		this.actEncrypt = actEncrypt;
	}

	@Column(name = "ActDecrypt", length = 1)
	public String getActDecrypt() {
		return this.actDecrypt;
	}

	public void setActDecrypt(String actDecrypt) {
		this.actDecrypt = actDecrypt;
	}

	@Column(name = "ActDeploy", length = 1)
	public String getActDeploy() {
		return this.actDeploy;
	}

	public void setActDeploy(String actDeploy) {
		this.actDeploy = actDeploy;
	}

	@Column(name = "ActAdjuestRcv", length = 1)
	public String getActAdjuestRcv() {
		return this.actAdjuestRcv;
	}

	public void setActAdjuestRcv(String actAdjuestRcv) {
		this.actAdjuestRcv = actAdjuestRcv;
	}

	@Column(name = "DefReadonly", length = 1)
	public String getDefReadonly() {
		return this.defReadonly;
	}

	public void setDefReadonly(String defReadonly) {
		this.defReadonly = defReadonly;
	}

	@Column(name = "DefDisablePrint", length = 1)
	public String getDefDisablePrint() {
		return this.defDisablePrint;
	}

	public void setDefDisablePrint(String defDisablePrint) {
		this.defDisablePrint = defDisablePrint;
	}

	@Column(name = "DefLastDateTime", length = 1)
	public String getDefLastDateTime() {
		return this.defLastDateTime;
	}

	public void setDefLastDateTime(String defLastDateTime) {
		this.defLastDateTime = defLastDateTime;
	}

	@Column(name = "DefAllowLocalTime", length = 1)
	public String getDefAllowLocalTime() {
		return this.defAllowLocalTime;
	}

	public void setDefAllowLocalTime(String defAllowLocalTime) {
		this.defAllowLocalTime = defAllowLocalTime;
	}

	@Column(name = "ActReadOnly", length = 1)
	public String getActReadOnly() {
		return this.actReadOnly;
	}

	public void setActReadOnly(String actReadOnly) {
		this.actReadOnly = actReadOnly;
	}

	@Column(name = "ActDisablePrint", length = 1)
	public String getActDisablePrint() {
		return this.actDisablePrint;
	}

	public void setActDisablePrint(String actDisablePrint) {
		this.actDisablePrint = actDisablePrint;
	}

	@Column(name = "ActLastDateTime", length = 1)
	public String getActLastDateTime() {
		return this.actLastDateTime;
	}

	public void setActLastDateTime(String actLastDateTime) {
		this.actLastDateTime = actLastDateTime;
	}

	@Column(name = "ActAllowLocalTime", length = 1)
	public String getActAllowLocalTime() {
		return this.actAllowLocalTime;
	}

	public void setActAllowLocalTime(String actAllowLocalTime) {
		this.actAllowLocalTime = actAllowLocalTime;
	}

	@Column(name = "DefDeployTime")
	public Integer getDefDeployTime() {
		return this.defDeployTime;
	}

	public void setDefDeployTime(Integer defDeployTime) {
		this.defDeployTime = defDeployTime;
	}

	@Column(name = "MaxDeployTime")
	public Integer getMaxDeployTime() {
		return this.maxDeployTime;
	}

	public void setMaxDeployTime(Integer maxDeployTime) {
		this.maxDeployTime = maxDeployTime;
	}

}