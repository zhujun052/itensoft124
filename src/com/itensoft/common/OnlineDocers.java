package com.itensoft.common;

import java.util.HashMap;
import java.util.Map;

public class OnlineDocers
{
	private OnlineVirtualManagers manager;

	private Map<String, OnlineDocer> docers = new HashMap<String, OnlineDocer>();

	public Map<String, OnlineDocer> getDocers()
	{
		return this.docers;
	}

	public void SetManager(OnlineVirtualManagers manager)
	{
		this.manager = manager;
	}

	public OnlineVirtualManagers GetManager()
	{
		return this.manager;
	}
}
