package com.itensoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itensoft.ClientMessage;
import com.itensoft.ItensoftSession;
import com.itensoft.Log;
import com.itensoft.common.UTF8String;

public class DocerResponse extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public DocerResponse() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	private int getActionId(String actionName) {
		if (actionName == null)
			return -1;
		// 0解密、1打包、2调整权限、3消息（未用）
		if ("解密".equals(actionName))
			return 0;
		if ("打包".equals(actionName))
			return 1;
		if ("调整权限".equals(actionName))
			return 2;
		if ("消息".equals(actionName))
			return 3;

		return -1;
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
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
	
		
		String virtualName = request.getParameter("VirtualName");
		if (virtualName != null){
			virtualName = UTF8String.toString(virtualName);
		}			
		String clientId = request.getParameter("ClientId");
		if (clientId!=null){
			clientId = UTF8String.toString(clientId);
		}			
		String sessionId = request.getParameter("SessionId");
		String result = request.getParameter("Result");
		
		Session s = ItensoftSession.getSession();
		Query query = s.createQuery("from Log where ClientId=? and SessionId=?").setParameter(0, clientId).setParameter(1, sessionId);
		List<Log> list = query.list();
		Log log;
		
		if(list.isEmpty())
		{
			out.print("Process message not find!");
			out.flush();
			out.close();
			return;
		}
		
		log = list.get(0);
		log.setRQ3(new Date());
		if("0".equals(result))
			log.setResult2("拒绝");
		else
			log.setResult2("同意");
		
		ClientMessage cmsg = new ClientMessage();
		cmsg.setCId(clientId);
		cmsg.setSessionId(sessionId);
		cmsg.setFrom(log.getDC());
		cmsg.setFromRole(1);
		cmsg.setAction(getActionId(log.getAction()));
		cmsg.setRD("F");
		if("0".equals(result))
			cmsg.setNote("解密请求被拒绝了");
		else
			cmsg.setNote("解密请求已通过");
		cmsg.setRQ(new Date());

		cmsg.setResult(Integer.parseInt(result));
		Transaction tx =s.beginTransaction();
		try
		{
			
			s.update(log);
			s.save(cmsg);
			s.flush();
			tx.commit();
			
		}catch(Exception ex)
		{
			tx.rollback();
			out.print(ex.getMessage());
			out.close();
			ex.printStackTrace();
		}
		
		ItensoftSession.closeSession();		
		
		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
