package com.itensoft;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ManagerLog entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "ManagerLog", schema = "dbo", catalog = "phoenix")
public class ManagerLog implements java.io.Serializable {

	// Fields

	private Integer rowId;
	private String userName;
	private String hardId;
	private Date RQ;
	private String action;
	private String fileName;
	private String reason;

	// Constructors

	/** default constructor */
	public ManagerLog() {
	}

	/** minimal constructor */
	public ManagerLog(String userName) {
		this.userName = userName;
	}

	/** full constructor */
	public ManagerLog(String userName, String hardId, Date RQ, String action,
			String fileName, String reason) {
		this.userName = userName;
		this.hardId = hardId;
		this.RQ = RQ;
		this.action = action;
		this.fileName = fileName;
		this.reason = reason;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "RowID", unique = true, nullable = false)
	public Integer getRowId() {
		return this.rowId;
	}

	public void setRowId(Integer rowId) {
		this.rowId = rowId;
	}

	@Column(name = "UserName", nullable = false, length = 50)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "HardId", length = 50)
	public String getHardId() {
		return this.hardId;
	}

	public void setHardId(String hardId) {
		this.hardId = hardId;
	}

	@Column(name = "[DateTime]", length = 23)
	public Date getRQ() {
		return this.RQ;
	}

	public void setRQ(Date RQ) {
		this.RQ = RQ;
	}

	@Column(name = "Action", length = 1)
	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Column(name = "FileName", length = 520)
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Column(name = "Reason", length = 260)
	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}