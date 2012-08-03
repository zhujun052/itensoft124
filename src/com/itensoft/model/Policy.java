package com.itensoft.model;

import java.util.Date;

public class Policy {
    private Integer code;

    private String printcontroled;

    private Byte udiskmode;

    private Integer offlinetime;

    private String onlinemode;

    private String logudiskop;

    private String lognetop;

    private String logprint;

    private String useblacklist;

    private String clipboardcontroled;

    private String olecontroled;

    private String dragdropcontroled;

    private String snapshotcontroled;

    private String printcontroledex;

    private String needkey;

    private Integer validatedays;

    private String previewspec;

    private String autobackup;

    private String backupspec;

    private String backupdir;

    private String backupexcludespec;

    private Integer backupcount;

    private String overlayicon;

    private String spoolsv;

    private String encryptionslot;

    private String decryptionslot;

    private String watermark;

    private String checkofflinedate;

    private Date offlinedate;

    private String ftp;

    private String ftpusername;

    private String ftppassword;

    private String uishowmanagericon;

    private String uishowexecutoricon;

    private String ftpbackup;

    private String ftpbackupusername;

    private String ftpbackuppassword;
    
    private String usbcontrolmode;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getPrintcontroled() {
        return printcontroled;
    }

    public void setPrintcontroled(String printcontroled) {
        this.printcontroled = printcontroled == null ? null : printcontroled.trim();
    }

    public Byte getUdiskmode() {
        return udiskmode;
    }

    public void setUdiskmode(Byte udiskmode) {
        this.udiskmode = udiskmode;
    }

    public Integer getOfflinetime() {
        return offlinetime;
    }

    public void setOfflinetime(Integer offlinetime) {
        this.offlinetime = offlinetime;
    }

    public String getOnlinemode() {
        return onlinemode;
    }

    public void setOnlinemode(String onlinemode) {
        this.onlinemode = onlinemode == null ? null : onlinemode.trim();
    }

    public String getLogudiskop() {
        return logudiskop;
    }

    public void setLogudiskop(String logudiskop) {
        this.logudiskop = logudiskop == null ? null : logudiskop.trim();
    }

    public String getLognetop() {
        return lognetop;
    }

    public void setLognetop(String lognetop) {
        this.lognetop = lognetop == null ? null : lognetop.trim();
    }

    public String getLogprint() {
        return logprint;
    }

    public void setLogprint(String logprint) {
        this.logprint = logprint == null ? null : logprint.trim();
    }

    public String getUseblacklist() {
        return useblacklist;
    }

    public void setUseblacklist(String useblacklist) {
        this.useblacklist = useblacklist == null ? null : useblacklist.trim();
    }

    public String getClipboardcontroled() {
        return clipboardcontroled;
    }

    public void setClipboardcontroled(String clipboardcontroled) {
        this.clipboardcontroled = clipboardcontroled == null ? null : clipboardcontroled.trim();
    }

    public String getOlecontroled() {
        return olecontroled;
    }

    public void setOlecontroled(String olecontroled) {
        this.olecontroled = olecontroled == null ? null : olecontroled.trim();
    }

    public String getDragdropcontroled() {
        return dragdropcontroled;
    }

    public void setDragdropcontroled(String dragdropcontroled) {
        this.dragdropcontroled = dragdropcontroled == null ? null : dragdropcontroled.trim();
    }

    public String getSnapshotcontroled() {
        return snapshotcontroled;
    }

    public void setSnapshotcontroled(String snapshotcontroled) {
        this.snapshotcontroled = snapshotcontroled == null ? null : snapshotcontroled.trim();
    }

    public String getPrintcontroledex() {
        return printcontroledex;
    }

    public void setPrintcontroledex(String printcontroledex) {
        this.printcontroledex = printcontroledex == null ? null : printcontroledex.trim();
    }

    public String getNeedkey() {
        return needkey;
    }

    public void setNeedkey(String needkey) {
        this.needkey = needkey == null ? null : needkey.trim();
    }

    public Integer getValidatedays() {
        return validatedays;
    }

    public void setValidatedays(Integer validatedays) {
        this.validatedays = validatedays;
    }

    public String getPreviewspec() {
        return previewspec;
    }

    public void setPreviewspec(String previewspec) {
        this.previewspec = previewspec == null ? null : previewspec.trim();
    }

    public String getAutobackup() {
        return autobackup;
    }

    public void setAutobackup(String autobackup) {
        this.autobackup = autobackup == null ? null : autobackup.trim();
    }

    public String getBackupspec() {
        return backupspec;
    }

    public void setBackupspec(String backupspec) {
        this.backupspec = backupspec == null ? null : backupspec.trim();
    }

    public String getBackupdir() {
        return backupdir;
    }

    public void setBackupdir(String backupdir) {
        this.backupdir = backupdir == null ? null : backupdir.trim();
    }

    public String getBackupexcludespec() {
        return backupexcludespec;
    }

    public void setBackupexcludespec(String backupexcludespec) {
        this.backupexcludespec = backupexcludespec == null ? null : backupexcludespec.trim();
    }

    public Integer getBackupcount() {
        return backupcount;
    }

    public void setBackupcount(Integer backupcount) {
        this.backupcount = backupcount;
    }

    public String getOverlayicon() {
        return overlayicon;
    }

    public void setOverlayicon(String overlayicon) {
        this.overlayicon = overlayicon == null ? null : overlayicon.trim();
    }

    public String getSpoolsv() {
        return spoolsv;
    }

    public void setSpoolsv(String spoolsv) {
        this.spoolsv = spoolsv == null ? null : spoolsv.trim();
    }

    public String getEncryptionslot() {
        return encryptionslot;
    }

    public void setEncryptionslot(String encryptionslot) {
        this.encryptionslot = encryptionslot == null ? null : encryptionslot.trim();
    }

    public String getDecryptionslot() {
        return decryptionslot;
    }

    public void setDecryptionslot(String decryptionslot) {
        this.decryptionslot = decryptionslot == null ? null : decryptionslot.trim();
    }

    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark == null ? null : watermark.trim();
    }

    public String getCheckofflinedate() {
        return checkofflinedate;
    }

    public void setCheckofflinedate(String checkofflinedate) {
        this.checkofflinedate = checkofflinedate == null ? null : checkofflinedate.trim();
    }

    public Date getOfflinedate() {
        return offlinedate;
    }

    public void setOfflinedate(Date offlinedate) {
        this.offlinedate = offlinedate;
    }

    public String getFtp() {
        return ftp;
    }

    public void setFtp(String ftp) {
        this.ftp = ftp == null ? null : ftp.trim();
    }

    public String getFtpusername() {
        return ftpusername;
    }

    public void setFtpusername(String ftpusername) {
        this.ftpusername = ftpusername == null ? null : ftpusername.trim();
    }

    public String getFtppassword() {
        return ftppassword;
    }

    public void setFtppassword(String ftppassword) {
        this.ftppassword = ftppassword == null ? null : ftppassword.trim();
    }

    public String getUishowmanagericon() {
        return uishowmanagericon;
    }

    public void setUishowmanagericon(String uishowmanagericon) {
        this.uishowmanagericon = uishowmanagericon == null ? null : uishowmanagericon.trim();
    }

    public String getUishowexecutoricon() {
        return uishowexecutoricon;
    }

    public void setUishowexecutoricon(String uishowexecutoricon) {
        this.uishowexecutoricon = uishowexecutoricon == null ? null : uishowexecutoricon.trim();
    }

    public String getFtpbackup() {
        return ftpbackup;
    }

    public void setFtpbackup(String ftpbackup) {
        this.ftpbackup = ftpbackup == null ? null : ftpbackup.trim();
    }

    public String getFtpbackupusername() {
        return ftpbackupusername;
    }

    public void setFtpbackupusername(String ftpbackupusername) {
        this.ftpbackupusername = ftpbackupusername == null ? null : ftpbackupusername.trim();
    }

    public String getFtpbackuppassword() {
        return ftpbackuppassword;
    }

    public void setFtpbackuppassword(String ftpbackuppassword) {
        this.ftpbackuppassword = ftpbackuppassword == null ? null : ftpbackuppassword.trim();
    }

	public String getUsbcontrolmode() {
		return usbcontrolmode;
	}

	public void setUsbcontrolmode(String usbcontrolmode) {
		this.usbcontrolmode = usbcontrolmode;
	}
    
    
    
}