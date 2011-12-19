package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itensoft.ItensoftSession;
import com.itensoft.VirtualManager;
import com.itensoft.common.UTF8String;

public class DeleteVirtualManager extends HttpServlet
{

	/**
	 * Constructor of the object.
	 */
	public DeleteVirtualManager()
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

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String managerName = request.getParameter("manager");
		//if(managerName != null)
		//	managerName = UTF8String.toString(managerName);
		if (!((managerName == null) | (managerName.equals(""))))
		{
			Session s = ItensoftSession.getSession();
			VirtualManager manager = (VirtualManager) s.get(
					VirtualManager.class, managerName);
			if (!(manager == null))
			{
				Transaction tx = s.beginTransaction();
				try
				{
					s.delete(manager);
					s.flush();
					tx.commit();
					out.print("{success:true,info:'Delete virtual manager success!'}");
					
				}catch(Exception e)
				{
					tx.rollback();
					out.print("{success:false,error:'" + e.getMessage());
					response.setStatus(HttpServletResponse.SC_EXPECTATION_FAILED);		
				}
			}
			ItensoftSession.closeSession();			
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
