package com.itensoft.model;

public class VirtualmanagerdocerKey {
    private String vitrualmanagername;

    private String docer;

    public String getVitrualmanagername() {
        return vitrualmanagername;
    }

    public void setVitrualmanagername(String vitrualmanagername) {
        this.vitrualmanagername = vitrualmanagername == null ? null : vitrualmanagername.trim();
    }

    public String getDocer() {
        return docer;
    }

    public void setDocer(String docer) {
        this.docer = docer == null ? null : docer.trim();
    }
}