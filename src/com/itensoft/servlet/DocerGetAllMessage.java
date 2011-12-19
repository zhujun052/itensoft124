package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.itensoft.ItensoftSession;
import com.itensoft.common.DocerMessageHelper;
import com.itensoft.common.UTF8String;

public class DocerGetAllMessage extends HttpServlet
{

	/**
	 * Constructor of the object.
	 */
	public DocerGetAllMessage()
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
		if (userName!=null){
			userName = UTF8String.toString(userName);
		}
		String startDateTime = request.getParameter("StartDateTime");
		String stopDateTime = request.getParameter("StopDateTime");
		String orderby = request.getParameter("OrderbyDateTime");

		String result = doGetMessage(userName, startDateTime, stopDateTime,orderby);

		out.print(result);

		out.flush();
		out.close();
	}

	private String doGetMessage(String userName, String startDateTime,
			String stopDateTime, String orderBy)
	{

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Session s = ItensoftSession.getSession();
		try
		{
			//startDateTime = sdf.format(sdf.parse(startDateTime + " 00:00:00"));
			//stopDateTime = sdf.format(sdf.parse(stopDateTime + " 23:59:59"));

/*			String sql = "select a.Code,a.ClientId,b.Name,a.VirtualManager,a.SessionId,a.Action,a.Note "
					+ "from DocerMessage a join [Group] b on a.ClientId=b.HardId "
					+ "where a.Docer='" + userName + "' and ([DateTime] between '" + startDateTime 
					+ "' and '" + stopDateTime + "') order by [DateTime]";
					*/
			String sql = "select a.Code,a.ClientId,b.Name,a.VirtualManager,a.SessionId,a.Action,a.Note,a.Readed "
					+ "from DocerMessage a join [Group] b on a.ClientId=b.HardId "
					+ "where a.Docer=? and ([DateTime] between ? and ?) order by [DateTime]";
			if ("DESC".equals(orderBy))
				sql += " DESC";
			else
				sql += " ASC";
			SQLQuery query = s.createSQLQuery(sql);
			query.setParameter(0, userName);
			query.setParameter(1, sdf.parse(startDateTime));
			query.setParameter(2, sdf.parse(stopDateTime));

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
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException
	{
		// Put your code here
	}

}
