package com.itensoft;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ClientMessage entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ClientMessage", schema = "dbo", catalog = "phoenix")
public class ClientMessage implements java.io.Serializable {

	// Fields

	private Integer messageId;
	private String clientId;
	private String sessionId;
	private Date RQ;
	private String note;
	private String readed;
	private Integer action;
	private Integer result;
	private String from;
	private Integer fromRole;
	private String next;

	// Constructors

	/** default constructor */
	public ClientMessage() {
	}

	/** minimal constructor */
	public ClientMessage(String clientId) {
		this.clientId = clientId;
	}

	/** full constructor */
	public ClientMessage(String clientId, String sessionId, Date RQ,
			String note, String readed, Integer action, Integer result,
			String from, Integer fromRole, String next) {
		this.clientId = clientId;
		this.sessionId = sessionId;
		this.RQ = RQ;
		this.note = note;
		this.readed = readed;
		this.action = action;
		this.result = result;
		this.from = from;
		this.fromRole = fromRole;
		this.next = next;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "MessageId", unique = true, nullable = false)
	public Integer getMessageId() {
		return this.messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	@Column(name = "ClientId", nullable = false, length = 50)
	public String getCId() {
		return this.clientId;
	}

	public void setCId(String clientId) {
		this.clientId = clientId;
	}

	@Column(name = "SessionId", length = 50)
	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Column(name = "DateTime", length = 23)
	public Date getRQ() {
		return this.RQ;
	}

	public void setRQ(Date RQ) {
		this.RQ = RQ;
	}

	@Column(name = "Note", length = 500)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "Readed", length = 1)
	public String getRD() {
		return this.readed;
	}

	public void setRD(String readed) {
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

	@Column(name = "[From]", length = 50)
	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	@Column(name = "FromRole")
	public Integer getFromRole() {
		return this.fromRole;
	}

	public void setFromRole(Integer fromRole) {
		this.fromRole = fromRole;
	}

	@Column(name = "Next", length = 50)
	public String getNext() {
		return this.next;
	}

	public void setNext(String next) {
		this.next = next;
	}

}