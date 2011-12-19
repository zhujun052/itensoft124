package com.itensoft.common;

import java.util.Iterator;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineUserListener implements HttpSessionListener
{

	public void sessionCreated(HttpSessionEvent event)
	{
		// session建立时不用做什么
	}

	public void sessionDestroyed(HttpSessionEvent event)
	{
		HttpSession session = event.getSession();
		ServletContext application = session.getServletContext();

		String identity = (String) session.getAttribute("identity");

		// /客户登录
		if ("client" == identity)
		{

			String username = (String) session.getAttribute("clientid");

			@SuppressWarnings("unchecked")
			// List<String> onlineUserList = (List<String>)
			// application.getAttribute("onlineuserlist");
			Map<String, Object> onlineUserList = (Map<String, Object>) application
					.getAttribute("onlineuserlist");
			if (onlineUserList != null)
			{
				if (username != null)
				{
					onlineUserList.remove(username);
					// System.out.println(username + " login out!");
				}
			}
		}
		// 管理登录
		if ("manager" == identity)
		{
			// TODO 加人ManagerLog消息

			String userName = (String) session.getAttribute("managerName");
			if ((userName != null) | (userName != ""))
				// 取得用户后，把所有与该用户相关的VirtualManager Poweroff
				for (Iterator<OnlineVirtualManagers> it = ItensoftEnv
						.getOnlineManagers().values().iterator(); it.hasNext();)
				{
					OnlineVirtualManagers mgrs = it.next();

					if (mgrs.getManagers().containsKey(userName))
					{
						OnlineVirtualManager vm = mgrs.getManagers().get(
								userName);
						vm.setIp("");
						vm.setPort("");
						vm.powerOff();
					}

				}

		}

		// 解密员登录
		if ("docer" == identity)
		{
			String userName = (String) session.getAttribute("docerName");
			if (!((userName == null) | ("".equals(userName))))
			{
				for (Iterator<OnlineVirtualManagers> it = ItensoftEnv
						.getOnlineManagers().values().iterator(); it.hasNext();) {
					OnlineVirtualManagers mgrs = it.next();

					OnlineDocers docers = mgrs.getDocers();
					OnlineDocer docer = docers.getDocers().get(userName);
					if(!(docer == null))
						docer.PowerOff();

				}				
			}

		}
		//

	}

}
