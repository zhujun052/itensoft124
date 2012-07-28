package com.itensoft.model;

public class Groupfinalcontrolprogram extends GroupfinalcontrolprogramKey {
    private Integer encryptmode;

    private String printcontroled;

    public Integer getEncryptmode() {
        return encryptmode;
    }

    public void setEncryptmode(Integer encryptmode) {
        this.encryptmode = encryptmode;
    }

    public String getPrintcontroled() {
        return printcontroled;
    }

    public void setPrintcontroled(String printcontroled) {
        this.printcontroled = printcontroled == null ? null : printcontroled.trim();
    }
}