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
import com.itensoft.ManagerMessage;

public class ManagerSetMessageStatus extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ManagerSetMessageStatus() {
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
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String strcode = request.getParameter("Code");
		String strstatus = request.getParameter("Status");
		
		Integer code = Integer.parseInt(strcode);
		Integer status = Integer.parseInt(strstatus);
		
		
		String outMsg = "OK";
		Session s = ItensoftSession.getSession();
		Transaction tx = s.beginTransaction();
		try{
			ManagerMessage msg =(ManagerMessage) s.get(ManagerMessage.class,code);
			if(msg != null)
			{
				msg.setStatus(status);
				s.update(msg);
				s.flush();
			}
			
			tx.commit();
			
		}catch(Exception e)
		{
			tx.rollback();
			e.printStackTrace();
			outMsg = "ERROR";
		}
		
		out.print(outMsg);
		
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
