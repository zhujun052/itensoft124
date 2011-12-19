package com.itensoft.model;

public class Group {
    private Integer code;

    private Integer parentcode;

    private String id;

    private String name;

    private Integer level;

    private String inheritset;

    private String inheritplainprogram;

    private String inheritblackprogram;

    private String inheritrcv;

    private String inheritidentity;

    private String inheritvirtualmanager;

    private Integer policycode;

    private String hostname;

    private String username;

    private String audited;

    private Integer refreshid;

    private String hardid;

    private String actived;
    
    private int childnums;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getParentcode() {
        return parentcode;
    }

    public void setParentcode(Integer parentcode) {
        this.parentcode = parentcode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getInheritset() {
        return inheritset;
    }

    public void setInheritset(String inheritset) {
        this.inheritset = inheritset == null ? null : inheritset.trim();
    }

    public String getInheritplainprogram() {
        return inheritplainprogram;
    }

    public void setInheritplainprogram(String inheritplainprogram) {
        this.inheritplainprogram = inheritplainprogram == null ? null : inheritplainprogram.trim();
    }

    public String getInheritblackprogram() {
        return inheritblackprogram;
    }

    public void setInheritblackprogram(String inheritblackprogram) {
        this.inheritblackprogram = inheritblackprogram == null ? null : inheritblackprogram.trim();
    }

    public String getInheritrcv() {
        return inheritrcv;
    }

    public void setInheritrcv(String inheritrcv) {
        this.inheritrcv = inheritrcv == null ? null : inheritrcv.trim();
    }

    public String getInheritidentity() {
        return inheritidentity;
    }

    public void setInheritidentity(String inheritidentity) {
        this.inheritidentity = inheritidentity == null ? null : inheritidentity.trim();
    }

    public String getInheritvirtualmanager() {
        return inheritvirtualmanager;
    }

    public void setInheritvirtualmanager(String inheritvirtualmanager) {
        this.inheritvirtualmanager = inheritvirtualmanager == null ? null : inheritvirtualmanager.trim();
    }

    public Integer getPolicycode() {
        return policycode;
    }

    public void setPolicycode(Integer policycode) {
        this.policycode = policycode;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname == null ? null : hostname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAudited() {
        return audited;
    }

    public void setAudited(String audited) {
        this.audited = audited == null ? null : audited.trim();
    }

    public Integer getRefreshid() {
        return refreshid;
    }

    public void setRefreshid(Integer refreshid) {
        this.refreshid = refreshid;
    }

    public String getHardid() {
        return hardid;
    }

    public void setHardid(String hardid) {
        this.hardid = hardid == null ? null : hardid.trim();
    }

    public String getActived() {
        return actived;
    }

    public void setActived(String actived) {
        this.actived = actived == null ? null : actived.trim();
    }

	public int getChildnums() {
		return childnums;
	}

	public void setChildnums(int childnums) {
		this.childnums = childnums;
	}


    
    
}