package com.itensoft.model;

public class Groupfinalmanager {
    private Integer groupcode;

    private String virtualmanagername;

    public Integer getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(Integer groupcode) {
        this.groupcode = groupcode;
    }

    public String getVirtualmanagername() {
        return virtualmanagername;
    }

    public void setVirtualmanagername(String virtualmanagername) {
        this.virtualmanagername = virtualmanagername == null ? null : virtualmanagername.trim();
    }
}