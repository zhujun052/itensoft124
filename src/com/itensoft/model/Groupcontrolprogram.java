package com.itensoft.model;

public class Groupcontrolprogram extends GroupcontrolprogramKey {
    private String encryptmode;

    private String printcontroled;

    public String getEncryptmode() {
        return encryptmode;
    }

    public void setEncryptmode(String encryptmode) {
        this.encryptmode = encryptmode == null ? null : encryptmode.trim();
    }

    public String getPrintcontroled() {
        return printcontroled;
    }

    public void setPrintcontroled(String printcontroled) {
        this.printcontroled = printcontroled == null ? null : printcontroled.trim();
    }
}