package com.itensoft.model;

public class RefreshclientKey {
    private String hardid;

    private Integer type;

    public String getHardid() {
        return hardid;
    }

    public void setHardid(String hardid) {
        this.hardid = hardid == null ? null : hardid.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}