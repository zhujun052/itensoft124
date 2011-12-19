package com.itensoft;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@SuppressWarnings("serial")
/**
 * SysUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "Sys_User", schema = "dbo", catalog = "phoenix")
public class SysUser implements java.io.Serializable {

	// Fields

	private String name;
	private String password;
	private String actived;
	private String actualName;
	private String scanEncryption;
	private String scanDecryption;
	private String auditClient;
	private String importOu;
	private String uninstallClient;
	private String groupSetup;
	private String manageDecryptionUser;
	private String manageServerUser;
	private String manageManagerUser;
	private String manageCert;
	private String updatePolicyLib;

	// Constructors

	/** default constructor */
	public SysUser() {
	}

	/** minimal constructor */
	public SysUser(String name) {
		this.name = name;
	}

	/** full constructor */
	public SysUser(String name, String password, String actived,
			String actualName, String scanEncryption, String scanDecryption,
			String auditClient, String importOu, String uninstallClient,
			String groupSetup, String manageDecryptionUser,
			String manageServerUser, String manageManagerUser,
			String manageCert, String updatePolicyLib) {
		this.name = name;
		this.password = password;
		this.actived = actived;
		this.actualName = actualName;
		this.scanEncryption = scanEncryption;
		this.scanDecryption = scanDecryption;
		this.auditClient = auditClient;
		this.importOu = importOu;
		this.uninstallClient = uninstallClient;
		this.groupSetup = groupSetup;
		this.manageDecryptionUser = manageDecryptionUser;
		this.manageServerUser = manageServerUser;
		this.manageManagerUser = manageManagerUser;
		this.manageCert = manageCert;
		this.updatePolicyLib = updatePolicyLib;
	}

	// Property accessors
	@Id
	@Column(name = "Name", unique = true, nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "password", length = 32)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "Actived", length = 1)
	public String getActived() {
		return this.actived;
	}

	public void setActived(String actived) {
		this.actived = actived;
	}

	@Column(name = "ActualName", length = 20)
	public String getActualName() {
		return this.actualName;
	}

	public void setActualName(String actualName) {
		this.actualName = actualName;
	}

	@Column(name = "ScanEncryption", length = 1)
	public String getScanEncryption() {
		return this.scanEncryption;
	}

	public void setScanEncryption(String scanEncryption) {
		this.scanEncryption = scanEncryption;
	}

	@Column(name = "ScanDecryption", length = 1)
	public String getScanDecryption() {
		return this.scanDecryption;
	}

	public void setScanDecryption(String scanDecryption) {
		this.scanDecryption = scanDecryption;
	}

	@Column(name = "AuditClient", length = 1)
	public String getAuditClient() {
		return this.auditClient;
	}

	public void setAuditClient(String auditClient) {
		this.auditClient = auditClient;
	}

	@Column(name = "ImportOU", length = 1)
	public String getImportOu() {
		return this.importOu;
	}

	public void setImportOu(String importOu) {
		this.importOu = importOu;
	}

	@Column(name = "UninstallClient", length = 1)
	public String getUninstallClient() {
		return this.uninstallClient;
	}

	public void setUninstallClient(String uninstallClient) {
		this.uninstallClient = uninstallClient;
	}

	@Column(name = "GroupSetup", length = 1)
	public String getGroupSetup() {
		return this.groupSetup;
	}

	public void setGroupSetup(String groupSetup) {
		this.groupSetup = groupSetup;
	}

	@Column(name = "ManageDecryptionUser", length = 1)
	public String getManageDecryptionUser() {
		return this.manageDecryptionUser;
	}

	public void setManageDecryptionUser(String manageDecryptionUser) {
		this.manageDecryptionUser = manageDecryptionUser;
	}

	@Column(name = "ManageServerUser", length = 1)
	public String getManageServerUser() {
		return this.manageServerUser;
	}

	public void setManageServerUser(String manageServerUser) {
		this.manageServerUser = manageServerUser;
	}

	@Column(name = "ManageManagerUser", length = 1)
	public String getManageManagerUser() {
		return this.manageManagerUser;
	}

	public void setManageManagerUser(String manageManagerUser) {
		this.manageManagerUser = manageManagerUser;
	}

	@Column(name = "ManageCert", length = 1)
	public String getManageCert() {
		return this.manageCert;
	}

	public void setManageCert(String manageCert) {
		this.manageCert = manageCert;
	}

	@Column(name = "UpdatePolicyLib", length = 1)
	public String getUpdatePolicyLib() {
		return this.updatePolicyLib;
	}

	public void setUpdatePolicyLib(String updatePolicyLib) {
		this.updatePolicyLib = updatePolicyLib;
	}

}