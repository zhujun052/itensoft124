package com.itensoft.common;

public class OnlineDocer
{
	private String docerName;

	private boolean online = false;

	public String GetDocerName()
	{
		return this.docerName;
	}

	public void SetDocerName(String value)
	{
		this.docerName = value;
	}

	public void PowerOn()
	{
		online = true;
	}

	public void PowerOff()
	{
		online = false;
	}

	public boolean Online()
	{
		return this.online;
	}
}
