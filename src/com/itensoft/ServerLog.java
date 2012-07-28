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
 * ServerLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ServerLog", schema = "dbo", catalog = "phoenix")
public class ServerLog implements java.io.Serializable {

	// Fields

	private Integer rowId;
	private String userName;
	private Date RQ;
	private String event;
	private String note;

	// Constructors

	/** default constructor */
	public ServerLog() {
	}

	/** minimal constructor */
	public ServerLog(String userName) {
		this.userName = userName;
	}

	/** full constructor */
	public ServerLog(String userName, Date RQ, String event, String note) {
		this.userName = userName;
		this.RQ = RQ;
		this.event = event;
		this.note = note;
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

	@Column(name = "[UserName]", nullable = false, length = 50)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "[DateTime]", length = 23)
	public Date getRQ() {
		return this.RQ;
	}

	public void setRQ(Date RQ) {
		this.RQ = RQ;
	}

	@Column(name = "Event", length = 50)
	public String getEvent() {
		return this.event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	@Column(name = "Note", length = 260)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}