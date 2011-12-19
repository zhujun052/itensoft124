package com.itensoft;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
@SuppressWarnings("serial")
/**
 * ClientLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ClientLog", schema = "dbo", catalog = "phoenix")
public class ClientLog implements java.io.Serializable {

	// Fields

	private Integer rowId;
	private Date RQ;
	private String hardId;
	private String fileName;
	private String action;

	// Constructors

	/** default constructor */
	public ClientLog() {
	}

	/** full constructor */
	public ClientLog(Date RQ, String hardId, String fileName, String action) {
		this.RQ = RQ;
		this.hardId = hardId;
		this.fileName = fileName;
		this.action = action;
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

	@Column(name = "[DateTime]", length = 23)
	public Date getRQ() {
		return this.RQ;
	}

	public void setRQ(Date RQ) {
		this.RQ = RQ;
	}

	@Column(name = "HardId", length = 50)
	public String getHardId() {
		return this.hardId;
	}

	public void setHardId(String hardId) {
		this.hardId = hardId;
	}

	@Column(name = "FileName", length = 520)
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Column(name = "Action", length = 50)
	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}