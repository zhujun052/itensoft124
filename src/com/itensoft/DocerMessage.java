package com.itensoft;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DocerMessage entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "DocerMessage", schema = "dbo", catalog = "phoenix")
public class DocerMessage implements java.io.Serializable {

	// Fields

	private Integer code;
	private String docer;
	private String virtualManager;
	private Date dateTime;
	private String clientId;
	private String sessionId;
	private String readed;
	private Integer action;
	private Integer result;
	private String note;

	// Constructors

	/** default constructor */
	public DocerMessage() {
	}

	/** full constructor */
	public DocerMessage(String docer, String virtualManager, Date dateTime,
			String clientId, String sessionId, String readed, Integer action,
			Integer result, String note) {
		this.docer = docer;
		this.virtualManager = virtualManager;
		this.dateTime = dateTime;
		this.clientId = clientId;
		this.sessionId = sessionId;
		this.readed = readed;
		this.action = action;
		this.result = result;
		this.note = note;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Code", unique = true, nullable = false)
	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	@Column(name = "Docer", length = 50)
	public String getDocer() {
		return this.docer;
	}

	public void setDocer(String docer) {
		this.docer = docer;
	}

	@Column(name = "VirtualManager", length = 50)
	public String getVirtualManager() {
		return this.virtualManager;
	}

	public void setVirtualManager(String virtualManager) {
		this.virtualManager = virtualManager;
	}

	@Column(name = "DateTime", length = 23)
	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	@Column(name = "ClientId", length = 50)
	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	@Column(name = "SessionId", length = 50)
	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Column(name = "Readed", length = 1)
	public String getReaded() {
		return this.readed;
	}

	public void setReaded(String readed) {
		this.readed = readed;
	}

	@Column(name = "Action")
	public Integer getAction() {
		return this.action;
	}

	public void setAction(Integer action) {
		this.action = action;
	}

	@Column(name = "Result")
	public Integer getResult() {
		return this.result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}

	@Column(name = "Note", length = 500)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}