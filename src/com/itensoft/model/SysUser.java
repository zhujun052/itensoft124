package com.itensoft.model;

public class SysUser {
    private String name;

    private String password;

    private String actived;

    private String actualname;

    private String scanencryption;

    private String scandecryption;

    private String auditclient;

    private String importou;

    private String uninstallclient;

    private String groupsetup;

    private String managedecryptionuser;

    private String manageserveruser;

    private String managemanageruser;

    private String managecert;

    private String updatepolicylib;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getActived() {
        return actived;
    }

    public void setActived(String actived) {
        this.actived = actived == null ? null : actived.trim();
    }

    public String getActualname() {
        return actualname;
    }

    public void setActualname(String actualname) {
        this.actualname = actualname == null ? null : actualname.trim();
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

    public String getAuditclient() {
        return auditclient;
    }

    public void setAuditclient(String auditclient) {
        this.auditclient = auditclient == null ? null : auditclient.trim();
    }

    public String getImportou() {
        return importou;
    }

    public void setImportou(String importou) {
        this.importou = importou == null ? null : importou.trim();
    }

    public String getUninstallclient() {
        return uninstallclient;
    }

    public void setUninstallclient(String uninstallclient) {
        this.uninstallclient = uninstallclient == null ? null : uninstallclient.trim();
    }

    public String getGroupsetup() {
        return groupsetup;
    }

    public void setGroupsetup(String groupsetup) {
        this.groupsetup = groupsetup == null ? null : groupsetup.trim();
    }

    public String getManagedecryptionuser() {
        return managedecryptionuser;
    }

    public void setManagedecryptionuser(String managedecryptionuser) {
        this.managedecryptionuser = managedecryptionuser == null ? null : managedecryptionuser.trim();
    }

    public String getManageserveruser() {
        return manageserveruser;
    }

    public void setManageserveruser(String manageserveruser) {
        this.manageserveruser = manageserveruser == null ? null : manageserveruser.trim();
    }

    public String getManagemanageruser() {
        return managemanageruser;
    }

    public void setManagemanageruser(String managemanageruser) {
        this.managemanageruser = managemanageruser == null ? null : managemanageruser.trim();
    }

    public String getManagecert() {
        return managecert;
    }

    public void setManagecert(String managecert) {
        this.managecert = managecert == null ? null : managecert.trim();
    }

    public String getUpdatepolicylib() {
        return updatepolicylib;
    }

    public void setUpdatepolicylib(String updatepolicylib) {
        this.updatepolicylib = updatepolicylib == null ? null : updatepolicylib.trim();
    }
}