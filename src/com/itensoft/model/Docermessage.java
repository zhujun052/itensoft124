package com.itensoft.model;

import java.util.Date;

public class Docermessage {
    private Integer code;

    private String docer;

    private String virtualmanager;

    private Date datetime;

    private String clientid;

    private String sessionid;

    private String readed;

    private Integer action;

    private Integer result;

    private String note;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDocer() {
        return docer;
    }

    public void setDocer(String docer) {
        this.docer = docer == null ? null : docer.trim();
    }

    public String getVirtualmanager() {
        return virtualmanager;
    }

    public void setVirtualmanager(String virtualmanager) {
        this.virtualmanager = virtualmanager == null ? null : virtualmanager.trim();
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
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

    public String getReaded() {
        return readed;
    }

    public void setReaded(String readed) {
        this.readed = readed == null ? null : readed.trim();
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}