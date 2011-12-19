package com.itensoft.model;

public class Malmodule {
    private String filename;

    private String originalfilename;

    private String md5;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getOriginalfilename() {
        return originalfilename;
    }

    public void setOriginalfilename(String originalfilename) {
        this.originalfilename = originalfilename == null ? null : originalfilename.trim();
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5 == null ? null : md5.trim();
    }
}