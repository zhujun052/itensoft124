package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.itensoft.common.ItensoftEnv;
import com.itensoft.common.OnlineDocer;
import com.itensoft.common.OnlineDocers;
import com.itensoft.common.OnlineVirtualManager;
import com.itensoft.common.OnlineVirtualManagers;
import com.itensoft.common.UTF8String;

public class ManagerGetDocerInfo extends HttpServlet
{

	/**
	 * Constructor of the object.
	 */
	public ManagerGetDocerInfo()
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

	private String getDocers(String userName)
	{
		String r = "";
		// List<String> mgrNames = new ArrayList<String>();
		// 取得用户所在的管理组名称
		for (Iterator<OnlineVirtualManagers> it = ItensoftEnv
				.getOnlineManagers().values().iterator(); it.hasNext();)
		{
			OnlineVirtualManagers mgrs = it.next();

			// 看用户在哪个管理组
			if (mgrs.getManagers().containsKey(userName))
			{
				// 取得用户所在管理组的解密员
				OnlineDocers docers = mgrs.getDocers();
				Document doc = DocumentHelper.createDocument();
				doc.setXMLEncoding("utf-8");
				Element root = doc.addElement("Docers");
				for (Iterator<OnlineDocer> docerit = docers.getDocers().values()
						.iterator(); docerit.hasNext();)
				{
					OnlineDocer docer = docerit.next();
					Element docerNode = root.addElement("Docer");
					docerNode.addElement("Name").setText(docer.GetDocerName());
					docerNode.addElement("Status").setText(docer.Online()? "0":"2");					
				}
				
				r = doc.asXML();
			}
		}

		return r;
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("UserName");
		if(userName != null)
			userName = UTF8String.toString(userName);

		if ("".equals(userName))
		{
			out.print("ERROR");
			out.flush();
			out.close();
			return;
		}
		userName=UTF8String.toString(userName);
		out.print(getDocers(userName));

		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
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
