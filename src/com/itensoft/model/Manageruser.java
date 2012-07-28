package com.itensoft.model;

public class Manageruser {
    private String name;

    private String hardid;

    private String password;

    private String note;

    private String allowselfdecrypt;

    private String offline;

    private String actived;

    private String actdecrypt;

    private String actdeploy;

    private String actadjuestrcv;

    private String defreadonly;

    private String defdisableprint;

    private String deflastdatetime;

    private String defallowlocaltime;

    private String actreadonly;

    private String actdisableprint;

    private String actlastdatetime;

    private String actallowlocaltime;

    private Integer defdeploytime;

    private Integer maxdeploytime;

    private String usbkeysn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getHardid() {
        return hardid;
    }

    public void setHardid(String hardid) {
        this.hardid = hardid == null ? null : hardid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getAllowselfdecrypt() {
        return allowselfdecrypt;
    }

    public void setAllowselfdecrypt(String allowselfdecrypt) {
        this.allowselfdecrypt = allowselfdecrypt == null ? null : allowselfdecrypt.trim();
    }

    public String getOffline() {
        return offline;
    }

    public void setOffline(String offline) {
        this.offline = offline == null ? null : offline.trim();
    }

    public String getActived() {
        return actived;
    }

    public void setActived(String actived) {
        this.actived = actived == null ? null : actived.trim();
    }

    public String getActdecrypt() {
        return actdecrypt;
    }

    public void setActdecrypt(String actdecrypt) {
        this.actdecrypt = actdecrypt == null ? null : actdecrypt.trim();
    }

    public String getActdeploy() {
        return actdeploy;
    }

    public void setActdeploy(String actdeploy) {
        this.actdeploy = actdeploy == null ? null : actdeploy.trim();
    }

    public String getActadjuestrcv() {
        return actadjuestrcv;
    }

    public void setActadjuestrcv(String actadjuestrcv) {
        this.actadjuestrcv = actadjuestrcv == null ? null : actadjuestrcv.trim();
    }

    public String getDefreadonly() {
        return defreadonly;
    }

    public void setDefreadonly(String defreadonly) {
        this.defreadonly = defreadonly == null ? null : defreadonly.trim();
    }

    public String getDefdisableprint() {
        return defdisableprint;
    }

    public void setDefdisableprint(String defdisableprint) {
        this.defdisableprint = defdisableprint == null ? null : defdisableprint.trim();
    }

    public String getDeflastdatetime() {
        return deflastdatetime;
    }

    public void setDeflastdatetime(String deflastdatetime) {
        this.deflastdatetime = deflastdatetime == null ? null : deflastdatetime.trim();
    }

    public String getDefallowlocaltime() {
        return defallowlocaltime;
    }

    public void setDefallowlocaltime(String defallowlocaltime) {
        this.defallowlocaltime = defallowlocaltime == null ? null : defallowlocaltime.trim();
    }

    public String getActreadonly() {
        return actreadonly;
    }

    public void setActreadonly(String actreadonly) {
        this.actreadonly = actreadonly == null ? null : actreadonly.trim();
    }

    public String getActdisableprint() {
        return actdisableprint;
    }

    public void setActdisableprint(String actdisableprint) {
        this.actdisableprint = actdisableprint == null ? null : actdisableprint.trim();
    }

    public String getActlastdatetime() {
        return actlastdatetime;
    }

    public void setActlastdatetime(String actlastdatetime) {
        this.actlastdatetime = actlastdatetime == null ? null : actlastdatetime.trim();
    }

    public String getActallowlocaltime() {
        return actallowlocaltime;
    }

    public void setActallowlocaltime(String actallowlocaltime) {
        this.actallowlocaltime = actallowlocaltime == null ? null : actallowlocaltime.trim();
    }

    public Integer getDefdeploytime() {
        return defdeploytime;
    }

    public void setDefdeploytime(Integer defdeploytime) {
        this.defdeploytime = defdeploytime;
    }

    public Integer getMaxdeploytime() {
        return maxdeploytime;
    }

    public void setMaxdeploytime(Integer maxdeploytime) {
        this.maxdeploytime = maxdeploytime;
    }

    public String getUsbkeysn() {
        return usbkeysn;
    }

    public void setUsbkeysn(String usbkeysn) {
        this.usbkeysn = usbkeysn == null ? null : usbkeysn.trim();
    }
}