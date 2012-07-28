package com.itensoft;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Log entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "Logs", schema = "dbo", catalog = "phoenix")
public class Log implements java.io.Serializable {

	// Fields

	private Integer code;
	private String clientId;
	private String sessionId;
	private String xm;
	private Date RQ1;
	private String action;
	private String reason1;
	private String virtualManager;
	private Date RQ2;
	private String result1;
	private String reason2;
	//private Integer processCode;
	private DocerMessage docerMessage;
	private String docer;
	private Date RQ3;
	private String result2;
	private String reason3;

	// Constructors

	/** default constructor */
	public Log() {
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

	@Column(name = "[UserName]", length = 50)
	public String getXM() {
		return this.xm;
	}

	public void setXM(String xm) {
		this.xm = xm;
	}

	@Column(name = "[DateTime1]", length = 23)
	public Date getRQ1() {
		return this.RQ1;
	}

	public void setRQ1(Date dateTime1) {
		this.RQ1 = dateTime1;
	}

	@Column(name = "Action", length = 10)
	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Column(name = "Reason1", length = 500)
	public String getReason1() {
		return this.reason1;
	}

	public void setReason1(String reason1) {
		this.reason1 = reason1;
	}

	@Column(name = "VirtualManager", length = 50)
	public String getVM() {
		return this.virtualManager;
	}

	public void setVM(String virtualManager) {
		this.virtualManager = virtualManager;
	}

	@Column(name = "DateTime2", length = 23)
	public Date getRQ2() {
		return this.RQ2;
	}

	public void setRQ2(Date dateTime2) {
		this.RQ2 = dateTime2;
	}

	@Column(name = "Result1", length = 50)
	public String getResult1() {
		return this.result1;
	}

	public void setResult1(String result1) {
		this.result1 = result1;
	}

	@Column(name = "Reason2", length = 500)
	public String getReason2() {
		return this.reason2;
	}

	public void setReason2(String reason2) {
		this.reason2 = reason2;
	}
	
	@OneToOne(fetch=FetchType.LAZY,optional=true, cascade = CascadeType.ALL)
	@JoinColumn(name = "ProcessCode")
	public DocerMessage getDocerMessage(){
		return this.docerMessage;
	}
	
	public void setDocerMessage(DocerMessage docerMessage){
		this.docerMessage = docerMessage;
	}

	@Column(name = "Docer", length = 50)
	public String getDC() {
		return this.docer;
	}

	public void setDC(String docer) {
		this.docer = docer;
	}

	@Column(name = "DateTime3", length = 23)
	public Date getRQ3() {
		return this.RQ3;
	}

	public void setRQ3(Date dateTime3) {
		this.RQ3 = dateTime3;
	}

	@Column(name = "Result2", length = 50)
	public String getResult2() {
		return this.result2;
	}

	public void setResult2(String result2) {
		this.result2 = result2;
	}

	@Column(name = "Reason3", length = 500)
	public String getReason3() {
		return this.reason3;
	}

	public void setReason3(String reason3) {
		this.reason3 = reason3;
	}

}