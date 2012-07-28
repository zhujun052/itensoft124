package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itensoft.common.ItensoftEnv;
import com.itensoft.common.OnlineVirtualManager;
import com.itensoft.common.OnlineVirtualManagers;
import com.itensoft.common.UTF8String;

public class ManagerLogout extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ManagerLogout() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		// 正常退出的情况
		String userName = request.getParameter("UserName");
		if(!"".equals(userName))
			userName = UTF8String.toString(userName);

		if ((userName != null) | (userName != ""))
			// 取得用户后，把所有与该用户相关的VirtualManager Poweroff
			for (Iterator<OnlineVirtualManagers> it = ItensoftEnv
					.getOnlineManagers().values().iterator(); it.hasNext();) {
				OnlineVirtualManagers mgrs = it.next();

				if (mgrs.getManagers().containsKey(userName)) {
					OnlineVirtualManager vm = mgrs.getManagers().get(userName);
					vm.setIp("");
					vm.setPort("");
					vm.powerOff();
				}

			}

		/**
		 * 这里把session中的managerName移除，session失效时因为找不到managerName，不处理退出时的销户操作
		 * 主要目的是用于区分正常退出跟长时间离线退出
		 */

		request.getSession().removeAttribute("managerName");

		request.getSession().invalidate();

		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
