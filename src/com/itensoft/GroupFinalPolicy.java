package com.itensoft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import com.itensoft.Group;

public class GroupFinalPolicy {
	private String printControled;
	private short udiskMode;
	private Integer offlineTime;
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
	private String ftp;
	private String ftpUserName;
	private String ftpPassword;
	private String uishowManagerIcon;
	private String uishowExecutorIcon;
	

	public GroupFinalPolicy(Group group, Session session)
	{
	
		ArrayList<String> alPreviewSpec = new ArrayList<String>();
		ArrayList<String> alBackupSpec = new ArrayList<String>();
		Group g=group; ftp="";
		do {
			if ((g.getPolicy().getAutoBackup()!=null) && (g.getPolicy().getAutoBackup().equals("T"))){
				setAutoBackup("T");
			}
			if ((g.getPolicy().getPrintControled()!=null) && (g.getPolicy().getPrintControled().equals("T"))){
				setPrintControled("T");
			}
			if ((g.getPolicy().getClipboardControled()!=null)&&(g.getPolicy().getClipboardControled().equals("T"))){
				setClipboardControled("T");
			}
			if ((g.getPolicy().getDragdropControled()!=null)&&(g.getPolicy().getDragdropControled().equals("T"))){
				setDragdropControled("T");
			}
			if ((g.getPolicy().getFtp()!=null) && (!g.getPolicy().getFtp().equals("")) && (ftp.equals(""))){
				setFtp(g.getPolicy().getFtp());
				if (g.getPolicy().getFtpUserName()!=null){
					setFtpUserName(g.getPolicy().getFtpUserName());
				}
				if (g.getPolicy().getFtpPassword()!=null){
					setFtpPassword(g.getPolicy().getFtpPassword());
				}
			}
			if ((g.getPolicy().getLogNetOp()!=null)&&(g.getPolicy().getLogNetOp().equals("T"))){
				setLogNetOp("T");
			}
			if ((g.getPolicy().getLogPrint()!=null)&&(g.getPolicy().getLogPrint().equals("T"))){
				setLogPrint("T");
			}
			if ((g.getPolicy().getLogUdiskOp()!=null)&&(g.getPolicy().getLogUdiskOp().equals("T"))){
				setLogUdiskOp("T");
			}
			if ((g.getPolicy().getUseBlackList()!=null)&&(g.getPolicy().getUseBlackList().equals("T"))){
				setUseBlackList("T");
			}
			if ((g.getPolicy().getOlecontroled()!=null) && (g.getPolicy().getOlecontroled().equals("T"))){
				setOlecontroled("T");
			}
			if ((g.getPolicy().getSnapShotControled()!=null) && (g.getPolicy().getSnapShotControled().equals("T"))){
				setSnapShotControled("T");
			}
			if ((g.getPolicy().getNeedKey()!=null) && (g.getPolicy().getNeedKey().equals("T"))){
				setNeedKey("T");
			}
			if ((g.getPolicy().getOverlayIcon()!=null) && (g.getPolicy().getOverlayIcon().equals("T"))){
				setOverlayIcon("T");
			}
			if ((g.getPolicy().getUishowManagerIcon()!=null) && (g.getPolicy().getUishowManagerIcon().equals("T"))){
				setUishowManagerIcon("T");
			}
			if ((g.getPolicy().getUishowExecutorIcon()!=null) && (g.getPolicy().getUishowExecutorIcon().equals("T"))){
				setUishowExecutorIcon("T");
			}
			if ((g.getPolicy().getPreviewSpec()!=null) && (!g.getPolicy().getPreviewSpec().equals(""))){
				int index;  
				String str = g.getPolicy().getPreviewSpec();
			    
			    while ((index = str.indexOf(";")) != -1) {
			    	if (!alPreviewSpec.contains(str.substring(0, index))){
			    		alPreviewSpec.add(str.substring(0, index));  
			    	}
			      str = str.substring(index + 1);  
			    }  
		    	if (!alPreviewSpec.contains(str)){
		    		alPreviewSpec.add(str);
		    	}				
			}
			if ((g.getPolicy().getBackupSpec()!=null) && (!g.getPolicy().getBackupSpec().equals(""))){
				int index;  
				String str = g.getPolicy().getBackupSpec();
			    
			    while ((index = str.indexOf(";")) != -1) {
			    	if (!alBackupSpec.contains(str.substring(0, index))){
			    		alBackupSpec.add(str.substring(0, index));  
			    	}
			      str = str.substring(index + 1);  
			    }  
		    	if (!alBackupSpec.contains(str)){
		    		alBackupSpec.add(str);
		    	}
			}
			g = (Group)session.get(Group.class,g.getParentCode());
		} while ((g!=null) && (g.getInheritSet()!=null) && (g.getInheritSet().equals("T")) );
		
		backupSpec = "";
		for(Iterator<String> it = alBackupSpec.iterator();it.hasNext();)
		{
			if (!backupSpec.equals("")){
				backupSpec +=";";
			}
			backupSpec = backupSpec+it.next();			
		}		
		
		previewSpec = "";
		for(Iterator<String> it = alPreviewSpec.iterator();it.hasNext();)
		{
			if (!previewSpec.equals("")){
				previewSpec +=";";
			}
			previewSpec = previewSpec+it.next();
		}
	}
	
	public String getPrintControled() {
		return printControled;
	}
	public void setPrintControled(String printControled) {
		this.printControled = printControled;
	}
	public short getUdiskMode() {
		return udiskMode;
	}
	public void setUdiskMode(short udiskMode) {
		this.udiskMode = udiskMode;
	}
	public Integer getOfflineTime() {
		return offlineTime;
	}
	public void setOfflineTime(Integer offlineTime) {
		this.offlineTime = offlineTime;
	}
	public String getLogUdiskOp() {
		return logUdiskOp;
	}
	public void setLogUdiskOp(String logUdiskOp) {
		this.logUdiskOp = logUdiskOp;
	}
	public String getLogNetOp() {
		return logNetOp;
	}
	public void setLogNetOp(String logNetOp) {
		this.logNetOp = logNetOp;
	}
	public String getLogPrint() {
		return logPrint;
	}
	public void setLogPrint(String logPrint) {
		this.logPrint = logPrint;
	}
	public String getUseBlackList() {
		return useBlackList;
	}
	public void setUseBlackList(String useBlackList) {
		this.useBlackList = useBlackList;
	}
	public String getClipboardControled() {
		return clipboardControled;
	}
	public void setClipboardControled(String clipboardControled) {
		this.clipboardControled = clipboardControled;
	}
	public String getOlecontroled() {
		return olecontroled;
	}
	public void setOlecontroled(String olecontroled) {
		this.olecontroled = olecontroled;
	}
	public String getDragdropControled() {
		return dragdropControled;
	}
	public void setDragdropControled(String dragdropControled) {
		this.dragdropControled = dragdropControled;
	}
	public String getSnapShotControled() {
		return snapShotControled;
	}
	public void setSnapShotControled(String snapShotControled) {
		this.snapShotControled = snapShotControled;
	}
	public String getPrintControledEx() {
		return printControledEx;
	}
	public void setPrintControledEx(String printControledEx) {
		this.printControledEx = printControledEx;
	}
	public String getNeedKey() {
		return needKey;
	}
	public void setNeedKey(String needKey) {
		this.needKey = needKey;
	}
	public String getPreviewSpec() {
		return previewSpec;
	}
	public void setPreviewSpec(String previewSpec) {
		this.previewSpec = previewSpec;
	}
	public String getAutoBackup() {
		return autoBackup;
	}
	public void setAutoBackup(String autoBackup) {
		this.autoBackup = autoBackup;
	}
	public String getBackupSpec() {
		return backupSpec;
	}
	public void setBackupSpec(String backupSpec) {
		this.backupSpec = backupSpec;
	}
	public String getBackupDir() {
		return backupDir;
	}
	public void setBackupDir(String backupDir) {
		this.backupDir = backupDir;
	}
	public String getBackupExcludeSpec() {
		return backupExcludeSpec;
	}
	public void setBackupExcludeSpec(String backupExcludeSpec) {
		this.backupExcludeSpec = backupExcludeSpec;
	}
	public Integer getBackupCount() {
		return backupCount;
	}
	public void setBackupCount(Integer backupCount) {
		this.backupCount = backupCount;
	}
	public String getOverlayIcon() {
		return overlayIcon;
	}
	public void setOverlayIcon(String overlayIcon) {
		this.overlayIcon = overlayIcon;
	}
	public String getSpoolsv() {
		return spoolsv;
	}
	public void setSpoolsv(String spoolsv) {
		this.spoolsv = spoolsv;
	}
	public String getEncryptionSlot() {
		return encryptionSlot;
	}
	public void setEncryptionSlot(String encryptionSlot) {
		this.encryptionSlot = encryptionSlot;
	}
	public String getDecryptionSlot() {
		return decryptionSlot;
	}
	public void setDecryptionSlot(String decryptionSlot) {
		this.decryptionSlot = decryptionSlot;
	}
	public String getWatermark() {
		return watermark;
	}
	public void setWatermark(String watermark) {
		this.watermark = watermark;
	}
	public String getFtp() {
		return ftp;
	}
	public void setFtp(String ftp) {
		this.ftp = ftp;
	}
	public String getFtpUserName() {
		return ftpUserName;
	}
	public void setFtpUserName(String ftpUserName) {
		this.ftpUserName = ftpUserName;
	}
	public String getFtpPassword() {
		return ftpPassword;
	}
	public void setFtpPassword(String ftpPassword) {
		this.ftpPassword = ftpPassword;
	}
	public String getUishowManagerIcon() {
		return uishowManagerIcon;
	}
	public void setUishowManagerIcon(String uishowManagerIcon) {
		this.uishowManagerIcon = uishowManagerIcon;
	}
	public String getUishowExecutorIcon() {
		return uishowExecutorIcon;
	}
	public void setUishowExecutorIcon(String uishowExecutorIcon) {
		this.uishowExecutorIcon = uishowExecutorIcon;
	}

}
