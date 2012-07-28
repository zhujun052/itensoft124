package com.itensoft;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@SuppressWarnings("serial")
/**
 * Setup entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "Setup", schema = "dbo", catalog = "phoenix")
public class Setup implements java.io.Serializable {

	// Fields

	private Integer rowId;
	private Integer authType;
	private Date startDate;
	private Date lastDate;
	private Integer timeOut;
	private String passwordComplex;

	// Constructors

	/** default constructor */
	public Setup() {
	}

	/** minimal constructor */
	public Setup(Integer rowId) {
		this.rowId = rowId;
	}

	/** full constructor */
	public Setup(Integer rowId, Integer authType, Date startDate,
			Date lastDate, Integer timeOut, String passwordComplex) {
		this.rowId = rowId;
		this.authType = authType;
		this.startDate = startDate;
		this.lastDate = lastDate;
		this.timeOut = timeOut;
		this.passwordComplex = passwordComplex;
	}

	// Property accessors
	@Id
	@Column(name = "RowID", unique = true, nullable = false)
	public Integer getRowId() {
		return this.rowId;
	}

	public void setRowId(Integer rowId) {
		this.rowId = rowId;
	}

	@Column(name = "AuthType")
	public Integer getAuthType() {
		return this.authType;
	}

	public void setAuthType(Integer authType) {
		this.authType = authType;
	}

	@Column(name = "StartDate", length = 23)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Column(name = "LastDate", length = 23)
	public Date getLastDate() {
		return this.lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}

	@Column(name = "TimeOut")
	public Integer getTimeOut() {
		return this.timeOut;
	}

	public void setTimeOut(Integer timeOut) {
		this.timeOut = timeOut;
	}

	@Column(name = "PasswordComplex", length = 1)
	public String getPasswordComplex() {
		return this.passwordComplex;
	}

	public void setPasswordComplex(String passwordComplex) {
		this.passwordComplex = passwordComplex;
	}

}