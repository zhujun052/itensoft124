package com.itensoft.model;

public class Role {
    private String name;

    private String logonserver;

    private Integer groupcode;

    private String auditclient;

    private String uninstallclient;

    private String managecert;

    private String scanencryption;

    private String scandecryption;

    private String updatesignaturelib;

    private String logonmanage;

    private String responsedecrypt;

    private String responsedeploy;

    private String responseadjuest;

    private String responsedeployreadonly;

    private String responsedeploydisableprint;

    private String responsedeploydisablesnapshot;

    private String responsedeploydeleteself;

    private String logonalone;

    private String alonedecrypt;

    private String alonedeploy;

    private String aloneadjuest;

    private String logondocer;

    private String docdecrypt;

    private String docchangegrant;

    private String docpack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLogonserver() {
        return logonserver;
    }

    public void setLogonserver(String logonserver) {
        this.logonserver = logonserver == null ? null : logonserver.trim();
    }

    public Integer getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(Integer groupcode) {
        this.groupcode = groupcode;
    }

    public String getAuditclient() {
        return auditclient;
    }

    public void setAuditclient(String auditclient) {
        this.auditclient = auditclient == null ? null : auditclient.trim();
    }

    public String getUninstallclient() {
        return uninstallclient;
    }

    public void setUninstallclient(String uninstallclient) {
        this.uninstallclient = uninstallclient == null ? null : uninstallclient.trim();
    }

    public String getManagecert() {
        return managecert;
    }

    public void setManagecert(String managecert) {
        this.managecert = managecert == null ? null : managecert.trim();
    }

    public String getScanencryption() {
        return scanencryption;
    }

    public void setScanencryption(String scanencryption) {
        this.scanencryption = scanencryption == null ? null : scanencryption.trim();
    }

    public String getScandecryption() {
        return scandecryption;
    }

    public void setScandecryption(String scandecryption) {
        this.scandecryption = scandecryption == null ? null : scandecryption.trim();
    }

    public String getUpdatesignaturelib() {
        return updatesignaturelib;
    }

    public void setUpdatesignaturelib(String updatesignaturelib) {
        this.updatesignaturelib = updatesignaturelib == null ? null : updatesignaturelib.trim();
    }

    public String getLogonmanage() {
        return logonmanage;
    }

    public void setLogonmanage(String logonmanage) {
        this.logonmanage = logonmanage == null ? null : logonmanage.trim();
    }

    public String getResponsedecrypt() {
        return responsedecrypt;
    }

    public void setResponsedecrypt(String responsedecrypt) {
        this.responsedecrypt = responsedecrypt == null ? null : responsedecrypt.trim();
    }

    public String getResponsedeploy() {
        return responsedeploy;
    }

    public void setResponsedeploy(String responsedeploy) {
        this.responsedeploy = responsedeploy == null ? null : responsedeploy.trim();
    }

    public String getResponseadjuest() {
        return responseadjuest;
    }

    public void setResponseadjuest(String responseadjuest) {
        this.responseadjuest = responseadjuest == null ? null : responseadjuest.trim();
    }

    public String getResponsedeployreadonly() {
        return responsedeployreadonly;
    }

    public void setResponsedeployreadonly(String responsedeployreadonly) {
        this.responsedeployreadonly = responsedeployreadonly == null ? null : responsedeployreadonly.trim();
    }

    public String getResponsedeploydisableprint() {
        return responsedeploydisableprint;
    }

    public void setResponsedeploydisableprint(String responsedeploydisableprint) {
        this.responsedeploydisableprint = responsedeploydisableprint == null ? null : responsedeploydisableprint.trim();
    }

    public String getResponsedeploydisablesnapshot() {
        return responsedeploydisablesnapshot;
    }

    public void setResponsedeploydisablesnapshot(String responsedeploydisablesnapshot) {
        this.responsedeploydisablesnapshot = responsedeploydisablesnapshot == null ? null : responsedeploydisablesnapshot.trim();
    }

    public String getResponsedeploydeleteself() {
        return responsedeploydeleteself;
    }

    public void setResponsedeploydeleteself(String responsedeploydeleteself) {
        this.responsedeploydeleteself = responsedeploydeleteself == null ? null : responsedeploydeleteself.trim();
    }

    public String getLogonalone() {
        return logonalone;
    }

    public void setLogonalone(String logonalone) {
        this.logonalone = logonalone == null ? null : logonalone.trim();
    }

    public String getAlonedecrypt() {
        return alonedecrypt;
    }

    public void setAlonedecrypt(String alonedecrypt) {
        this.alonedecrypt = alonedecrypt == null ? null : alonedecrypt.trim();
    }

    public String getAlonedeploy() {
        return alonedeploy;
    }

    public void setAlonedeploy(String alonedeploy) {
        this.alonedeploy = alonedeploy == null ? null : alonedeploy.trim();
    }

    public String getAloneadjuest() {
        return aloneadjuest;
    }

    public void setAloneadjuest(String aloneadjuest) {
        this.aloneadjuest = aloneadjuest == null ? null : aloneadjuest.trim();
    }

    public String getLogondocer() {
        return logondocer;
    }

    public void setLogondocer(String logondocer) {
        this.logondocer = logondocer == null ? null : logondocer.trim();
    }

    public String getDocdecrypt() {
        return docdecrypt;
    }

    public void setDocdecrypt(String docdecrypt) {
        this.docdecrypt = docdecrypt == null ? null : docdecrypt.trim();
    }

    public String getDocchangegrant() {
        return docchangegrant;
    }

    public void setDocchangegrant(String docchangegrant) {
        this.docchangegrant = docchangegrant == null ? null : docchangegrant.trim();
    }

    public String getDocpack() {
        return docpack;
    }

    public void setDocpack(String docpack) {
        this.docpack = docpack == null ? null : docpack.trim();
    }
}