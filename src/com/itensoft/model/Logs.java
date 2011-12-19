package com.itensoft.model;

import java.util.Date;

public class Logs {
    private Integer code;

    private String clientid;

    private String sessionid;

    private String username;

    private Date datetime1;

    private String action;

    private String reason1;

    private String virtualmanager;

    private Date datetime2;

    private String result1;

    private String reason2;

    private Integer processcode;

    private String docer;

    private Date datetime3;

    private String result2;

    private String reason3;
    
    public Logs(){
    	
    }

    public Logs(Integer code, String clientid, String sessionid,
			String username, Date datetime1, String action, String reason1,
			String virtualmanager, Date datetime2, String result1,
			String reason2, Integer processcode, String docer, Date datetime3,
			String result2, String reason3) {
		super();
		this.code = code;
		this.clientid = clientid;
		this.sessionid = sessionid;
		this.username = username;
		this.datetime1 = datetime1;
		this.action = action;
		this.reason1 = reason1;
		this.virtualmanager = virtualmanager;
		this.datetime2 = datetime2;
		this.result1 = result1;
		this.reason2 = reason2;
		this.processcode = processcode;
		this.docer = docer;
		this.datetime3 = datetime3;
		this.result2 = result2;
		this.reason3 = reason3;
	}

	public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid == null ? null : clientid.trim();
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid == null ? null : sessionid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getDatetime1() {
        return datetime1;
    }

    public void setDatetime1(Date datetime1) {
        this.datetime1 = datetime1;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public String getReason1() {
        return reason1;
    }

    public void setReason1(String reason1) {
        this.reason1 = reason1 == null ? null : reason1.trim();
    }

    public String getVirtualmanager() {
        return virtualmanager;
    }

    public void setVirtualmanager(String virtualmanager) {
        this.virtualmanager = virtualmanager == null ? null : virtualmanager.trim();
    }

    public Date getDatetime2() {
        return datetime2;
    }

    public void setDatetime2(Date datetime2) {
        this.datetime2 = datetime2;
    }

    public String getResult1() {
        return result1;
    }

    public void setResult1(String result1) {
        this.result1 = result1 == null ? null : result1.trim();
    }

    public String getReason2() {
        return reason2;
    }

    public void setReason2(String reason2) {
        this.reason2 = reason2 == null ? null : reason2.trim();
    }

    public Integer getProcesscode() {
        return processcode;
    }

    public void setProcesscode(Integer processcode) {
        this.processcode = processcode;
    }

    public String getDocer() {
        return docer;
    }

    public void setDocer(String docer) {
        this.docer = docer == null ? null : docer.trim();
    }

    public Date getDatetime3() {
        return datetime3;
    }

    public void setDatetime3(Date datetime3) {
        this.datetime3 = datetime3;
    }

    public String getResult2() {
        return result2;
    }

    public void setResult2(String result2) {
        this.result2 = result2 == null ? null : result2.trim();
    }

    public String getReason3() {
        return reason3;
    }

    public void setReason3(String reason3) {
        this.reason3 = reason3 == null ? null : reason3.trim();
    }
    
}