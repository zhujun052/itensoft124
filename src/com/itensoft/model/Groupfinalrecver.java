package com.itensoft.model;

public class Groupfinalrecver extends GroupfinalrecverKey {
    private String readonly;

    private Integer printcount;

    public String getReadonly() {
        return readonly;
    }

    public void setReadonly(String readonly) {
        this.readonly = readonly == null ? null : readonly.trim();
    }

    public Integer getPrintcount() {
        return printcount;
    }

    public void setPrintcount(Integer printcount) {
        this.printcount = printcount;
    }
}