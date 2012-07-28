package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.itensoft.ItensoftSession;
import com.itensoft.Role;
import com.itensoft.User;
import com.itensoft.common.ItensoftEnv;
import com.itensoft.common.MD5Password;
import com.itensoft.common.OnlineDocer;
import com.itensoft.common.OnlineDocers;
import com.itensoft.common.OnlineVirtualManagers;
import com.itensoft.common.UTF8String;

public class DocerLogon extends HttpServlet
{

	/**
	 * Constructor of the object.
	 */
	public DocerLogon()
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
		if (userName != null){
			userName = UTF8String.toString(userName);
		}
		String passWord = request.getParameter("Password");

		String r = doLogon(userName, passWord);
		if ("OK".equals(r))
		{
			// 登录许可，加入身份识别
			request.getSession().setAttribute("identity", "docer");
			// 在session中加人用户名，用于非正常退出是销户
			request.getSession().setAttribute("docerName", userName);
		}
		out.print(r);
		out.flush();
		out.close();
	}

	private String doLogon(String userName, String passWord)
	{
		Session s = ItensoftSession.getSession();

		try
		{
			String pass = passWord;//MD5Password.getMD5Password(passWord);
			String r = "";
			User u = (User) s.get(User.class, userName);
			if (u == null)
				r = "1";
			else if (!u.getPassword().equals(pass))
				r = "3";
			else
			{
				String hsql = "select Name, LogonDocer from [Role] r join RoleUser u "
						+"on u.RoleName=r.Name where u.UserName=?";
				SQLQuery query = s.createSQLQuery(hsql);
				query.setString(0, userName);

				List<Object[]> list = query.list();
				boolean LogonDocer = false;

				for (Iterator<Object[]> it = list.iterator(); it.hasNext();)
				{
					Object[] role= it.next();
					LogonDocer = "T".equals(role[1].toString());
					if (LogonDocer)
						break;
				}

				if (!LogonDocer)
					r = "2";
				else
				{
					setDocerPoweron(userName);
					r = "OK";
				}
			}
			ItensoftSession.closeSession();
			return r;

		} catch (Exception ex)
		{
			ex.printStackTrace();
			ItensoftSession.closeSession();
			return ex.getMessage();
		}

	}

	private void setDocerPoweron(String userName)
	{
		for (Iterator<OnlineVirtualManagers> itmgrs = ItensoftEnv
				.getOnlineManagers().values().iterator(); itmgrs.hasNext();)
		{
			OnlineVirtualManagers mgrs = itmgrs.next();

			OnlineDocers docers = mgrs.getDocers();
			OnlineDocer docer =	docers.getDocers().get(userName);
			if(!(docer==null))
				docer.PowerOn();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
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
