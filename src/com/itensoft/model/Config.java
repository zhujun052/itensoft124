package com.itensoft.model;

public class Config {
    private Integer id;

    private String syskey;

    private String sysvalue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSyskey() {
        return syskey;
    }

    public void setSyskey(String syskey) {
        this.syskey = syskey == null ? null : syskey.trim();
    }

    public String getSysvalue() {
        return sysvalue;
    }

    public void setSysvalue(String sysvalue) {
        this.sysvalue = sysvalue == null ? null : sysvalue.trim();
    }
}