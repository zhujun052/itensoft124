package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.itensoft.ItensoftSession;
import com.itensoft.common.DocerMessageHelper;
import com.itensoft.common.UTF8String;

public class DocerGetNewMessage extends HttpServlet
{

	/**
	 * Constructor of the object.
	 */
	public DocerGetNewMessage()
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

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("UserName");
		if (userName !=null){
			userName = UTF8String.toString(userName);
		}
		
		String result = doGetMessage(userName);
		out.print(result);

		out.flush();
		out.close();
	}

	private String doGetMessage(String userName)
	{
		Session s = ItensoftSession.getSession();
		try
		{
		String sql = "select a.Code,a.ClientId,b.Name,a.VirtualManager,a.SessionId,a.Action,a.Note,a.Readed "
					+ "from DocerMessage a join [Group] b on a.ClientId=b.HardId "
					+ "where a.Docer=? and a.Readed=? order by [DateTime]";
			SQLQuery query = s.createSQLQuery(sql);
			query.setParameter(0, userName);
			query.setParameter(1, "0");

			List<Object[]> list = query.list();

			String result = DocerMessageHelper.message2XML(list);
			ItensoftSession.closeSession();
			return result;

		} catch (Exception ex)
		{
			ItensoftSession.closeSession();
			ex.printStackTrace();
			return ex.getMessage();
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
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException
	{
		// Put your code here
	}

}
