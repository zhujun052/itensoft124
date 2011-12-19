package com.itensoft.model;

public class Scanplan {
    private String name;

    private String include;

    private String exclude;

    private String ignoresys;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include == null ? null : include.trim();
    }

    public String getExclude() {
        return exclude;
    }

    public void setExclude(String exclude) {
        this.exclude = exclude == null ? null : exclude.trim();
    }

    public String getIgnoresys() {
        return ignoresys;
    }

    public void setIgnoresys(String ignoresys) {
        this.ignoresys = ignoresys == null ? null : ignoresys.trim();
    }
}