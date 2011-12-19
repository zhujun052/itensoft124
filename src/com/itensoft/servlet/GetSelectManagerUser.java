package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.itensoft.ItensoftSession;
import com.itensoft.VirtualManager;
import com.itensoft.common.UTF8String;

public class GetSelectManagerUser extends HttpServlet
{
	/**
	 * Constructor of the object.
	 */
	public GetSelectManagerUser()
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

	public String jsonString(String json, String userName, Integer priority)
	{
		String r = json;
		String temp = "";
		if (userName == null)
			return json;
		
		if("".equals(userName))
			return json;
		
		

		temp = "{name:'" + userName + "',priority:'"  + (priority == null ? "0" : priority.toString()) + "'}";
		if (r == "")
			r = temp;
		else
			r += "," + temp;

		return r;
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
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String vmName = request.getParameter("vm");

		if (("".equals(vmName)) | (vmName == null))
			out.print("");
		else
		{
			Session s = ItensoftSession.getSession();
			VirtualManager vm = (VirtualManager) s.get(VirtualManager.class,
					vmName);
			if (vm == null)
				out.print("");
			else
			{
				String json = "";
				json = jsonString(json, vm.getUser1(), vm.getPriority1());
				json = jsonString(json, vm.getUser2(), vm.getPriority2());
				json = jsonString(json, vm.getUser3(), vm.getPriority3());
				json = jsonString(json, vm.getUser4(), vm.getPriority4());
				json = jsonString(json, vm.getUser5(), vm.getPriority5());
				json = jsonString(json, vm.getUser6(), vm.getPriority6());
				json = jsonString(json, vm.getUser7(), vm.getPriority7());
				json = jsonString(json, vm.getUser8(), vm.getPriority8());

				json = "{root:[" + json + "]}";
				out.print(json);
				System.out.println(json);
			}
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
