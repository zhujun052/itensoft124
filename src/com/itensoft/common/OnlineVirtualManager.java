package com.itensoft.common;

import com.itensoft.User;

public class OnlineVirtualManager {
	private String user;
	private int priotity;
	private String ip;
	private String port;
	private boolean on = false;
	
	public boolean onLine()
	{
		return on;
	}
	
	public void powerOn()
	{
		on = true;
	}
	
	public void powerOff()
	{
		on = false;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	public int getPriority(){
		return this.priotity;
	}
	
	public void SetPriority(int iValue){
		this.priotity = iValue;
	}
}
