package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itensoft.common.ItensoftEnv;
import com.itensoft.common.OnlineDocer;
import com.itensoft.common.OnlineDocers;
import com.itensoft.common.OnlineVirtualManager;
import com.itensoft.common.OnlineVirtualManagers;
import com.itensoft.common.UTF8String;

public class DocerLogout extends HttpServlet
{

	/**
	 * Constructor of the object.
	 */
	public DocerLogout()
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

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("UserName");
		if(userName != null)
			userName = UTF8String.toString(userName);
		
		if((userName != null) | (!"".equals(userName)))
		{
			userName = UTF8String.toString(userName);
			for (Iterator<OnlineVirtualManagers> it = ItensoftEnv
					.getOnlineManagers().values().iterator(); it.hasNext();) {
				OnlineVirtualManagers mgrs = it.next();

				OnlineDocers docers = mgrs.getDocers();
				OnlineDocer docer = docers.getDocers().get(userName);
				if(!(docer == null))
					docer.PowerOff();

			}
	
		}

		request.getSession().removeAttribute("docerName");
		request.getSession().invalidate();
		
		out.flush();
		out.close();
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException
	{
		// Put your code here
	}

}
