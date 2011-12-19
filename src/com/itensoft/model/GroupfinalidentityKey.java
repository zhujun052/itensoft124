package com.itensoft.model;

public class GroupfinalidentityKey {
    private Integer groupcode;

    private String certid;

    public Integer getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(Integer groupcode) {
        this.groupcode = groupcode;
    }

    public String getCertid() {
        return certid;
    }

    public void setCertid(String certid) {
        this.certid = certid == null ? null : certid.trim();
    }
}