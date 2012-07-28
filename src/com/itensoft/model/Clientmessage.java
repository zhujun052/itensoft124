package com.itensoft.model;

import java.util.Date;

public class Clientmessage {
    private Integer messageid;

    private String clientid;

    private String sessionid;

    private Date datetime;

    private String note;

    private String readed;

    private Integer action;

    private Integer result;

    private String from;

    private Integer fromrole;

    private String next;

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
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

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
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

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }

    public Integer getFromrole() {
        return fromrole;
    }

    public void setFromrole(Integer fromrole) {
        this.fromrole = fromrole;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next == null ? null : next.trim();
    }
}