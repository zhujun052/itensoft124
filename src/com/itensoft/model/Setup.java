package com.itensoft.model;

import java.util.Date;

public class Setup {
    private Integer rowid;

    private Integer authtype;

    private Date startdate;

    private Date lastdate;

    private Integer timeout;

    private String passwordcomplex;

    private String hint;

    private String autolockself;

    private Integer portforgui;

    private Integer portforclient;

    public Integer getRowid() {
        return rowid;
    }

    public void setRowid(Integer rowid) {
        this.rowid = rowid;
    }

    public Integer getAuthtype() {
        return authtype;
    }

    public void setAuthtype(Integer authtype) {
        this.authtype = authtype;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getLastdate() {
        return lastdate;
    }

    public void setLastdate(Date lastdate) {
        this.lastdate = lastdate;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public String getPasswordcomplex() {
        return passwordcomplex;
    }

    public void setPasswordcomplex(String passwordcomplex) {
        this.passwordcomplex = passwordcomplex == null ? null : passwordcomplex.trim();
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint == null ? null : hint.trim();
    }

    public String getAutolockself() {
        return autolockself;
    }

    public void setAutolockself(String autolockself) {
        this.autolockself = autolockself == null ? null : autolockself.trim();
    }

    public Integer getPortforgui() {
        return portforgui;
    }

    public void setPortforgui(Integer portforgui) {
        this.portforgui = portforgui;
    }

    public Integer getPortforclient() {
        return portforclient;
    }

    public void setPortforclient(Integer portforclient) {
        this.portforclient = portforclient;
    }
}