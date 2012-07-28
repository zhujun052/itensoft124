package com.itensoft;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ManagerMessage entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ManagerMessage", schema = "dbo", catalog = "phoenix")
public class ManagerMessage implements java.io.Serializable
{

	// Fields

	private Integer code;
	private String VManager;
	private String MName;
	private String CId;
	private String SId;
	private String action;
	private Date RQ;
	private String reason;
	private Integer status;
	private String accept;

	// Constructors

	/** default constructor */
	public ManagerMessage()
	{
	}

	/** minimal constructor */
	public ManagerMessage(String VManager, String MName, String CId)
	{
		this.VManager = VManager;
		this.MName = MName;
		this.CId = CId;
	}

	/** full constructor */
	public ManagerMessage(String VManager, String MName, String CId,
			String SId, String action, Date RQ, String reason, Integer status,
			String accept)
	{
		this.VManager = VManager;
		this.MName = MName;
		this.CId = CId;
		this.SId = SId;
		this.action = action;
		this.RQ = RQ;
		this.reason = reason;
		this.status = status;
		this.accept = accept;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Code", unique = true, nullable = false)
	public Integer getCode()
	{
		return this.code;
	}

	public void setCode(Integer code)
	{
		this.code = code;
	}

	@Column(name = "VirtualManager", nullable = false, length = 50)
	public String getVManager()
	{
		return this.VManager;
	}

	public void setVManager(String VManager)
	{
		this.VManager = VManager;
	}

	@Column(name = "ManagerName", nullable = false, length = 50)
	public String getMName()
	{
		return this.MName;
	}

	public void setMName(String MName)
	{
		this.MName = MName;
	}

	@Column(name = "ClientId", nullable = false, length = 50)
	public String getCId()
	{
		return this.CId;
	}

	public void setCId(String CId)
	{
		this.CId = CId;
	}

	@Column(name = "SessionId", length = 50)
	public String getSId()
	{
		return this.SId;
	}

	public void setSId(String SId)
	{
		this.SId = SId;
	}

	@Column(name = "Action", length = 10)
	public String getAction()
	{
		return this.action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}

	@Column(name = "DateTime", length = 23)
	public Date getRQ()
	{
		return this.RQ;
	}

	public void setRQ(Date RQ)
	{
		this.RQ = RQ;
	}

	@Column(name = "Reason", length = 500)
	public String getReason()
	{
		return this.reason;
	}

	public void setReason(String reason)
	{
		this.reason = reason;
	}

	@Column(name = "Status")
	public Integer getStatus()
	{
		return this.status;
	}

	public void setStatus(Integer status)
	{
		this.status = status;
	}

	@Column(name = "Accept", length = 1)
	public String getAccept()
	{
		return this.accept;
	}

	public void setAccept(String accept)
	{
		this.accept = accept;
	}

}