package com.itensoft;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "Role", schema = "dbo", catalog = "phoenix")
public class Role implements java.io.Serializable
{

	// Fields

	private String name;
	private String logonServer;
	private Integer groupCode;
	private String auditClient;
	private String uninstallClient;
	private String manageCert;
	private String scanEncryption;
	private String scanDecryption;
	private String updateSignatureLib;
	private String logonManage;
	private String responseDecrypt;
	private String responseDeploy;
	private String responseAdjuest;
	private String responseDeployReadonly;
	private String responseDeployDisablePrint;
	private String responseDeployDisableSnapshot;
	private String responseDeployDeleteSelf;
	private String logonAlone;
	private String aloneDecrypt;
	private String aloneDeploy;
	private String aloneAdjuest;
	private String logonDocer;
	private String docDecrypt;
	private String docChangeGrant;
	private String docPack;

	// Constructors

	/** default constructor */
	public Role()
	{
	}

	/** minimal constructor */
	public Role(String name)
	{
		this.name = name;
	}

	/** full constructor */
	public Role(String name, String logonServer, Integer groupCode,
			String auditClient, String uninstallClient, String manageCert,
			String scanEncryption, String scanDecryption,
			String updateSignatureLib, String logonManage,
			String responseDecrypt, String responseDeploy,
			String responseAdjuest, String responseDeployReadonly,
			String responseDeployDisablePrint,
			String responseDeployDisableSnapshot,
			String responseDeployDeleteSelf, String logonAlone,
			String aloneDecrypt, String aloneDeploy, String aloneAdjuest,
			String logonDocer, String docDecrypt, String docChangeGrant,
			String docPack)
	{
		this.name = name;
		this.logonServer = logonServer;
		this.groupCode = groupCode;
		this.auditClient = auditClient;
		this.uninstallClient = uninstallClient;
		this.manageCert = manageCert;
		this.scanEncryption = scanEncryption;
		this.scanDecryption = scanDecryption;
		this.updateSignatureLib = updateSignatureLib;
		this.logonManage = logonManage;
		this.responseDecrypt = responseDecrypt;
		this.responseDeploy = responseDeploy;
		this.responseAdjuest = responseAdjuest;
		this.responseDeployReadonly = responseDeployReadonly;
		this.responseDeployDisablePrint = responseDeployDisablePrint;
		this.responseDeployDisableSnapshot = responseDeployDisableSnapshot;
		this.responseDeployDeleteSelf = responseDeployDeleteSelf;
		this.logonAlone = logonAlone;
		this.aloneDecrypt = aloneDecrypt;
		this.aloneDeploy = aloneDeploy;
		this.aloneAdjuest = aloneAdjuest;
		this.logonDocer = logonDocer;
		this.docDecrypt = docDecrypt;
		this.docChangeGrant = docChangeGrant;
		this.docPack = docPack;
	}

	// Property accessors
	@Id
	@Column(name = "Name", unique = true, nullable = false, length = 50)
	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Column(name = "LogonServer", length = 1)
	public String getLogonServer()
	{
		return this.logonServer;
	}

	public void setLogonServer(String logonServer)
	{
		this.logonServer = logonServer;
	}

	@Column(name = "GroupCode")
	public Integer getGroupCode()
	{
		return this.groupCode;
	}

	public void setGroupCode(Integer groupCode)
	{
		this.groupCode = groupCode;
	}

	@Column(name = "AuditClient", length = 1)
	public String getAuditClient()
	{
		return this.auditClient;
	}

	public void setAuditClient(String auditClient)
	{
		this.auditClient = auditClient;
	}

	@Column(name = "UninstallClient", length = 1)
	public String getUninstallClient()
	{
		return this.uninstallClient;
	}

	public void setUninstallClient(String uninstallClient)
	{
		this.uninstallClient = uninstallClient;
	}

	@Column(name = "ManageCert", length = 1)
	public String getManageCert()
	{
		return this.manageCert;
	}

	public void setManageCert(String manageCert)
	{
		this.manageCert = manageCert;
	}

	@Column(name = "ScanEncryption", length = 1)
	public String getScanEncryption()
	{
		return this.scanEncryption;
	}

	public void setScanEncryption(String scanEncryption)
	{
		this.scanEncryption = scanEncryption;
	}

	@Column(name = "ScanDecryption", length = 1)
	public String getScanDecryption()
	{
		return this.scanDecryption;
	}

	public void setScanDecryption(String scanDecryption)
	{
		this.scanDecryption = scanDecryption;
	}

	@Column(name = "UpdateSignatureLib", length = 1)
	public String getUpdateSignatureLib()
	{
		return this.updateSignatureLib;
	}

	public void setUpdateSignatureLib(String updateSignatureLib)
	{
		this.updateSignatureLib = updateSignatureLib;
	}

	@Column(name = "LogonManage", length = 1)
	public String getLogonManage()
	{
		return this.logonManage;
	}

	public void setLogonManage(String logonManage)
	{
		this.logonManage = logonManage;
	}

	@Column(name = "ResponseDecrypt", length = 1)
	public String getResponseDecrypt()
	{
		return this.responseDecrypt;
	}

	public void setResponseDecrypt(String responseDecrypt)
	{
		this.responseDecrypt = responseDecrypt;
	}

	@Column(name = "ResponseDeploy", length = 1)
	public String getResponseDeploy()
	{
		return this.responseDeploy;
	}

	public void setResponseDeploy(String responseDeploy)
	{
		this.responseDeploy = responseDeploy;
	}

	@Column(name = "ResponseAdjuest", length = 1)
	public String getResponseAdjuest()
	{
		return this.responseAdjuest;
	}

	public void setResponseAdjuest(String responseAdjuest)
	{
		this.responseAdjuest = responseAdjuest;
	}

	@Column(name = "ResponseDeployReadonly", length = 1)
	public String getResponseDeployReadonly()
	{
		return this.responseDeployReadonly;
	}

	public void setResponseDeployReadonly(String responseDeployReadonly)
	{
		this.responseDeployReadonly = responseDeployReadonly;
	}

	@Column(name = "ResponseDeployDisablePrint", length = 1)
	public String getResponseDeployDisablePrint()
	{
		return this.responseDeployDisablePrint;
	}

	public void setResponseDeployDisablePrint(String responseDeployDisablePrint)
	{
		this.responseDeployDisablePrint = responseDeployDisablePrint;
	}

	@Column(name = "ResponseDeployDisableSnapshot", length = 1)
	public String getResponseDeployDisableSnapshot()
	{
		return this.responseDeployDisableSnapshot;
	}

	public void setResponseDeployDisableSnapshot(
			String responseDeployDisableSnapshot)
	{
		this.responseDeployDisableSnapshot = responseDeployDisableSnapshot;
	}

	@Column(name = "ResponseDeployDeleteSelf", length = 1)
	public String getResponseDeployDeleteSelf()
	{
		return this.responseDeployDeleteSelf;
	}

	public void setResponseDeployDeleteSelf(String responseDeployDeleteSelf)
	{
		this.responseDeployDeleteSelf = responseDeployDeleteSelf;
	}

	@Column(name = "LogonAlone", length = 1)
	public String getLogonAlone()
	{
		return this.logonAlone;
	}

	public void setLogonAlone(String logonAlone)
	{
		this.logonAlone = logonAlone;
	}

	@Column(name = "AloneDecrypt", length = 1)
	public String getAloneDecrypt()
	{
		return this.aloneDecrypt;
	}

	public void setAloneDecrypt(String aloneDecrypt)
	{
		this.aloneDecrypt = aloneDecrypt;
	}

	@Column(name = "AloneDeploy", length = 1)
	public String getAloneDeploy()
	{
		return this.aloneDeploy;
	}

	public void setAloneDeploy(String aloneDeploy)
	{
		this.aloneDeploy = aloneDeploy;
	}

	@Column(name = "AloneAdjuest", length = 1)
	public String getAloneAdjuest()
	{
		return this.aloneAdjuest;
	}

	public void setAloneAdjuest(String aloneAdjuest)
	{
		this.aloneAdjuest = aloneAdjuest;
	}

	@Column(name = "LogonDocer", length = 1)
	public String getLogonDocer()
	{
		return this.logonDocer;
	}

	public void setLogonDocer(String logonDocer)
	{
		this.logonDocer = logonDocer;
	}

	@Column(name = "DocDecrypt", length = 1)
	public String getDocDecrypt()
	{
		return this.docDecrypt;
	}

	public void setDocDecrypt(String docDecrypt)
	{
		this.docDecrypt = docDecrypt;
	}

	@Column(name = "DocChangeGrant", length = 1)
	public String getDocChangeGrant()
	{
		return this.docChangeGrant;
	}

	public void setDocChangeGrant(String docChangeGrant)
	{
		this.docChangeGrant = docChangeGrant;
	}

	@Column(name = "DocPack", length = 1)
	public String getDocPack()
	{
		return this.docPack;
	}

	public void setDocPack(String docPack)
	{
		this.docPack = docPack;
	}

}