package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itensoft.DocerMessage;
import com.itensoft.ItensoftSession;

public class DocerSetMessageStatus extends HttpServlet
{

	/**
	 * Constructor of the object.
	 */
	public DocerSetMessageStatus()
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

		String code = request.getParameter("Code");
		String status = request.getParameter("Status");
		
		out.print(doSetStatus(code, status));

		out.flush();
		out.close();
	}

	private String doSetStatus(String code, String status)
	{
		List<String> list = new ArrayList<String>();
		list.add("0");
		list.add("1");
		list.add("2");
		list.add("3");

		if (!list.contains(status))
			return "Unknown status.";

		Session s = ItensoftSession.getSession();
		Transaction tx = s.beginTransaction();
		try
		{
			DocerMessage msg = (DocerMessage) s.get(DocerMessage.class, Integer.parseInt(code));
			if(msg == null)
				return "Message(ID:" + code + ") not exists!";
			
			msg.setReaded(status);
			s.update(msg);
			s.flush();
			tx.commit();
			ItensoftSession.closeSession();
			
			return "OK";
		} catch (Exception ex)
		{
			tx.rollback();
			ItensoftSession.closeSession();
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
