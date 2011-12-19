package com.itensoft.model;

import java.util.Date;

public class Clientlog {
    private Integer rowid;

    private Date datetime;

    private String hardid;

    private String filename;

    private String action;

    public Integer getRowid() {
        return rowid;
    }

    public void setRowid(Integer rowid) {
        this.rowid = rowid;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getHardid() {
        return hardid;
    }

    public void setHardid(String hardid) {
        this.hardid = hardid == null ? null : hardid.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }
}