package com.itensoft.model;

public class Blackprogram {
    private Integer code;

    private Integer parentcode;

    private String name;

    private String exename;

    private String wndclassname;

    private String caption;

    private String originalfilename;

    private String actived;

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

    public String getOriginalfilename() {
        return originalfilename;
    }

    public void setOriginalfilename(String originalfilename) {
        this.originalfilename = originalfilename == null ? null : originalfilename.trim();
    }

    public String getActived() {
        return actived;
    }

    public void setActived(String actived) {
        this.actived = actived == null ? null : actived.trim();
    }
}