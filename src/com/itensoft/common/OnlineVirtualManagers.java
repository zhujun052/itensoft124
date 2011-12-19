package com.itensoft.common;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OnlineVirtualManagers {
	private String managerName;

	private Map<String, OnlineVirtualManager> managers = new HashMap<String, OnlineVirtualManager>();

	private OnlineDocers docers;

	public void setOnlineDocers(OnlineDocers docers) {
		this.docers = docers;
	}

	public OnlineDocers getDocers() {
		return this.docers;
	}

	public String getManagerName() {
		return this.managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public Map<String, OnlineVirtualManager> getManagers() {
		return this.managers;
	}

	public boolean onLine() {
		// 为空集
		if (managers.isEmpty())
			return false;

		// 如果不为空，则要判断里面是否有管理员在线

		Collection<OnlineVirtualManager> collection = managers.values();

		for (Iterator<OnlineVirtualManager> it = collection.iterator(); it
				.hasNext();) {
			boolean result = it.next().onLine();
			if (result)
				return true;
		}
		
		return false;

	}
}
