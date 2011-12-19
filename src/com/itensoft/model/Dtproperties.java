package com.itensoft.model;

public class Dtproperties extends DtpropertiesKey {
    private Integer objectid;

    private String value;

    private String uvalue;

    private Integer version;

    private byte[] lvalue;

    public Integer getObjectid() {
        return objectid;
    }

    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getUvalue() {
        return uvalue;
    }

    public void setUvalue(String uvalue) {
        this.uvalue = uvalue == null ? null : uvalue.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public byte[] getLvalue() {
        return lvalue;
    }

    public void setLvalue(byte[] lvalue) {
        this.lvalue = lvalue;
    }
}