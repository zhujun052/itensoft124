package com.itensoft;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Policy entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "Policy", schema = "dbo", catalog = "phoenix")
public class Policy implements java.io.Serializable {

	// Fields

	private Integer code;
	private String printControled;
	private short udiskMode;
	private Integer offlineTime;
	private String onLineMode;
	private String logUdiskOp;
	private String logNetOp;
	private String logPrint;
	private String useBlackList;
	private String clipboardControled;
	private String olecontroled;
	private String dragdropControled;
	private String snapShotControled;
	private String printControledEx;
	private String needKey;
	private Integer validateDays;
	private String previewSpec;
	private String autoBackup;
	private String backupSpec;
	private String backupDir;
	private String backupExcludeSpec;
	private Integer backupCount;
	private String overlayIcon;
	private String spoolsv;
	private String encryptionSlot;
	private String decryptionSlot;
	private String watermark;
	private String checkOfflineDate;
	private Date offlineDate;
	private String ftp;
	private String ftpUserName;
	private String ftpPassword;
	private String uishowManagerIcon;
	private String uishowExecutorIcon;

	// Constructors

	/** default constructor */
	public Policy() {
	}

	/** minimal constructor */
	public Policy(Integer code) {
		this.code = code;
	}

	/** full constructor */
	public Policy(Integer code, String printControled, short udiskMode,
			Integer offlineTime, String onLineMode, String logUdiskOp,
			String logNetOp, String logPrint, String useBlackList,
			String clipboardControled, String olecontroled,
			String dragdropControled, String snapShotControled,
			String printControledEx, String needKey, Integer validateDays,
			String previewSpec, String autoBackup, String backupSpec,
			String backupDir, String backupExcludeSpec, Integer backupCount,
			String overlayIcon, String spoolsv, String encryptionSlot,
			String decryptionSlot, String watermark, String checkOfflineDate,
			Date offlineDate, String ftp, String ftpUserName,
			String ftpPassword, String uishowManagerIcon,
			String uishowExecutorIcon) {
		this.code = code;
		this.printControled = printControled;
		this.udiskMode = udiskMode;
		this.offlineTime = offlineTime;
		this.onLineMode = onLineMode;
		this.logUdiskOp = logUdiskOp;
		this.logNetOp = logNetOp;
		this.logPrint = logPrint;
		this.useBlackList = useBlackList;
		this.clipboardControled = clipboardControled;
		this.olecontroled = olecontroled;
		this.dragdropControled = dragdropControled;
		this.snapShotControled = snapShotControled;
		this.printControledEx = printControledEx;
		this.needKey = needKey;
		this.validateDays = validateDays;
		this.previewSpec = previewSpec;
		this.autoBackup = autoBackup;
		this.backupSpec = backupSpec;
		this.backupDir = backupDir;
		this.backupExcludeSpec = backupExcludeSpec;
		this.backupCount = backupCount;
		this.overlayIcon = overlayIcon;
		this.spoolsv = spoolsv;
		this.encryptionSlot = encryptionSlot;
		this.decryptionSlot = decryptionSlot;
		this.watermark = watermark;
		this.checkOfflineDate = checkOfflineDate;
		this.offlineDate = offlineDate;
		this.ftp = ftp;
		this.ftpUserName = ftpUserName;
		this.ftpPassword = ftpPassword;
		this.uishowManagerIcon = uishowManagerIcon;
		this.uishowExecutorIcon = uishowExecutorIcon;
	}

	// Property accessors
	@Id
	@Column(name = "Code", unique = true, nullable = false)
	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	@Column(name = "PrintControled", length = 1)
	public String getPrintControled() {
		return this.printControled;
	}

	public void setPrintControled(String printControled) {
		this.printControled = printControled;
	}

	@Column(name = "UDiskMode")
	public short getUdiskMode() {
		return this.udiskMode;
	}

	public void setUdiskMode(short udiskMode) {
		this.udiskMode = udiskMode;
	}

	@Column(name = "OfflineTime")
	public Integer getOfflineTime() {
		return this.offlineTime;
	}

	public void setOfflineTime(Integer offlineTime) {
		this.offlineTime = offlineTime;
	}

	@Column(name = "OnLineMode", length = 1)
	public String getOnLineMode() {
		return this.onLineMode;
	}

	public void setOnLineMode(String onLineMode) {
		this.onLineMode = onLineMode;
	}

	@Column(name = "LogUDiskOp", length = 1)
	public String getLogUdiskOp() {
		return this.logUdiskOp;
	}

	public void setLogUdiskOp(String logUdiskOp) {
		this.logUdiskOp = logUdiskOp;
	}

	@Column(name = "LogNetOp", length = 1)
	public String getLogNetOp() {
		return this.logNetOp;
	}

	public void setLogNetOp(String logNetOp) {
		this.logNetOp = logNetOp;
	}

	@Column(name = "LogPrint", length = 1)
	public String getLogPrint() {
		return this.logPrint;
	}

	public void setLogPrint(String logPrint) {
		this.logPrint = logPrint;
	}

	@Column(name = "UseBlackList", length = 1)
	public String getUseBlackList() {
		return this.useBlackList;
	}

	public void setUseBlackList(String useBlackList) {
		this.useBlackList = useBlackList;
	}

	@Column(name = "ClipboardControled", length = 1)
	public String getClipboardControled() {
		return this.clipboardControled;
	}

	public void setClipboardControled(String clipboardControled) {
		this.clipboardControled = clipboardControled;
	}

	@Column(name = "OLEControled", length = 1)
	public String getOlecontroled() {
		return this.olecontroled;
	}

	public void setOlecontroled(String olecontroled) {
		this.olecontroled = olecontroled;
	}

	@Column(name = "DragdropControled", length = 1)
	public String getDragdropControled() {
		return this.dragdropControled;
	}

	public void setDragdropControled(String dragdropControled) {
		this.dragdropControled = dragdropControled;
	}

	@Column(name = "SnapShotControled", length = 1)
	public String getSnapShotControled() {
		return this.snapShotControled;
	}

	public void setSnapShotControled(String snapShotControled) {
		this.snapShotControled = snapShotControled;
	}

	@Column(name = "PrintControledEx", length = 1)
	public String getPrintControledEx() {
		return this.printControledEx;
	}

	public void setPrintControledEx(String printControledEx) {
		this.printControledEx = printControledEx;
	}

	@Column(name = "NeedKey", length = 1)
	public String getNeedKey() {
		return this.needKey;
	}

	public void setNeedKey(String needKey) {
		this.needKey = needKey;
	}

	@Column(name = "ValidateDays")
	public Integer getValidateDays() {
		return this.validateDays;
	}

	public void setValidateDays(Integer validateDays) {
		this.validateDays = validateDays;
	}

	@Column(name = "PreviewSpec", length = 100)
	public String getPreviewSpec() {
		return this.previewSpec;
	}

	public void setPreviewSpec(String previewSpec) {
		this.previewSpec = previewSpec;
	}

	@Column(name = "AutoBackup", length = 1)
	public String getAutoBackup() {
		return this.autoBackup;
	}

	public void setAutoBackup(String autoBackup) {
		this.autoBackup = autoBackup;
	}

	@Column(name = "BackupSpec", length = 260)
	public String getBackupSpec() {
		return this.backupSpec;
	}

	public void setBackupSpec(String backupSpec) {
		this.backupSpec = backupSpec;
	}

	@Column(name = "BackupDir", length = 260)
	public String getBackupDir() {
		return this.backupDir;
	}

	public void setBackupDir(String backupDir) {
		this.backupDir = backupDir;
	}

	@Column(name = "BackupExcludeSpec", length = 260)
	public String getBackupExcludeSpec() {
		return this.backupExcludeSpec;
	}

	public void setBackupExcludeSpec(String backupExcludeSpec) {
		this.backupExcludeSpec = backupExcludeSpec;
	}

	@Column(name = "BackupCount")
	public Integer getBackupCount() {
		return this.backupCount;
	}

	public void setBackupCount(Integer backupCount) {
		this.backupCount = backupCount;
	}

	@Column(name = "OverlayIcon", length = 1)
	public String getOverlayIcon() {
		return this.overlayIcon;
	}

	public void setOverlayIcon(String overlayIcon) {
		this.overlayIcon = overlayIcon;
	}

	@Column(name = "Spoolsv", length = 1)
	public String getSpoolsv() {
		return this.spoolsv;
	}

	public void setSpoolsv(String spoolsv) {
		this.spoolsv = spoolsv;
	}

	@Column(name = "EncryptionSlot", length = 260)
	public String getEncryptionSlot() {
		return this.encryptionSlot;
	}

	public void setEncryptionSlot(String encryptionSlot) {
		this.encryptionSlot = encryptionSlot;
	}

	@Column(name = "DecryptionSlot", length = 260)
	public String getDecryptionSlot() {
		return this.decryptionSlot;
	}

	public void setDecryptionSlot(String decryptionSlot) {
		this.decryptionSlot = decryptionSlot;
	}

	@Column(name = "Watermark", length = 260)
	public String getWatermark() {
		return this.watermark;
	}

	public void setWatermark(String watermark) {
		this.watermark = watermark;
	}

	@Column(name = "CheckOfflineDate", length = 1)
	public String getCheckOfflineDate() {
		return this.checkOfflineDate;
	}

	public void setCheckOfflineDate(String checkOfflineDate) {
		this.checkOfflineDate = checkOfflineDate;
	}

	@Column(name = "OfflineDate", length = 23)
	public Date getOfflineDate() {
		return this.offlineDate;
	}

	public void setOfflineDate(Date offlineDate) {
		this.offlineDate = offlineDate;
	}

	@Column(name = "Ftp", length = 50)
	public String getFtp() {
		return this.ftp;
	}

	public void setFtp(String ftp) {
		this.ftp = ftp;
	}

	@Column(name = "FtpUserName", length = 50)
	public String getFtpUserName() {
		return this.ftpUserName;
	}

	public void setFtpUserName(String ftpUserName) {
		this.ftpUserName = ftpUserName;
	}

	@Column(name = "FtpPassword", length = 50)
	public String getFtpPassword() {
		return this.ftpPassword;
	}

	public void setFtpPassword(String ftpPassword) {
		this.ftpPassword = ftpPassword;
	}

	@Column(name = "UIShowManagerIcon", length = 1)
	public String getUishowManagerIcon() {
		return this.uishowManagerIcon;
	}

	public void setUishowManagerIcon(String uishowManagerIcon) {
		this.uishowManagerIcon = uishowManagerIcon;
	}

	@Column(name = "UIShowExecutorIcon", length = 1)
	public String getUishowExecutorIcon() {
		return this.uishowExecutorIcon;
	}

	public void setUishowExecutorIcon(String uishowExecutorIcon) {
		this.uishowExecutorIcon = uishowExecutorIcon;
	}

}