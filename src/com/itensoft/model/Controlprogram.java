package com.itensoft.model;

public class Controlprogram {
    private Integer code;

    private Integer parentcode;

    private String name;

    private String exename;

    private String wndclassname;

    private String caption;

    private String excludefile;

    private String needinject;

    private String md5;

    private String originalfilename;

    private String companyname;

    private String includefile;

    private String closewrite;

    private String actived;

    private Integer restrictedformcount;

    private String signsubject;

    private String signissuer;

    private Integer licenseclass;

    private String map;

    private String subprocessinherited;

    private String createbysvchost;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getExename() {
        return exename;
    }

    public void setExename(String exename) {
        this.exename = exename == null ? null : exename.trim();
    }

    public String getWndclassname() {
        return wndclassname;
    }

    public void setWndclassname(String wndclassname) {
        this.wndclassname = wndclassname == null ? null : wndclassname.trim();
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption == null ? null : caption.trim();
    }

    public String getExcludefile() {
        return excludefile;
    }

    public void setExcludefile(String excludefile) {
        this.excludefile = excludefile == null ? null : excludefile.trim();
    }

    public String getNeedinject() {
        return needinject;
    }

    public void setNeedinject(String needinject) {
        this.needinject = needinject == null ? null : needinject.trim();
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5 == null ? null : md5.trim();
    }

    public String getOriginalfilename() {
        return originalfilename;
    }

    public void setOriginalfilename(String originalfilename) {
        this.originalfilename = originalfilename == null ? null : originalfilename.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getIncludefile() {
        return includefile;
    }

    public void setIncludefile(String includefile) {
        this.includefile = includefile == null ? null : includefile.trim();
    }

    public String getClosewrite() {
        return closewrite;
    }

    public void setClosewrite(String closewrite) {
        this.closewrite = closewrite == null ? null : closewrite.trim();
    }

    public String getActived() {
        return actived;
    }

    public void setActived(String actived) {
        this.actived = actived == null ? null : actived.trim();
    }

    public Integer getRestrictedformcount() {
        return restrictedformcount;
    }

    public void setRestrictedformcount(Integer restrictedformcount) {
        this.restrictedformcount = restrictedformcount;
    }

    public String getSignsubject() {
        return signsubject;
    }

    public void setSignsubject(String signsubject) {
        this.signsubject = signsubject == null ? null : signsubject.trim();
    }

    public String getSignissuer() {
        return signissuer;
    }

    public void setSignissuer(String signissuer) {
        this.signissuer = signissuer == null ? null : signissuer.trim();
    }

    public Integer getLicenseclass() {
        return licenseclass;
    }

    public void setLicenseclass(Integer licenseclass) {
        this.licenseclass = licenseclass;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map == null ? null : map.trim();
    }

    public String getSubprocessinherited() {
        return subprocessinherited;
    }

    public void setSubprocessinherited(String subprocessinherited) {
        this.subprocessinherited = subprocessinherited == null ? null : subprocessinherited.trim();
    }

    public String getCreatebysvchost() {
        return createbysvchost;
    }

    public void setCreatebysvchost(String createbysvchost) {
        this.createbysvchost = createbysvchost == null ? null : createbysvchost.trim();
    }
}