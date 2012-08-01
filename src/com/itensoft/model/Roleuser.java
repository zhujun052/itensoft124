package com.itensoft.model;

public class Roleuser {
    private String rolename;

    private String username;
    
    private String note;

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
    
    
}