package com.itensoft.model;

public class ManagerusergroupKey {
    private String managerusername;

    private Integer groupcode;

    public String getManagerusername() {
        return managerusername;
    }

    public void setManagerusername(String managerusername) {
        this.managerusername = managerusername == null ? null : managerusername.trim();
    }

    public Integer getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(Integer groupcode) {
        this.groupcode = groupcode;
    }
}