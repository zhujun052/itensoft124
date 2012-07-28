package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;

import com.itensoft.GroupManager;
import com.itensoft.ItensoftSession;
import com.itensoft.User;
import com.itensoft.VirtualManager;
import com.itensoft.VirtualManagerDocer;
import com.itensoft.common.ItensoftEnv;
import com.itensoft.common.UTF8String;

public class DeleteManagerUser extends HttpServlet
{

	/**
	 * Constructor of the object.
	 */
	public DeleteManagerUser()
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
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String virtualManager = request.getParameter("user");
		//if(virtualManager != null)
		//	virtualManager = UTF8String.toString(virtualManager);
		if(!((virtualManager == null) | (virtualManager.equals(""))))
		{
			Session s = ItensoftSession.getSession();
			VirtualManager vm =(VirtualManager) s.get(VirtualManager.class, virtualManager);
			if(vm != null)
			{
				Transaction tx = s.beginTransaction();
				try
				{
					s.delete(vm);
					String hsql = "from GroupManager where VirtualManagerName=?";
					List<GroupManager> list1 = s.createQuery(hsql).setParameter(0, vm.getName()).list();
					for(Iterator<GroupManager> it = list1.iterator(); it.hasNext();){
						s.delete(it.next());
					}
					
					hsql = "from VirtualManagerDocer where VitrualManagerName=?";
					List<VirtualManagerDocer> list2 = s.createQuery(hsql).setParameter(0, vm.getName()).list();
					for(Iterator<VirtualManagerDocer> it = list2.iterator(); it.hasNext();){
						s.delete(it.next());
					}

					s.flush();
					tx.commit();
					ItensoftEnv.reloadOnlineVirtualManagers();
					out.print("{success:true,info:'Delete virtual manager success!'}");
				}catch(Exception e)
				{
					tx.rollback();
					out.print("{success:false,error:'" + e.getMessage()+ "'");
					e.printStackTrace();
					response.setStatus(HttpServletResponse.SC_EXPECTATION_FAILED);
				}
			}else{
				out.print("{success:false, error:'" + virtualManager + " not exist!'}");
			}
				
			ItensoftSession.closeSession();
			
		}
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
