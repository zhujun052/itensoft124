package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.itensoft.ItensoftSession;
import com.itensoft.User;
import com.itensoft.common.ItensoftEnv;
import com.itensoft.common.OnlineDocers;
import com.itensoft.common.OnlineVirtualManager;
import com.itensoft.common.OnlineVirtualManagers;
import com.itensoft.common.UTF8String;

public class ManagerLogon extends HttpServlet
{

	/**
	 * Constructor of the object.
	 */
	public ManagerLogon()
	{
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy()
	{
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("UserName");
		if(!"".equals(userName))
			userName = UTF8String.toString(userName);
			//userName = new String(userName.getBytes("ISO-8859-1"),"GB2312");
		String passWord = request.getParameter("Password");
		String ip = request.getParameter("Ip");
		String port = request.getParameter("Port");

		Session s = ItensoftSession.getSession();
		try
		{

			User user = (User) s.get(User.class, userName);
			// 用户不存在
			if (user == null)
				out.print(1);
			else
			{
				if (user.getPassword() == null)
					user.setPassword("");
				// 密码不对
				if (!passWord.equals(user.getPassword().trim()))
					out.print(3);
				else
				{
					// 密码对，看权限
					String hsql = "select b.Name,b.LogonManage,b.LogonDocer from RoleUser a "
							+ "join Role b on a.RoleName=b.Name where a.UserName='"
							+ userName + "'";
					List list = s.createSQLQuery(hsql).list();

					// 检查权限，该用户有manager权限，就登录
					boolean hasRight = false;
					
					for (Iterator<Object[]> it = list.iterator(); it.hasNext();)
					{
						Object[] objs = it.next();
						System.out.println(objs[0]);
						System.out.println(objs[1]);
						hasRight = "T".equals(objs[1].toString());
						if (hasRight)
							break;
					}
					// 无权登录
					if (!hasRight)
						out.print(2);
					else
					{
						// 登录许可，加入身份识别
						request.getSession()
								.setAttribute("identity", "manager");

						// 在session中加人用户名，用于非正常退出是销户
						request.getSession().setAttribute("managerName",
								userName);

						// 检查VirtualManager列表，把登录管理员的状态Poweron
						for (Iterator<OnlineVirtualManagers> it = ItensoftEnv
								.getOnlineManagers().values().iterator(); it
								.hasNext();)
						{
							OnlineVirtualManagers mgrs = it.next();
							
							if (mgrs.getManagers().containsKey(userName))
							{
								OnlineVirtualManager vm = mgrs.getManagers()
										.get(userName);
								vm.setIp(ip);
								vm.setPort(port);
								vm.powerOn();
							}

						}
						out.print("OK");
					}

				}
			}

		} catch (Exception e)
		{
			e.printStackTrace();
			out.print("ERROR");
		}
		out.flush();
		out.close();
	}
	


	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException
	{
		// Put your code here
	}

}
